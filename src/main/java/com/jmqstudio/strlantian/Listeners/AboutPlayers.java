package com.jmqstudio.strlantian.Listeners;

import com.jmqstudio.strlantian.Factory.CreatePage;
import com.jmqstudio.strlantian.Factory.Items;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import static com.jmqstudio.strlantian.Factory.Ref.rcp;

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

    @EventHandler
    public void onCloseInventory(InventoryCloseEvent e)
    {
        String title = e.getView().getTitle();
        if(title.equals(rcp))
        {
            CreatePage.cleanRecipePage();
        }
    }
}
