package com.jmqstudio.strlantian.Factory;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import static com.jmqstudio.strlantian.Factory.Ref.*;

public final class CreatePage
{
    private static final ItemStack g = new ItemStack(Material.GRAY_STAINED_GLASS, 1);
    public static Inventory createViewPage(String title)
    {
        Inventory inv = Bukkit.createInventory(null, 6 * 9, title);
        inv.setItem(0, g);
        inv.setItem(1, g);
        inv.setItem(2, g);
        inv.setItem(3, g);
        inv.setItem(4, g);
        inv.setItem(5, g);
        inv.setItem(6, g);
        inv.setItem(7, g);
        inv.setItem(8, g);

        inv.setItem(9, g);
        inv.setItem(17, g);
        inv.setItem(18, g);
        inv.setItem(26, g);
        inv.setItem(27, g);
        inv.setItem(35, g);

        inv.setItem(36, g);
        inv.setItem(37, g);
        inv.setItem(38, g);
        inv.setItem(39, g);
        inv.setItem(40, g);
        inv.setItem(41, g);
        inv.setItem(42, g);
        inv.setItem(43, g);
        inv.setItem(44, g);

        inv.setItem(45, g);
        inv.setItem(46, ref1);
        inv.setItem(47, ref2);
        inv.setItem(48, g);
        inv.setItem(49, close);
        inv.setItem(50, g);
        inv.setItem(51, ref3);
        inv.setItem(52, ref4);
        inv.setItem(53, g);
        return inv;
    }
    public static Inventory createRecipePage(ItemStack result)
    {
        Inventory inv = Bukkit.createInventory(null, 6 * 9, rcp);
        inv.setItem(0, g);
        inv.setItem(1, g);
        inv.setItem(2, g);
        inv.setItem(3, g);
        inv.setItem(4, g);
        inv.setItem(5, g);
        inv.setItem(6, g);
        inv.setItem(7, g);
        inv.setItem(8, g);
        inv.setItem(9, g);
        inv.setItem(10, g);
        inv.setItem(11, g);



        inv.setItem(15, g);
        inv.setItem(16, g);
        inv.setItem(17, g);
        inv.setItem(18, g);
        inv.setItem(19, g);
        inv.setItem(20, g);



        inv.setItem(24, g);
        inv.setItem(25, g);
        inv.setItem(26, g);
        inv.setItem(27, g);
        inv.setItem(28, g);
        inv.setItem(29, g);



        inv.setItem(33, g);
        inv.setItem(34, g);
        inv.setItem(35, g);
        inv.setItem(36, g);
        inv.setItem(37, g);
        inv.setItem(38, g);
        inv.setItem(39, g);
        inv.setItem(40, result);
        inv.setItem(41, g);
        inv.setItem(42, g);
        inv.setItem(43, g);
        inv.setItem(44, g);
        inv.setItem(45, g);
        inv.setItem(46, g);
        inv.setItem(47, g);
        inv.setItem(48, g);
        inv.setItem(49, close);
        inv.setItem(50, g);
        inv.setItem(51, g);
        inv.setItem(52, g);
        inv.setItem(53, g);
        return inv;
    }
}
