package com.jmqstudio.strlantian.Factory;

import com.jmqstudio.strlantian.Main;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;

import static com.jmqstudio.strlantian.Factory.Items.*;

public final class Recipes
{
    public static FurnaceRecipe leapkrc = new FurnaceRecipe(new NamespacedKey(Main.inst, "Leather_Rush"),new ItemStack(Material.LEATHER, 1), Material.ROTTEN_FLESH, (float) 0.8, 200);
    public static ShapedRecipe appHelrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Apprentice_Helmet"), appHel);
    public static ShapedRecipe appSworc = new ShapedRecipe(new NamespacedKey(Main.inst, "Apprentice_Sword"), appSwo);
    public static ShapedRecipe appBowrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Apprentice_Bow"), appBow);
    public static ShapedRecipe appShieldrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Apprentice_Shield"), appShield);
    public static ShapedRecipe vpSworc = new ShapedRecipe(new NamespacedKey(Main.inst, "Vorpal_Sword"), vpSwo);
    public static ShapedRecipe sharpBrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Book_of_Sharpening"), sharpB);
    public static ShapedRecipe powBrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Book_of_Power"), powB);
    public static ShapedRecipe dragSworc = new ShapedRecipe(new NamespacedKey(Main.inst, "Dragon_Axe"), dragSwo);
    public static ShapedRecipe protBrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Book_of_Protection"), protB);
    public static ShapedRecipe projBrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Book_of_Projectile"), projB);
    public static ShapedRecipe dragCherc = new ShapedRecipe(new NamespacedKey(Main.inst, "Dragon_Armour"), dragChe);
    public static ShapedRecipe dustrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Dust_of_Light"), dust);
    public static ShapedRecipe wartrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Brewing_Artifact"), wart);
    public static ShapedRecipe necrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Nector"), nec);
    public static ShapedRecipe netArtrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Nether_Artifact"), netArt);
    public static ShapedRecipe steakrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Delicious_Meal"), steak);
    public static ShapedRecipe tourc = new ShapedRecipe(new NamespacedKey(Main.inst, "Potion_of_Toughness"), tou);
    public static ShapedRecipe spkCherc = new ShapedRecipe(new NamespacedKey(Main.inst, "Spiked_Armour"), spkChe);
    public static ShapedRecipe sevBotrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Seven_league_Boots"), sevBot);
    public static ShapedRecipe ipkrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Iron_Pack"), ipk);
    public static ShapelessRecipe obsrc = new ShapelessRecipe(new NamespacedKey(Main.inst, "Obsidian"), obs);
    public static ShapedRecipe tarnrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Tarnhelm"), tarn);
    public static ShapedRecipe fortPicrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Philosophers_Pickaxe"), fortPic);
    public static ShapedRecipe exprc = new ShapedRecipe(new NamespacedKey(Main.inst, "Enlightening_Pack"), exp);
    public static ShapedRecipe ltAnvrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Light_Anvil"), ltAnv);
    public static ShapedRecipe ltEncrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Light_Enchanting_Table"), ltEnc);
    public static ShapedRecipe thoBrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Book_of_Thoth"), thoB);
    public static ShapelessRecipe wisArc = new ShapelessRecipe(new NamespacedKey(Main.inst, "Eves_Temption"), wisA);
    public static ShapedRecipe melonrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Healing_Fruit"), melon);
    public static ShapedRecipe aspPtrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Potion_of_Absorption"), aspPt);
    public static ShapedRecipe gApplerc = new ShapedRecipe(new NamespacedKey(Main.inst, "Light_Apple"), gApple);
    public static ShapedRecipe hdrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Golden_Head"), hd);
    public static ShapedRecipe pBoxrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Pandoras_Box"), pBox);
    public static ShapedRecipe panPrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Panacea"), panP);
    public static ShapedRecipe cBowrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Cupids_Bow"), cBow);
    public static ShapedRecipe arrowrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Arrow_Economy"), arrow);
    public static ShapedRecipe sadrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Saddle"), sad);
    public static ShapelessRecipe velPtrc = new ShapelessRecipe(new NamespacedKey(Main.inst, "Potion_of_Velocity"), velPt);
    public static ShapedRecipe ferrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Fenrir"), fer);
    public static ShapedRecipe forgerc = new ShapedRecipe(new NamespacedKey(Main.inst, "Forge"), forge);
    public static ShapedRecipe qkPicrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Quick_Pick"), qkPic);
    public static ShapedRecipe lumrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Lumberjacks_Axe"), lum);
    public static ShapedRecipe eBookrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Enhancement_Book"), eBook);
    public static ShapedRecipe gpkrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Gold_Pack"), gpk);
    public static ShapelessRecipe sugrc = new ShapelessRecipe(new NamespacedKey(Main.inst, "Sugar_Rush"), sug);
    public static ShapedRecipe chestrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Backpack"), chest);
    public static ShapelessRecipe fsrc = new ShapelessRecipe(new NamespacedKey(Main.inst, "Fusion_Armour"), fs);
    public static ShapedRecipe shearrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Lucky_Shears"), shear);
    public static ShapedRecipe deprc = new ShapedRecipe(new NamespacedKey(Main.inst, "The_Deep"), dep);
    public static ShapedRecipe frsrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Fire_Song"), frs);
    public static ShapedRecipe caBorc = new ShapedRecipe(new NamespacedKey(Main.inst, "Cannon_Boots"), caBo);
    public static ShapedRecipe atmrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Artemis_Bow"), atm);
    public static ShapedRecipe harmrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Flask_of_Ichor"), harm);
    public static ShapedRecipe exurc = new ShapedRecipe(new NamespacedKey(Main.inst, "Exudus"), exu);
    public static ShapedRecipe legrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Hide_of_Leviathan"), leg);
    public static ShapedRecipe fateBrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Tablets_of_Destiny"), fateB);
    public static ShapedRecipe drAxerc = new ShapedRecipe(new NamespacedKey(Main.inst, "Dream_Slayer"), drAxe);
    public static ShapedRecipe exrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Exculibur"), ex);
    public static ShapedRecipe andrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Anduril"), and);
    public static ShapedRecipe scyrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Harvesting_Scythe"), scy);
    public static ShapedRecipe faterc = new ShapedRecipe(new NamespacedKey(Main.inst, "Chest_of_Fate"), fate);
    public static ShapedRecipe hornrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Cornucopia"), horn);
    public static ShapedRecipe essrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Essence_of_Yggdrasil"), ess);
    public static ShapelessRecipe extrc = new ShapelessRecipe(new NamespacedKey(Main.inst, "Ex_Potion"), ext);
    public static ShapedRecipe dicerc = new ShapedRecipe(new NamespacedKey(Main.inst, "Dice_of_God"), dice);
    public static ShapedRecipe vBoxrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Void_Chest"), vBox);
    public static ShapedRecipe rodrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Kings_Rod"), rod);
    public static ShapedRecipe skerc = new ShapedRecipe(new NamespacedKey(Main.inst, "Daredevil"), ske);
    public static ShapelessRecipe flarc = new ShapelessRecipe(new NamespacedKey(Main.inst, "Flask_of_Music"), fla);
    public static ShapedRecipe vidrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Shoes_of_Vider"), vid);
    public static ShapelessRecipe valrc = new ShapelessRecipe(new NamespacedKey(Main.inst, "Potion_of_Vitality"), val);
    public static ShapedRecipe blsrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Miners_Blessing"), bls);
    public static ShapedRecipe ambrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Ambrosia"), amb);
    public static ShapedRecipe lusrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Bloodlust"), lus);
    public static ShapedRecipe allrc = new ShapedRecipe(new NamespacedKey(Main.inst, "ComBow"), all);
    public static ShapedRecipe epsrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Expert_Seal"), eps);
    public static ShapedRecipe spdrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Hermes_Boots"), spd);
    public static ShapedRecipe ragerc = new ShapedRecipe(new NamespacedKey(Main.inst, "Barbarian_Chestplate"), rage);
    public static ShapedRecipe ftrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Fates_Call"), ft);
    public static ShapelessRecipe flintrc = new ShapelessRecipe(new NamespacedKey(Main.inst, "Quick_Flint"), flint);
    public static ShapedRecipe cpkrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Copper_Pack"), cpk);
    public static ShapedRecipe egApplerc = new ShapedRecipe(new NamespacedKey(Main.inst, "Enchanted_Golden_Apple"), egApple);
    public static ShapedRecipe htrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Hunters_Compass"), ht);
    public static ShapedRecipe stickrc = new ShapedRecipe(new NamespacedKey(Main.inst, "Alpenstock"), stick);

