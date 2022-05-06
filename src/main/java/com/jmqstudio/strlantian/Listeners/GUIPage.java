package com.jmqstudio.strlantian.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryView;

import static com.jmqstudio.strlantian.Factory.GUI.*;
import static com.jmqstudio.strlantian.Factory.Ref.*;

public final class GUIPage implements Listener
{
    @EventHandler
    public void click(InventoryClickEvent e)
    {
        Player pl = (Player) e.getWhoClicked();
        InventoryView inv = pl.getOpenInventory();
        String title = inv.getTitle();
        if(title.contains(rcp))
        {
            e.setCancelled(true);
        }
        if(title.equals(pg1T) ||
                title.equals(pg2T) ||
                title.equals(pg3T) ||
                title.equals(pg4T))
        {
            e.setCancelled(true);
            int slot = e.getSlot();
            switch(slot)
            {
                case 46 -> pl.openInventory(pg1);
                case 47 -> pl.openInventory(pg2);
                case 49 -> pl.closeInventory();
                case 51 -> pl.openInventory(pg3);
                case 52 -> pl.openInventory(pg4);
            }
        }
    }
}
