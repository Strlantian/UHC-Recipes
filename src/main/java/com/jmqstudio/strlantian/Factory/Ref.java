package com.jmqstudio.strlantian.Factory;

import com.jmqstudio.strlantian.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public final class Ref
{
    public static FileConfiguration cfg = Main.inst.getConfig();

    public static String rcp = "Detailed Recipe Page";
    public static String pg1T = "UHCRecipes Page 1";
    public static String pg2T = "UHCRecipes Page 2";
    public static String pg3T = "UHCRecipes Page 3";
    public static String pg4T = "UHCRecipes Page 4";

    public static ItemStack close = new ItemStack(Material.BARRIER);
    public static ItemStack ref1 = new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS);
    public static ItemStack ref2 = new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS);
    public static ItemStack ref3 = new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS);
    public static ItemStack ref4 = new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS);

    static
    {
        ItemMeta clsim = close.getItemMeta();
        ItemMeta im1 = ref1.getItemMeta();
        ItemMeta im2 = ref2.getItemMeta();
        ItemMeta im3 = ref3.getItemMeta();
        ItemMeta im4 = ref4.getItemMeta();

        assert clsim != null;
        clsim.setDisplayName(ChatColor.RED + "Close This Page");
        clsim.addEnchant(Enchantment.DURABILITY, 1, true);
        clsim.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        assert im1 != null;
        im1.setDisplayName("Page 1");
        assert im2 != null;
        im2.setDisplayName("Page 2");
        assert im3 != null;
        im3.setDisplayName("Page 3");
        assert im4 != null;
        im4.setDisplayName("Page 4");

        close.setItemMeta(clsim);
        ref1.setItemMeta(im1);
        ref2.setItemMeta(im2);
        ref3.setItemMeta(im3);
        ref4.setItemMeta(im4);
    }
}
