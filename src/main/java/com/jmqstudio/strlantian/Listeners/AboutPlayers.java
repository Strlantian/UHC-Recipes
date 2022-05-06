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

import java.util.Objects;

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
    public void onDie(PlayerDeathEvent e)
    {
        Player pl = e.getEntity();
        Entity killer = Objects.requireNonNull(pl.getKiller());
        ItemStack head = Items.makeHead(pl, killer);
        Inventory inv = pl.getInventory();
        inv.addItem(head);
    }
}
