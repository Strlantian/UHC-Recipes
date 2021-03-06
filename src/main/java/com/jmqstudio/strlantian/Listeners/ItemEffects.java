package com.jmqstudio.strlantian.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.meta.CompassMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Arrays;
import java.util.Objects;

import static com.jmqstudio.strlantian.Factory.Items.and;
import static com.jmqstudio.strlantian.Factory.Items.ht;
import static com.jmqstudio.strlantian.Factory.Recipes.*;
import static com.jmqstudio.strlantian.Main.inst;

public final class ItemEffects implements Listener
{
    @EventHandler
    public void returnItems(CraftItemEvent e)
    {
        Recipe rc = e.getRecipe();
        Player pl = (Player) e.getWhoClicked();
        Inventory inv = pl.getInventory();
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
    public void holdItems(PlayerItemHeldEvent e)
    {
        Player pl = e.getPlayer();
        ItemStack mItem = Objects.requireNonNull(pl.getEquipment()).getItemInMainHand();
        ItemStack oItem = pl.getEquipment().getItemInOffHand();
        PotionEffect spd1 = new PotionEffect(PotionEffectType.SPEED, 1, 0, true);
        PotionEffect res1 = new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1, 0, true);
        while(mItem.equals(and) || oItem.equals(and))
        {
            pl.addPotionEffect(spd1);
            pl.addPotionEffect(res1);
        }
    }

    /*
    @EventHandler
    public void apprenticeAssets(CraftItemEvent e)
    {
        Player pl = (Player) e.getWhoClicked();
        Recipe recipe = e.getRecipe();
        ItemStack result = e.getCurrentItem();
        if(recipe.equals(appSworc))
        {

        }
    }
    Still in coding...
     */
    @EventHandler
    public void compassAssets(CraftItemEvent e)
    {
        new BukkitRunnable()
        {
            @Override
            public void run()
            {
                Player user = (Player) e.getWhoClicked();
                Recipe recipe = e.getRecipe();
                int num = Bukkit.getOnlinePlayers().size();
                if(recipe.equals(htrc))
                {
                    if(num <= 1)
                    {
                        user.sendMessage(ChatColor.RED + "??????????????????????????????");
                        user.sendMessage(ChatColor.RED + "???????????????????????????????????????!");
                        e.setCancelled(true);
                    }
                    else
                    {
                        Player target = Bukkit.getPlayer("");
                        while(Objects.equals(target, user))
                        {
                            target = Bukkit.getPlayer("");
                            if(!Objects.equals(target, user))
                            {
                                break;
                            }
                        }
                        ItemStack compass = recipe.getResult();
                        CompassMeta im = (CompassMeta) compass.getItemMeta();
                        assert im != null;
                        assert target != null;
                        im.setLore(Arrays.asList("", ChatColor.GREEN + "??????: " + target.getName(), ""));
                        while(!user.isDead() && !target.isDead() && target.isOnline())
                        {
                            Location loc = target.getLocation();
                            im.setLodestone(loc);
                            compass.setItemMeta(im);
                            if(user.isDead() || target.isDead())
                            {
                                user.getInventory().remove(ht);
                                if(user.isDead())
                                {
                                    user.sendMessage(ChatColor.RED + "??????????????????????????????");
                                }
                                if(target.isDead())
                                {
                                    user.sendMessage(ChatColor.GREEN + "????????????, ???????????????????????????");
                                }
                                break;
                            }
                        }
                    }
                }
            }
        }.runTask(inst);
    }
}