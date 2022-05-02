package com.jmqstudio.strlantian.Listeners;

import com.jmqstudio.strlantian.Factory.Items;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public final class AboutPlayers implements Listener
{
    @EventHandler
    public void onDie(PlayerDeathEvent e)
    {
        Player pl = e.getEntity();
        Player killer = pl.getKiller();
        ItemStack head = Items.makeHead(pl, killer);
        Inventory inv = pl.getInventory();
        inv.addItem(head);
    }
}
