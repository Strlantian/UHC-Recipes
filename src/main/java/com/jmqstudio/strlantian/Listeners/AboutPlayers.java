package com.jmqstudio.strlantian.Listeners;

import com.jmqstudio.strlantian.Factory.Items;
import com.jmqstudio.strlantian.Orientation.CreateBar;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.Scoreboard;

import java.util.Arrays;
import java.util.Objects;

import static com.jmqstudio.strlantian.Main.inst;

public final class AboutPlayers implements Listener
{
    @EventHandler
    public void onJoin(PlayerJoinEvent e)
    {
        Player pl = e.getPlayer();
        pl.sendMessage(ChatColor.GRAY + "UHCRecipes插件已安装!");
        pl.sendMessage(ChatColor.GRAY + "请用/uhchelp来查看该插件的帮助");
        pl.sendMessage(ChatColor.GRAY + "作者求求了你们快看吧有配方改了啊啊啊啊啊");
        Scoreboard showHealth = Objects.requireNonNull(Bukkit.getScoreboardManager()).getNewScoreboard();
        Scoreboard tabHealth = Objects.requireNonNull(Bukkit.getScoreboardManager().getNewScoreboard());

        new BukkitRunnable()
        {
            @Override
            public void run()
            {
                while(pl.isOnline())
                {
                    pl.setScoreboard(CreateBar.getHealthBar(pl, showHealth));
                    pl.setScoreboard(CreateBar.getTabHealth(pl, tabHealth));
                }
            }
        }.runTask(inst);
    }
    @EventHandler
    public void headAssets(PlayerDeathEvent e)
    {
        Player pl = e.getEntity();
        Inventory inv = pl.getInventory();
        ItemStack head = Items.makeHead(pl);
        try
        {
            Entity killer = pl.getKiller();
            assert killer != null;
            String kname = killer.getName();
            SkullMeta im = (SkullMeta) head.getItemMeta();
            assert im != null;
            im.setLore(Arrays.asList("", ChatColor.GREEN + "击杀者: " + kname));
            head.setItemMeta(im);
        }
        catch(Exception exc)
        {
            exc.printStackTrace();
            System.out.println(ChatColor.GREEN + "这不是个错误, 这是指玩家头颅没有击杀者");
        }
        inv.addItem(head);
    }
}
