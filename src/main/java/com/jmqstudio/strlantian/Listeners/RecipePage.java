package com.jmqstudio.strlantian.Listeners;

import com.jmqstudio.strlantian.Factory.CreatePage;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

import static com.jmqstudio.strlantian.Factory.Items.*;
import static com.jmqstudio.strlantian.Factory.Ref.*;

public final class RecipePage implements Listener
{
    @EventHandler
    public void recipePage(InventoryClickEvent e)
    {
        final ItemStack I = new ItemStack(Material.AIR);
        ItemStack item;
        Objects.requireNonNull(item = e.getCurrentItem());
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
                pl.openInventory(CreatePage.createRecipePage(item, IRON, IRON, IRON, IRON, TORCH, IRON, I, I, I));
            }
            if(Objects.equals(item, appSwo))
            {
                pl.openInventory(CreatePage.createRecipePage(item, I, RBLOCK, I, I, new ItemStack(Material.IRON_SWORD), I, I, RBLOCK, I));
            }
            if(Objects.equals(item, appBow))
            {
                pl.openInventory(CreatePage.createRecipePage(item, TORCH, STR, I, TORCH, I, STR, TORCH, STR, I));
            }
            if(Objects.equals(item, appShield))
            {
                pl.openInventory(CreatePage.createRecipePage(item, PLKS, IRON, PLKS, PLKS, RBLOCK, PLKS, TORCH, PLKS, TORCH));
            }
            if(Objects.equals(item, vpSwo))
            {
                pl.openInventory(CreatePage.createRecipePage(item, I, BONE, I, I, new ItemStack(Material.IRON_SWORD), I, I, new ItemStack(Material.ROTTEN_FLESH), I));
            }
            if(Objects.equals(item, sharpB))
            {
                pl.openInventory(CreatePage.createRecipePage(item, FLINT, I, I, I, PAPER, PAPER, I, PAPER, new ItemStack(Material.IRON_SWORD)));
            }
            if(Objects.equals(item, powB))
            {
                pl.openInventory(CreatePage.createRecipePage(item, FLINT, I, I, I, PAPER, PAPER, I, PAPER, BONE));
            }
            if(Objects.equals(item, dragSwo))
            {
                pl.openInventory(CreatePage.createRecipePage(item, I, POWDER, I, I, new ItemStack(Material.DIAMOND_SWORD), I, OBSIDIAN, POWDER, OBSIDIAN));
            }
            if(Objects.equals(item, protB))
            {
                pl.openInventory(CreatePage.createRecipePage(item, IRON, I, I, I, PAPER, PAPER, I, PAPER, IRON));
            }
        }
    }
}
