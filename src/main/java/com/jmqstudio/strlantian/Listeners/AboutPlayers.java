package com.jmqstudio.strlantian.Listeners;

import com.jmqstudio.strlantian.Factory.Items;
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

import java.util.Arrays;

public final class AboutPlayers implements Listener
{
    @EventHandler
    public void onJoin(PlayerJoinEvent e)
    {
        Player pl = e.getPlayer();
        pl.sendMessage(ChatColor.GRAY + "UHCRecipes插件已安装!");
        pl.sendMessage(ChatColor.GRAY + "请用/uhchelp来查看该插件的帮助");
        pl.sendMessage(ChatColor.GRAY + "作者求求了你们快看吧有配方改了啊啊啊啊啊");
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