    static
    {
        appHelrc.shape("aaa", "aba", "   ");
        appHelrc.setIngredient('a', Material.IRON_INGOT);
        appHelrc.setIngredient('b', Material.REDSTONE_TORCH);

        appSworc.shape(" a ", " b ", " a ");
        appSworc.setIngredient('a', Material.REDSTONE_BLOCK);
        appSworc.setIngredient('b', Material.IRON_SWORD);

        appBowrc.shape(" ab", "a b", " ab");
        appBowrc.setIngredient('a', Material.REDSTONE_TORCH);
        appBowrc.setIngredient('b', Material.STRING);

        appShieldrc.shape("aba", "aca", "dad");
        appShieldrc.setIngredient('a', new RecipeChoice.MaterialChoice(Material.OAK_PLANKS, Material.BIRCH_PLANKS, Material.ACACIA_PLANKS, Material.DARK_OAK_PLANKS, Material.CRIMSON_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.WARPED_PLANKS));
        appShieldrc.setIngredient('b', Material.IRON_INGOT);
        appShieldrc.setIngredient('c', Material.REDSTONE_BLOCK);
        appShieldrc.setIngredient('d', Material.REDSTONE_TORCH);

        vpSworc.shape(" a ", " b ", " c ");
        vpSworc.setIngredient('a', Material.BONE);
        vpSworc.setIngredient('b', Material.IRON_SWORD);
        vpSworc.setIngredient('c', Material.ROTTEN_FLESH);

        sharpBrc.shape("a  ", " cc", " cd");
        sharpBrc.setIngredient('a', Material.FLINT);
        sharpBrc.setIngredient('c', Material.PAPER);
        sharpBrc.setIngredient('d', Material.IRON_SWORD);

        powBrc.shape("a  ", " cc", " cd");
        powBrc.setIngredient('a', Material.FLINT);
        powBrc.setIngredient('c', Material.PAPER);
        powBrc.setIngredient('d', Material.BONE);

        dragSworc.shape(" a ", " b ", "cac");
        dragSworc.setIngredient('a', Material.BLAZE_POWDER);
        dragSworc.setIngredient('b', Material.DIAMOND_AXE);
        dragSworc.setIngredient('c', Material.OBSIDIAN);

        protBrc.shape("a  ", " cc", " cd");
        protBrc.setIngredient('a', new RecipeChoice.MaterialChoice(Material.IRON_INGOT, Material.COPPER_BLOCK));
        protBrc.setIngredient('c', Material.PAPER);
        protBrc.setIngredient('d', Material.IRON_INGOT);

        projBrc.shape("a  ", " bb", " bc");
        projBrc.setIngredient('a', new RecipeChoice.MaterialChoice(Material.IRON_INGOT, Material.COPPER_BLOCK));
        projBrc.setIngredient('b', Material.PAPER);
        projBrc.setIngredient('c', Material.ARROW);

        dragCherc.shape(" a ", " b ", "cdc");
        dragCherc.setIngredient('a', Material.MAGMA_CREAM);
        dragCherc.setIngredient('b', Material.DIAMOND_CHESTPLATE);
        dragCherc.setIngredient('c', Material.OBSIDIAN);
        dragCherc.setIngredient('d', new RecipeChoice.MaterialChoice(Material.ANVIL, Material.CHIPPED_ANVIL, Material.DAMAGED_ANVIL));

        dustrc.shape("ace", "dbd", "eca");
        dustrc.setIngredient('a', Material.REDSTONE);
        dustrc.setIngredient('b', Material.FLINT_AND_STEEL);
        dustrc.setIngredient('c', Material.SUGAR);
        dustrc.setIngredient('d', Material.CLAY_BALL);
        dustrc.setIngredient('e', Material.BONE_MEAL);

        wartrc.shape("aba", "aca", "bab");
        wartrc.setIngredient('a', Material.BEETROOT_SEEDS);
        wartrc.setIngredient('b', Material.WHEAT_SEEDS);
        wartrc.setIngredient('c', Material.FERMENTED_SPIDER_EYE);

        necrc.shape(" a ", "bcb", " d ");
        necrc.setIngredient('a', Material.EMERALD);
        necrc.setIngredient('b', Material.GOLD_INGOT);
        necrc.setIngredient('c', Material.MELON_SLICE);
        necrc.setIngredient('d', Material.GLASS_BOTTLE);

        netArtrc.shape("aba", "aca", "aba");
        netArtrc.setIngredient('a', Material.ORANGE_STAINED_GLASS);
        netArtrc.setIngredient('b', Material.LAVA_BUCKET);
        netArtrc.setIngredient('c', Material.FIREWORK_ROCKET);

        steakrc.shape("aaa", "aba", "aaa");
        steakrc.setIngredient('a', new RecipeChoice.MaterialChoice(Material.BEEF, Material.MUTTON, Material.ROTTEN_FLESH, Material.CHICKEN, Material.PORKCHOP, Material.RABBIT, Material.RABBIT_FOOT));
        steakrc.setIngredient('b', new RecipeChoice.MaterialChoice(Material.COAL, Material.CHARCOAL));

        tourc.shape(" a ", " b ", " c ");
        tourc.setIngredient('a', Material.SLIME_BALL);
        tourc.setIngredient('b', new RecipeChoice.MaterialChoice(Material.WHITE_WOOL, Material.BLACK_WOOL, Material.BLUE_WOOL, Material.BROWN_WOOL, Material.CYAN_WOOL, Material.GRAY_WOOL, Material.GREEN_WOOL, Material.LIGHT_BLUE_WOOL, Material.LIGHT_GRAY_WOOL, Material.LIME_WOOL, Material.MAGENTA_WOOL, Material.ORANGE_WOOL, Material.PINK_WOOL, Material.PURPLE_WOOL, Material.RED_WOOL, Material.YELLOW_WOOL));
        tourc.setIngredient('c', Material.GLASS_BOTTLE);

        spkCherc.shape(" a ", " b ", " c ");
        spkCherc.setIngredient('a', Material.LILY_PAD);
        spkCherc.setIngredient('b', Material.CACTUS);
        spkCherc.setIngredient('c', Material.LEATHER_CHESTPLATE);

        sevBotrc.shape("aba", "aca", "ada");
        sevBotrc.setIngredient('a', Material.FEATHER);
        sevBotrc.setIngredient('b', Material.ENDER_PEARL);
        sevBotrc.setIngredient('c', Material.DIAMOND_BOOTS);
        sevBotrc.setIngredient('d', Material.WATER_BUCKET);

        ipkrc.shape("aaa", "aba", "aaa");
        ipkrc.setIngredient('a', new RecipeChoice.MaterialChoice(Material.RAW_IRON, Material.IRON_ORE));
        ipkrc.setIngredient('b', Material.COAL);

        obsrc.addIngredient(Material.WATER_BUCKET);
        obsrc.addIngredient(Material.LAVA_BUCKET);
        obsrc.addIngredient(Material.COAL_BLOCK);

        tarnrc.shape("aba", "aca", "   ");
        tarnrc.setIngredient('a', Material.DIAMOND);
        tarnrc.setIngredient('b', Material.IRON_INGOT);
        tarnrc.setIngredient('c', Material.REDSTONE_BLOCK);

        fortPicrc.shape("aba", "cdc", " d ");
        fortPicrc.setIngredient('a', new RecipeChoice.MaterialChoice(Material.RAW_IRON, Material.IRON_ORE));
        fortPicrc.setIngredient('b', new RecipeChoice.MaterialChoice(Material.RAW_GOLD, Material.GOLD_ORE));
        fortPicrc.setIngredient('c', Material.LAPIS_BLOCK);
        fortPicrc.setIngredient('d', Material.STICK);

        exprc.shape("aaa", "aba", "aaa");
        exprc.setIngredient('a', Material.REDSTONE_BLOCK);
        exprc.setIngredient('b', Material.GLASS_BOTTLE);

        ltAnvrc.shape("aaa", " b ", "aaa");
        ltAnvrc.setIngredient('a', Material.IRON_INGOT);
        ltAnvrc.setIngredient('b', Material.IRON_BLOCK);

        ltEncrc.shape(" a ", "bcb", "bdb");
        ltEncrc.setIngredient('a', Material.BOOKSHELF);
        ltEncrc.setIngredient('b', Material.OBSIDIAN);
        ltEncrc.setIngredient('c', Material.DIAMOND);
        ltEncrc.setIngredient('d', Material.EXPERIENCE_BOTTLE);

        thoBrc.shape("a  ", " bb", " bc");
        thoBrc.setIngredient('a', Material.ENDER_EYE);
        thoBrc.setIngredient('b', Material.PAPER);
        thoBrc.setIngredient('c', Material.FIRE_CHARGE);

        wisArc.addIngredient(Material.APPLE);
        wisArc.addIngredient(Material.BONE_MEAL);
        wisArc.addIngredient(Material.BONE_MEAL);
        wisArc.addIngredient(Material.BONE_MEAL);
        wisArc.addIngredient(Material.BONE_MEAL);

        melonrc.shape("aba", "bcb", "aba");
        melonrc.setIngredient('a', Material.BONE_MEAL);
        melonrc.setIngredient('b', new RecipeChoice.MaterialChoice(Material.BEETROOT_SEEDS, Material.WHEAT_SEEDS, Material.MELON_SEEDS, Material.PUMPKIN_SEEDS));
        melonrc.setIngredient('c', Material.APPLE);

        aspPtrc.shape("aba", " c ", " d ");
        aspPtrc.setIngredient('a', Material.GOLD_INGOT);
        aspPtrc.setIngredient('b', Material.REDSTONE_BLOCK);
        aspPtrc.setIngredient('c', new RecipeChoice.MaterialChoice(Material.MUSIC_DISC_13, Material.MUSIC_DISC_11, Material.MUSIC_DISC_CAT, Material.MUSIC_DISC_BLOCKS, Material.MUSIC_DISC_CHIRP, Material.MUSIC_DISC_FAR, Material.MUSIC_DISC_MALL, Material.MUSIC_DISC_MELLOHI, Material.MUSIC_DISC_PIGSTEP, Material.MUSIC_DISC_STAL, Material.MUSIC_DISC_STRAD, Material.MUSIC_DISC_WAIT, Material.MUSIC_DISC_WARD));
        aspPtrc.setIngredient('d', Material.GLASS_BOTTLE);

        gApplerc.shape(" a ", "aba", " a ");
        gApplerc.setIngredient('a', Material.GOLD_INGOT);
        gApplerc.setIngredient('b', Material.APPLE);

        hdrc.shape("aaa", "aba", "aaa");
        hdrc.setIngredient('a', Material.GOLD_INGOT);
        hdrc.setIngredient('b', new RecipeChoice.MaterialChoice(Material.WITHER_SKELETON_SKULL, Material.PLAYER_HEAD));

        pBoxrc.shape("aaa", "aba", "aaa");
        pBoxrc.setIngredient('a', new RecipeChoice.MaterialChoice(Material.CHEST, Material.ENDER_CHEST, Material.TRAPPED_CHEST));
        pBoxrc.setIngredient('b', new RecipeChoice.MaterialChoice(Material.WITHER_SKELETON_SKULL, Material.PLAYER_HEAD));

        panPrc.shape("aba", " c ", "   ");
        panPrc.setIngredient('a', new RecipeChoice.MaterialChoice(Material.WITHER_SKELETON_SKULL, Material.PLAYER_HEAD));
        panPrc.setIngredient('b', Material.GLISTERING_MELON_SLICE);
        panPrc.setIngredient('c', Material.GLASS_BOTTLE);

        cBowrc.shape(" a ", "bcb", " d ");
        cBowrc.setIngredient('a', Material.BLAZE_ROD);
        cBowrc.setIngredient('b', new RecipeChoice.MaterialChoice(Material.WITHER_SKELETON_SKULL, Material.PLAYER_HEAD));
        cBowrc.setIngredient('c', Material.BOW);
        cBowrc.setIngredient('d', Material.LAVA_BUCKET);

        arrowrc.shape("aaa", "bbb", "ccc");
        arrowrc.setIngredient('a', Material.FLINT);
        arrowrc.setIngredient('b', Material.STICK);
        arrowrc.setIngredient('c', Material.FEATHER);

        sadrc.shape("aaa", "bab", "c c");
        sadrc.setIngredient('a', new RecipeChoice.MaterialChoice(Material.LEATHER, Material.RABBIT_HIDE));
        sadrc.setIngredient('b', Material.STRING);
        sadrc.setIngredient('c', new RecipeChoice.MaterialChoice(Material.IRON_INGOT, Material.COPPER_INGOT));

        velPtrc.addIngredient(Material.COCOA_BEANS);
        velPtrc.addIngredient(Material.SUGAR);
        velPtrc.addIngredient(Material.GLASS_BOTTLE);

        ferrc.shape("aaa", "bcb", "aaa");
        ferrc.setIngredient('a', new RecipeChoice.MaterialChoice(Material.LEATHER, Material.RABBIT_HIDE));
        ferrc.setIngredient('b', new RecipeChoice.MaterialChoice(Material.BONE, Material.BONE_BLOCK));
        ferrc.setIngredient('c', Material.EXPERIENCE_BOTTLE);

        forgerc.shape("aaa", "aba", "aaa");
        forgerc.setIngredient('a', new RecipeChoice.MaterialChoice(Material.COBBLESTONE, Material.COBBLED_DEEPSLATE, Material.BLACKSTONE, Material.STONE, Material.END_STONE));
        forgerc.setIngredient('b', Material.COAL_BLOCK);

        qkPicrc.shape("aaa", "bcb", " c ");
        qkPicrc.setIngredient('a', new RecipeChoice.MaterialChoice(Material.RAW_IRON, Material.IRON_ORE));
        qkPicrc.setIngredient('b', Material.COAL);
        qkPicrc.setIngredient('c', Material.STICK);

        lumrc.shape("aab", "ac ", " c ");
        lumrc.setIngredient('a', Material.IRON_INGOT);
        lumrc.setIngredient('b', Material.FLINT);
        lumrc.setIngredient('c', Material.STICK);

        eBookrc.shape("aaa", "bcd", "eee");
        eBookrc.setIngredient('a', Material.EXPERIENCE_BOTTLE);
        eBookrc.setIngredient('b', Material.IRON_PICKAXE);
        eBookrc.setIngredient('c', Material.ENCHANTING_TABLE);
        eBookrc.setIngredient('d', Material.IRON_AXE);
        eBookrc.setIngredient('e', Material.BOOKSHELF);

        gpkrc.shape("aaa", "aba", "aaa");
        gpkrc.setIngredient('a', new RecipeChoice.MaterialChoice(Material.RAW_GOLD, Material.GOLD_ORE));
        gpkrc.setIngredient('b', Material.COAL);

        sugrc.addIngredient(new RecipeChoice.MaterialChoice(Material.ACACIA_SAPLING, Material.BIRCH_SAPLING, Material.OAK_SAPLING, Material.DARK_OAK_SAPLING, Material.JUNGLE_SAPLING, Material.SPRUCE_SAPLING));
        sugrc.addIngredient(new RecipeChoice.MaterialChoice(Material.BEETROOT_SEEDS, Material.WHEAT_SEEDS, Material.MELON_SEEDS, Material.PUMPKIN_SEEDS));
        sugrc.addIngredient(new RecipeChoice.MaterialChoice(Material.BEETROOT_SEEDS, Material.WHEAT_SEEDS, Material.MELON_SEEDS, Material.PUMPKIN_SEEDS));
        sugrc.addIngredient(Material.SUGAR);

        chestrc.shape("aba", "aca", "aba");
        chestrc.setIngredient('a', new RecipeChoice.MaterialChoice(Material.OAK_PLANKS, Material.BIRCH_PLANKS, Material.ACACIA_PLANKS, Material.DARK_OAK_PLANKS, Material.CRIMSON_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.WARPED_PLANKS));
        chestrc.setIngredient('b', new RecipeChoice.MaterialChoice(Material.LEATHER, Material.RABBIT_HIDE));
        chestrc.setIngredient('c', new RecipeChoice.MaterialChoice(Material.CHEST, Material.ENDER_CHEST, Material.TRAPPED_CHEST));

        fsrc.addIngredient(new RecipeChoice.MaterialChoice(Material.DIAMOND_CHESTPLATE, Material.DIAMOND_LEGGINGS, Material.DIAMOND_BOOTS, Material.DIAMOND_HELMET));
        fsrc.addIngredient(new RecipeChoice.MaterialChoice(Material.DIAMOND_CHESTPLATE, Material.DIAMOND_LEGGINGS, Material.DIAMOND_BOOTS, Material.DIAMOND_HELMET));
        fsrc.addIngredient(new RecipeChoice.MaterialChoice(Material.DIAMOND_CHESTPLATE, Material.DIAMOND_LEGGINGS, Material.DIAMOND_BOOTS, Material.DIAMOND_HELMET));
        fsrc.addIngredient(new RecipeChoice.MaterialChoice(Material.DIAMOND_CHESTPLATE, Material.DIAMOND_LEGGINGS, Material.DIAMOND_BOOTS, Material.DIAMOND_HELMET));
        fsrc.addIngredient(new RecipeChoice.MaterialChoice(Material.DIAMOND_CHESTPLATE, Material.DIAMOND_LEGGINGS, Material.DIAMOND_BOOTS, Material.DIAMOND_HELMET));

        shearrc.shape("aaa", "aba", "aaa");
        shearrc.setIngredient('a', new RecipeChoice.MaterialChoice(Material.ACACIA_LEAVES, Material.AZALEA_LEAVES, Material.BIRCH_LEAVES, Material.OAK_LEAVES, Material.DARK_OAK_LEAVES, Material.ACACIA_LEAVES, Material.SPRUCE_LEAVES, Material.JUNGLE_LEAVES, Material.BROWN_MUSHROOM_BLOCK, Material.RED_MUSHROOM_BLOCK, Material.WARPED_WART_BLOCK, Material.NETHER_WART_BLOCK));
        shearrc.setIngredient('b', Material.SHEARS);

        deprc.shape("  a", " ab", "a b");
        deprc.setIngredient('a', new RecipeChoice.MaterialChoice(Material.BONE, Material.BONE_BLOCK));
        deprc.setIngredient('b', Material.STRING);

        frsrc.shape("ab ", "bcc", " cd");
        frsrc.setIngredient('a', Material.FLINT_AND_STEEL);
        frsrc.setIngredient('b', Material.BLAZE_POWDER);
        frsrc.setIngredient('c', Material.PAPER);
        frsrc.setIngredient('d', Material.LAVA_BUCKET);

        caBorc.shape("aaa", "aca", "aba");
        caBorc.setIngredient('a', Material.TNT);
        caBorc.setIngredient('c', Material.DIAMOND_BOOTS);
        caBorc.setIngredient('b', Material.WATER_BUCKET);

        atmrc.shape("aba", "aca", "ada");
        atmrc.setIngredient('a', Material.FEATHER);
        atmrc.setIngredient('b', Material.DIAMOND);
        atmrc.setIngredient('c', Material.BOW);
        atmrc.setIngredient('d', Material.ENDER_EYE);

        harmrc.shape(" a ", "bcb", " d ");
        harmrc.setIngredient('a', new RecipeChoice.MaterialChoice(Material.PLAYER_HEAD, Material.WITHER_SKELETON_SKULL));
        harmrc.setIngredient('b', new RecipeChoice.MaterialChoice(Material.BROWN_MUSHROOM, Material.RED_MUSHROOM));
        harmrc.setIngredient('c', Material.GLASS_BOTTLE);
        harmrc.setIngredient('d', Material.INK_SAC);

        exurc.shape("aaa", "aba", "cdc");
        exurc.setIngredient('a', Material.DIAMOND);
        exurc.setIngredient('b', new RecipeChoice.MaterialChoice(Material.PLAYER_HEAD, Material.WITHER_SKELETON_SKULL));
        exurc.setIngredient('c', Material.EMERALD);
        exurc.setIngredient('d', Material.GOLDEN_CARROT);

        legrc.shape("aba", "cdc", "e e");
        legrc.setIngredient('a', Material.LAPIS_BLOCK);
        legrc.setIngredient('b', Material.WATER_BUCKET);
        legrc.setIngredient('c', Material.DIAMOND);
        legrc.setIngredient('d', Material.DIAMOND_LEGGINGS);
        legrc.setIngredient('e', Material.LILY_PAD);

        fateBrc.shape(" a ", "bcd", "eee");
        fateBrc.setIngredient('a', Material.MAGMA_CREAM);
        fateBrc.setIngredient('b', Material.DIAMOND_SWORD);
        fateBrc.setIngredient('c', Material.WRITABLE_BOOK);
        fateBrc.setIngredient('d', Material.BOW);
        fateBrc.setIngredient('e', Material.EXPERIENCE_BOTTLE);

        drAxerc.shape("abc", "def", "ghi");
        drAxerc.setIngredient('a', Material.TNT);
        drAxerc.setIngredient('b', new RecipeChoice.MaterialChoice(Material.ACACIA_BOAT, Material.BIRCH_BOAT, Material.OAK_BOAT, Material.DARK_OAK_BOAT, Material.JUNGLE_BOAT, Material.SPRUCE_BOAT));
        drAxerc.setIngredient('c', Material.FLINT_AND_STEEL);
        drAxerc.setIngredient('d', Material.LAVA_BUCKET);
        drAxerc.setIngredient('e', Material.DIAMOND_AXE);
        drAxerc.setIngredient('f', Material.WATER_BUCKET);
        drAxerc.setIngredient('g', Material.FIREWORK_ROCKET);
        drAxerc.setIngredient('h', new RecipeChoice.MaterialChoice(Material.PLAYER_HEAD, Material.WITHER_SKELETON_SKULL));
        drAxerc.setIngredient('i', Material.FISHING_ROD);

        exrc.shape("aba", "aca", "ada");
        exrc.setIngredient('a', new RecipeChoice.MaterialChoice(Material.SOUL_SAND, Material.SOUL_SOIL));
        exrc.setIngredient('b', Material.FIRE_CHARGE);
        exrc.setIngredient('c', Material.FIRE_CHARGE);
        exrc.setIngredient('d', Material.DIAMOND_SWORD);

        andrc.shape("aba", "aba", "aca");
        andrc.setIngredient('a', Material.FEATHER);
        andrc.setIngredient('b', Material.IRON_BLOCK);
        andrc.setIngredient('c', Material.BLAZE_ROD);

        scyrc.shape(" aa", " bc", "b  ");
        scyrc.setIngredient('a', Material.HAY_BLOCK);
        scyrc.setIngredient('b', new RecipeChoice.MaterialChoice(Material.BONE, Material.BONE_BLOCK));
        scyrc.setIngredient('c', Material.WATER_BUCKET);

        faterc.shape("aaa", "aba", "aaa");
        faterc.setIngredient('a', new RecipeChoice.MaterialChoice(Material.OAK_PLANKS, Material.BIRCH_PLANKS, Material.ACACIA_PLANKS, Material.DARK_OAK_PLANKS, Material.CRIMSON_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.WARPED_PLANKS));
        faterc.setIngredient('b', new RecipeChoice.MaterialChoice(Material.WITHER_SKELETON_SKULL, Material.PLAYER_HEAD));

        hornrc.shape("aaa", "aba", "aaa");
        hornrc.setIngredient('a', Material.CARROT);
        hornrc.setIngredient('b', Material.GOLDEN_APPLE);

        essrc.shape("aba", "cdc", "aea");
        essrc.setIngredient('a', new RecipeChoice.MaterialChoice(Material.ACACIA_LEAVES, Material.AZALEA_LEAVES, Material.BIRCH_LEAVES, Material.OAK_LEAVES, Material.DARK_OAK_LEAVES, Material.ACACIA_LEAVES, Material.SPRUCE_LEAVES, Material.JUNGLE_LEAVES, Material.BROWN_MUSHROOM_BLOCK, Material.RED_MUSHROOM_BLOCK, Material.WARPED_WART_BLOCK, Material.NETHER_WART_BLOCK));
        essrc.setIngredient('b', Material.ENCHANTING_TABLE);
        essrc.setIngredient('c', Material.GLOWSTONE);
        essrc.setIngredient('d', Material.GLASS_BOTTLE);
        essrc.setIngredient('e', Material.REDSTONE_BLOCK);

        extrc.addIngredient(new RecipeChoice.MaterialChoice(Material.WITHER_SKELETON_SKULL, Material.PLAYER_HEAD));
        extrc.addIngredient(Material.EMERALD);
        extrc.addIngredient(Material.GLASS_BOTTLE);

        vBoxrc.shape("aba", "bcb", "aba");
        vBoxrc.setIngredient('a', Material.OBSIDIAN);
        vBoxrc.setIngredient('b', Material.GLASS);
        vBoxrc.setIngredient('c', new RecipeChoice.MaterialChoice(Material.WITHER_SKELETON_SKULL, Material.PLAYER_HEAD));

        dicerc.shape("aba", "aca", "aaa");
        dicerc.setIngredient('a', Material.MOSSY_COBBLESTONE);
        dicerc.setIngredient('b', new RecipeChoice.MaterialChoice(Material.WITHER_SKELETON_SKULL, Material.PLAYER_HEAD));
        dicerc.setIngredient('c', Material.JUKEBOX);

        rodrc.shape(" a ", "bcb", " d ");
        rodrc.setIngredient('a', Material.FISHING_ROD);
        rodrc.setIngredient('b', Material.LILY_PAD);
        rodrc.setIngredient('c', Material.COMPASS);
        rodrc.setIngredient('d', Material.WATER_BUCKET);

        skerc.shape("ab ", "ccc", "c c");
        skerc.setIngredient('a', new RecipeChoice.MaterialChoice(Material.WITHER_SKELETON_SKULL, Material.PLAYER_HEAD));
        skerc.setIngredient('b', Material.SADDLE);
        skerc.setIngredient('c', new RecipeChoice.MaterialChoice(Material.BONE, Material.BONE_BLOCK));

        flarc.addIngredient(new RecipeChoice.MaterialChoice(Material.MUSIC_DISC_13, Material.MUSIC_DISC_11, Material.MUSIC_DISC_CAT, Material.MUSIC_DISC_BLOCKS, Material.MUSIC_DISC_CHIRP, Material.MUSIC_DISC_FAR, Material.MUSIC_DISC_MALL, Material.MUSIC_DISC_MELLOHI, Material.MUSIC_DISC_PIGSTEP, Material.MUSIC_DISC_STAL, Material.MUSIC_DISC_STRAD, Material.MUSIC_DISC_WAIT, Material.MUSIC_DISC_WARD));
        flarc.addIngredient(Material.MILK_BUCKET);
        flarc.addIngredient(Material.GLASS_BOTTLE);

        vidrc.shape(" a ", "bcb", " d ");
        vidrc.setIngredient('a', Material.PUFFERFISH);
        ItemStack w = new ItemStack(Material.POTION);
        PotionMeta wim = (PotionMeta) w.getItemMeta();
        assert wim != null;
        wim.setBasePotionData(new PotionData(PotionType.WATER));
        w.setItemMeta(wim);
        vidrc.setIngredient('b', new RecipeChoice.ExactChoice(w));
        vidrc.setIngredient('c', Material.DIAMOND_BOOTS);
        vidrc.setIngredient('d', Material.FISHING_ROD);

        valrc.addIngredient(new RecipeChoice.MaterialChoice(Material.WITHER_SKELETON_SKULL, Material.SKELETON_SKULL));
        valrc.addIngredient(Material.NETHER_WART);
        valrc.addIngredient(Material.GLASS_BOTTLE);

        blsrc.shape("aba", "aca", "ddd");
        blsrc.setIngredient('a', Material.EXPERIENCE_BOTTLE);
        blsrc.setIngredient('b', Material.DIAMOND_SWORD);
        blsrc.setIngredient('c', Material.DIAMOND_PICKAXE);
        blsrc.setIngredient('d', Material.BOOKSHELF);

        ambrc.shape("aba", "cdc", "ccc");
        ambrc.setIngredient('a', Material.BLAZE_POWDER);
        ambrc.setIngredient('b', new RecipeChoice.MaterialChoice(Material.WITHER_SKELETON_SKULL, Material.SKELETON_SKULL));
        ambrc.setIngredient('c', Material.GLOWSTONE);
        ambrc.setIngredient('d', Material.GHAST_TEAR);

        lusrc.shape("aba", "aca", "ada");
        lusrc.setIngredient('a', Material.REDSTONE_BLOCK);
        lusrc.setIngredient('b', Material.DIAMOND);
        lusrc.setIngredient('c', Material.DIAMOND_SWORD);
        lusrc.setIngredient('d', Material.EXPERIENCE_BOTTLE);

        allrc.shape(" a ", "bcb", "ded");
        allrc.setIngredient('a', Material.CLOCK);
        allrc.setIngredient('b', Material.BLAZE_POWDER);
        allrc.setIngredient('c', Material.BOW);
        allrc.setIngredient('d', Material.SPIDER_EYE);
        allrc.setIngredient('e', Material.SLIME_BALL);

        epsrc.shape("aba", "cdc", "aba");
        epsrc.setIngredient('a', Material.IRON_BLOCK);
        epsrc.setIngredient('b', Material.GOLD_BLOCK);
        epsrc.setIngredient('c', Material.DIAMOND_BLOCK);
        epsrc.setIngredient('d', Material.NETHERITE_INGOT);

        spdrc.shape("aba", "cdc", "e e");
        spdrc.setIngredient('a', Material.DIAMOND);
        spdrc.setIngredient('b', new RecipeChoice.MaterialChoice(Material.WITHER_SKELETON_SKULL, Material.PLAYER_HEAD));
        spdrc.setIngredient('c', Material.BLAZE_POWDER);
        spdrc.setIngredient('d', Material.DIAMOND_BOOTS);
        spdrc.setIngredient('e', Material.FEATHER);

        ragerc.shape("   ", "aba", "cdc");
        ragerc.setIngredient('a', Material.BLAZE_ROD);
        ragerc.setIngredient('b', Material.DIAMOND_CHESTPLATE);
        ragerc.setIngredient('c', Material.IRON_BLOCK);
        ItemStack s = new ItemStack(Material.POTION, 1);
        PotionMeta sim = (PotionMeta) s.getItemMeta();
        assert sim != null;
        sim.setBasePotionData(new PotionData(PotionType.STRENGTH));
        s.setItemMeta(sim);
        ragerc.setIngredient('d', new RecipeChoice.ExactChoice(s));

        ftrc.shape(" a ", "aba", " a ");
        ftrc.setIngredient('a', Material.REDSTONE_LAMP);
        ftrc.setIngredient('b', Material.FLOWER_POT);

        flintrc.addIngredient(Material.GRAVEL);
        flintrc.addIngredient(Material.GRAVEL);
        flintrc.addIngredient(Material.GRAVEL);

        cpkrc.shape("aaa", "aba", "aaa");
        cpkrc.setIngredient('b', Material.COAL);
        cpkrc.setIngredient('a', new RecipeChoice.MaterialChoice(Material.COPPER_INGOT, Material.COPPER_ORE));

        egApplerc.shape("aaa", "aba", "aaa");
        egApplerc.setIngredient('a', Material.GOLD_BLOCK);
        egApplerc.setIngredient('b', Material.APPLE);

        htrc.shape(" a ", "bcb", " a ");
        htrc.setIngredient('a', Material.BLAZE_POWDER);
        htrc.setIngredient('b', Material.REDSTONE_BLOCK);
        htrc.setIngredient('c', Material.COMPASS);

        stickrc.shape(" aa", "bba", "  a");
        stickrc.setIngredient('a', Material.IRON_INGOT);
        stickrc.setIngredient('b', Material.STICK);
    }
}
