package com.jmqstudio.strlantian.Factory;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import static com.jmqstudio.strlantian.Factory.Ref.*;

public final class CreatePage
{
    private static final Inventory recipePage = Bukkit.createInventory(null, 6 * 9, rcp);
    private static final ItemStack g = new ItemStack(Material.GRAY_STAINED_GLASS, 1);
    static
    {
        ItemMeta im = g.getItemMeta();
        im.setDisplayName(ChatColor.GRAY + "*");
        g.setItemMeta(im);
    }
    private static final ItemStack air = new ItemStack(Material.AIR, 1);

    public static Inventory createViewPage(String title)
    {
        Inventory viewPage = Bukkit.createInventory(null, 6 * 9, title);
        viewPage.setItem(0, g);
        viewPage.setItem(1, g);
        viewPage.setItem(2, g);
        viewPage.setItem(3, g);
        viewPage.setItem(4, g);
        viewPage.setItem(5, g);
        viewPage.setItem(6, g);
        viewPage.setItem(7, g);
        viewPage.setItem(8, g);

        viewPage.setItem(9, g);
        viewPage.setItem(17, g);
        viewPage.setItem(18, g);
        viewPage.setItem(26, g);
        viewPage.setItem(27, g);
        viewPage.setItem(35, g);

        viewPage.setItem(36, g);
        viewPage.setItem(37, g);
        viewPage.setItem(38, g);
        viewPage.setItem(39, g);
        viewPage.setItem(40, g);
        viewPage.setItem(41, g);
        viewPage.setItem(42, g);
        viewPage.setItem(43, g);
        viewPage.setItem(44, g);

        viewPage.setItem(45, g);
        viewPage.setItem(46, ref1);
        viewPage.setItem(47, ref2);
        viewPage.setItem(48, g);
        viewPage.setItem(49, close);
        viewPage.setItem(50, g);
        viewPage.setItem(51, ref3);
        viewPage.setItem(52, ref4);
        viewPage.setItem(53, g);
        return viewPage;
    }
    public static Inventory createRecipePage(ItemStack result)
    {
        recipePage.setItem(0, g);
        recipePage.setItem(1, g);
        recipePage.setItem(2, g);
        recipePage.setItem(3, g);
        recipePage.setItem(4, g);
        recipePage.setItem(5, g);
        recipePage.setItem(6, g);
        recipePage.setItem(7, g);
        recipePage.setItem(8, g);
        recipePage.setItem(9, g);
        recipePage.setItem(10, g);
        recipePage.setItem(11, g);



        recipePage.setItem(15, g);
        recipePage.setItem(16, g);
        recipePage.setItem(17, g);
        recipePage.setItem(18, g);
        recipePage.setItem(19, g);
        recipePage.setItem(20, g);



        recipePage.setItem(24, g);
        recipePage.setItem(25, g);
        recipePage.setItem(26, g);
        recipePage.setItem(27, g);
        recipePage.setItem(28, g);
        recipePage.setItem(29, g);



        recipePage.setItem(33, g);
        recipePage.setItem(34, g);
        recipePage.setItem(35, g);
        recipePage.setItem(36, g);
        recipePage.setItem(37, g);
        recipePage.setItem(38, g);
        recipePage.setItem(39, g);
        recipePage.setItem(40, result);
        recipePage.setItem(41, g);
        recipePage.setItem(42, g);
        recipePage.setItem(43, g);
        recipePage.setItem(44, g);
        recipePage.setItem(45, g);
        recipePage.setItem(46, g);
        recipePage.setItem(47, g);
        recipePage.setItem(48, g);
        recipePage.setItem(49, close);
        recipePage.setItem(50, g);
        recipePage.setItem(51, g);
        recipePage.setItem(52, g);
        recipePage.setItem(53, g);
        return recipePage;
    }
    public static void cleanRecipePage()
    {
        recipePage.setItem(12 ,air);
        recipePage.setItem(13 ,air);
        recipePage.setItem(14, air);
        recipePage.setItem(21 ,air);
        recipePage.setItem(22 ,air);
        recipePage.setItem(23 ,air);
        recipePage.setItem(30 ,air);
        recipePage.setItem(31 ,air);
        recipePage.setItem(32 ,air);
        recipePage.setItem(40, air);
    }
}
