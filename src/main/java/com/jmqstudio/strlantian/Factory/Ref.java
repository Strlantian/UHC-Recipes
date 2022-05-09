package com.jmqstudio.strlantian.Factory;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public final class Ref
{
    /*
     *  What's the Number (Legacy)
     *  ================
     *  | 12 | 13 | 14 |
     *  |--------------|
     *  | 21 | 22 | 23 | ====>> result(created)
     *  |--------------|
     *  | 30 | 31 | 32 |
     *  ================
     */
    public static final ItemStack IRON = new ItemStack(Material.IRON_INGOT);
    public static final ItemStack TORCH = new ItemStack(Material.REDSTONE_TORCH);
    public static final ItemStack RBLOCK = new ItemStack(Material.REDSTONE_BLOCK);
    public static final ItemStack STR = new ItemStack(Material.STRING);
    public static final ItemStack PLKS = new ItemStack(Material.OAK_PLANKS);
    static
    {
        ItemMeta im = PLKS.getItemMeta();
        assert im != null;
        im.setDisplayName(ChatColor.ITALIC + "所有种类的木板");
        PLKS.setItemMeta(im);
    }
    public static final ItemStack BONE = new ItemStack(Material.BONE);
    public static final ItemStack FLINT = new ItemStack(Material.FLINT);
    public static final ItemStack PAPER = new ItemStack(Material.PAPER);
    public static final ItemStack OBSIDIAN = new ItemStack(Material.OBSIDIAN);
    public static final ItemStack POWDER = new ItemStack(Material.BLAZE_POWDER);
    /*
    *
    *
    * ==================分割线=====================
    *
    *
     */
    public static final String RCP = "UHC配方详细页";
    public static final String PG1T = "UHC配方总览 - 1";
    public static final String PG2T = "UHC配方总览 - 2";
    public static final String PG3T = "UHC配方总览 - 3";
    public static final String PG4T = "UHC配方总览 - 4";
    public static final String WHYRUCON = ChatColor.RED + "你控制台凑什么热闹-_-";
    public static final ItemStack CLOSE = new ItemStack(Material.BARRIER);
    public static final ItemStack REF1 = new ItemStack(Material.LIGHT_BLUE_WOOL);
    public static final ItemStack REF2 = new ItemStack(Material.LIGHT_BLUE_WOOL);
    public static final ItemStack REF3 = new ItemStack(Material.LIGHT_BLUE_WOOL);
    public static final ItemStack REF4 = new ItemStack(Material.LIGHT_BLUE_WOOL);

    static
    {
        ItemMeta clsim = CLOSE.getItemMeta();
        ItemMeta im1 = REF1.getItemMeta();
        ItemMeta im2 = REF2.getItemMeta();
        ItemMeta im3 = REF3.getItemMeta();
        ItemMeta im4 = REF4.getItemMeta();

        assert clsim != null;
        clsim.setDisplayName(ChatColor.RED + "关闭此页面");
        clsim.addEnchant(Enchantment.DURABILITY, 1, true);
        clsim.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        assert im1 != null;
        im1.setDisplayName("跳转至第1页");
        assert im2 != null;
        im2.setDisplayName("跳转至第2页");
        assert im3 != null;
        im3.setDisplayName("跳转至第3页");
        assert im4 != null;
        im4.setDisplayName("跳转至第4页");

        CLOSE.setItemMeta(clsim);
        REF1.setItemMeta(im1);
        REF2.setItemMeta(im2);
        REF3.setItemMeta(im3);
        REF4.setItemMeta(im4);
    }
}
