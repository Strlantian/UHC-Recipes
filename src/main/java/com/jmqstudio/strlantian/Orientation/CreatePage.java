package com.jmqstudio.strlantian.Orientation;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import static com.jmqstudio.strlantian.Factory.Ref.*;

public final class CreatePage
{
    private static final ItemStack G = new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS_PANE, 1);
    static
    {
        ItemMeta im = G.getItemMeta();
        assert im != null;
        im.setDisplayName(" ");
        G.setItemMeta(im);
    }

    public static Inventory createViewPage(@Nonnull String title)
    {
        final Inventory VIEWPAGE = Bukkit.createInventory(null, 6 * 9, title);
        VIEWPAGE.setItem(0, G);
        VIEWPAGE.setItem(1, G);
        VIEWPAGE.setItem(2, G);
        VIEWPAGE.setItem(3, G);
        VIEWPAGE.setItem(4, G);
        VIEWPAGE.setItem(5, G);
        VIEWPAGE.setItem(6, G);
        VIEWPAGE.setItem(7, G);
        VIEWPAGE.setItem(8, G);

        VIEWPAGE.setItem(9, G);
        VIEWPAGE.setItem(17, G);
        VIEWPAGE.setItem(18, G);
        VIEWPAGE.setItem(26, G);
        VIEWPAGE.setItem(27, G);
        VIEWPAGE.setItem(35, G);

        VIEWPAGE.setItem(36, G);
        VIEWPAGE.setItem(37, G);
        VIEWPAGE.setItem(38, G);
        VIEWPAGE.setItem(39, G);
        VIEWPAGE.setItem(40, G);
        VIEWPAGE.setItem(41, G);
        VIEWPAGE.setItem(42, G);
        VIEWPAGE.setItem(43, G);
        VIEWPAGE.setItem(44, G);

        VIEWPAGE.setItem(45, G);
        VIEWPAGE.setItem(46, REF1);
        VIEWPAGE.setItem(47, REF2);
        VIEWPAGE.setItem(48, G);
        VIEWPAGE.setItem(49, CLOSE);
        VIEWPAGE.setItem(50, G);
        VIEWPAGE.setItem(51, REF3);
        VIEWPAGE.setItem(52, REF4);
        VIEWPAGE.setItem(53, G);
        return VIEWPAGE;
    }
    public static Inventory createRecipePage(@Nonnull ItemStack result,
                                             @Nullable ItemStack slot1,
                                             @Nullable ItemStack slot2,
                                             @Nullable ItemStack slot3,
                                             @Nullable ItemStack slot4,
                                             @Nullable ItemStack slot5,
                                             @Nullable ItemStack slot6,
                                             @Nullable ItemStack slot7,
                                             @Nullable ItemStack slot8,
                                             @Nullable ItemStack slot9)
    {
        final Inventory RECIPEPAGE = Bukkit.createInventory(null, 6 * 9, RCP);
        RECIPEPAGE.setItem(0, G);
        RECIPEPAGE.setItem(1, G);
        RECIPEPAGE.setItem(2, G);
        RECIPEPAGE.setItem(3, G);
        RECIPEPAGE.setItem(4, G);
        RECIPEPAGE.setItem(5, G);
        RECIPEPAGE.setItem(6, G);
        RECIPEPAGE.setItem(7, G);
        RECIPEPAGE.setItem(8, G);
        RECIPEPAGE.setItem(9, G);
        RECIPEPAGE.setItem(10, G);
        RECIPEPAGE.setItem(11, G);

        RECIPEPAGE.setItem(12, slot1);
        RECIPEPAGE.setItem(13, slot2);
        RECIPEPAGE.setItem(14, slot3);

        RECIPEPAGE.setItem(15, G);
        RECIPEPAGE.setItem(16, G);
        RECIPEPAGE.setItem(17, G);
        RECIPEPAGE.setItem(18, G);
        RECIPEPAGE.setItem(19, G);
        RECIPEPAGE.setItem(20, G);

        RECIPEPAGE.setItem(21, slot4);
        RECIPEPAGE.setItem(22, slot5);
        RECIPEPAGE.setItem(23, slot6);

        RECIPEPAGE.setItem(24, G);
        RECIPEPAGE.setItem(25, G);
        RECIPEPAGE.setItem(26, G);
        RECIPEPAGE.setItem(27, G);
        RECIPEPAGE.setItem(28, G);
        RECIPEPAGE.setItem(29, G);

        RECIPEPAGE.setItem(30, slot7);
        RECIPEPAGE.setItem(31, slot8);
        RECIPEPAGE.setItem(32, slot9);

        RECIPEPAGE.setItem(33, G);
        RECIPEPAGE.setItem(34, G);
        RECIPEPAGE.setItem(35, G);
        RECIPEPAGE.setItem(36, G);
        RECIPEPAGE.setItem(37, G);
        RECIPEPAGE.setItem(38, G);
        RECIPEPAGE.setItem(39, G);
        RECIPEPAGE.setItem(40, result);
        RECIPEPAGE.setItem(41, G);
        RECIPEPAGE.setItem(42, G);
        RECIPEPAGE.setItem(43, G);
        RECIPEPAGE.setItem(44, G);
        RECIPEPAGE.setItem(45, G);
        RECIPEPAGE.setItem(46, G);
        RECIPEPAGE.setItem(47, G);
        RECIPEPAGE.setItem(48, G);
        RECIPEPAGE.setItem(49, CLOSE);
        RECIPEPAGE.setItem(50, G);
        RECIPEPAGE.setItem(51, G);
        RECIPEPAGE.setItem(52, G);
        RECIPEPAGE.setItem(53, G);
        return RECIPEPAGE;
    }
}
