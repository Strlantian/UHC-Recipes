package com.jmqstudio.strlantian.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import static com.jmqstudio.strlantian.Factory.Items.and;
import static com.jmqstudio.strlantian.Factory.Items.stick;
import static com.jmqstudio.strlantian.Factory.Recipes.*;

public final class ItemEffects implements Listener
{
    @EventHandler
    public void retItems(CraftItemEvent e)
    {
        CommandSender cs = Bukkit.getConsoleSender();
        Recipe rc = e.getRecipe();
        Player pl = (Player) e.getWhoClicked();
        Inventory inv = pl.getInventory();
        String name = pl.getName();
        if(rc.equals(netArtrc)
                || rc.equals(sevBotrc)
                || rc.equals(cBowrc)
                || rc.equals(frsrc)
                || rc.equals(caBorc)
                || rc.equals(legrc)
                || rc.equals(scyrc)
                || rc.equals(rodrc)
                || rc.equals(flarc))
        {
            inv.addItem(new ItemStack(Material.BUCKET, 1));
        }
        if(rc.equals(obsrc)
                || rc.equals(drAxerc))
        {
            inv.addItem(new ItemStack(Material.BUCKET, 2));
        }
    }

    @EventHandler
    public void hldItem(PlayerItemHeldEvent e)
    {
        Player pl = e.getPlayer();
        ItemStack mItem = pl.getEquipment().getItemInMainHand();
        ItemStack oItem = pl.getEquipment().getItemInOffHand();
        PotionEffect spd1 = new PotionEffect(PotionEffectType.SPEED, 1, 0, true);
        PotionEffect res1 = new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1, 0, true);
        while(mItem.equals(and) || oItem.equals(and))
        {
            pl.addPotionEffect(spd1);
            pl.addPotionEffect(res1);
        }
        while(mItem.equals(stick))
        {
            pl.addPotionEffect(spd1);
        }
    }
}
