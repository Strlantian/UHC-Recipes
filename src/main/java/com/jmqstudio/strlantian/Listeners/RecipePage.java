package com.jmqstudio.strlantian.Listeners;

import com.jmqstudio.strlantian.Factory.CreatePage;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

import static com.jmqstudio.strlantian.Factory.Items.appHel;
import static com.jmqstudio.strlantian.Factory.RecipeItems.IRON;
import static com.jmqstudio.strlantian.Factory.RecipeItems.TORCH;
import static com.jmqstudio.strlantian.Factory.Ref.*;

public final class RecipePage implements Listener
{
    @EventHandler
    public void recipePage(InventoryClickEvent e)
    {
        ItemStack item = e.getCurrentItem();
        Inventory detail = CreatePage.createRecipePage(item);
        Player pl = (Player) e.getWhoClicked();
        InventoryView inv = pl.getOpenInventory();
        String title = inv.getTitle();
        if(title.equals(pg1T) ||
                title.equals(pg2T) ||
                title.equals(pg3T) ||
                title.equals(pg4T))
        {
            if(Objects.equals(item, appHel))
            {
                detail.setItem(12, IRON);
                detail.setItem(13, IRON);
                detail.setItem(14, IRON);
                detail.setItem(21, IRON);
                detail.setItem(22, TORCH);
                detail.setItem(23, IRON);
            }
            pl.openInventory(detail);
        }
    }
}
