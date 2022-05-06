package com.jmqstudio.strlantian.Factory;

import org.bukkit.*;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.*;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

import javax.annotation.Nonnull;
import java.util.Arrays;
import java.util.UUID;

public final class Items
{
    public static ItemStack fla = new ItemStack(Material.SPLASH_POTION, 1);
    public static ItemStack appHel= new ItemStack(Material.IRON_HELMET,1);
    public static ItemStack appSwo = new ItemStack(Material.IRON_SWORD,1);
    public static ItemStack appBow = new ItemStack(Material.BOW,1);
    public static ItemStack appShield = new ItemStack(Material.SHIELD,1);
    public static ItemStack vpSwo = new ItemStack(Material.IRON_SWORD,1);
    public static ItemStack sharpB = new ItemStack(Material.ENCHANTED_BOOK, 1);
    public static ItemStack powB = new ItemStack(Material.ENCHANTED_BOOK, 1);
    @SuppressWarnings("Deprecation")
    public static ItemStack dragSwo = new ItemStack(Material.NETHERITE_AXE, 1, (short) 470);
    public static ItemStack protB = new ItemStack(Material.ENCHANTED_BOOK,1);
    public static ItemStack projB = new ItemStack(Material.ENCHANTED_BOOK, 1);
    public static ItemStack dragChe = new ItemStack(Material.DIAMOND_CHESTPLATE,1);
    public static ItemStack dust = new ItemStack(Material.GLOWSTONE_DUST, 8);
    public static ItemStack wart = new ItemStack(Material.NETHER_WART, 1);
    public static ItemStack nec = new ItemStack(Material.POTION,1);
    public static ItemStack netArt = new ItemStack(Material.BLAZE_ROD, 1);
    public static ItemStack steak = new ItemStack(Material.COOKED_BEEF, 8);
    public static ItemStack tou = new ItemStack(Material.POTION, 1);
    public static ItemStack spkChe = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
    public static ItemStack sevBot = new ItemStack(Material.DIAMOND_BOOTS,1);
    public static ItemStack ipk = new ItemStack(Material.IRON_INGOT, 10);
    public static ItemStack obs = new ItemStack(Material.OBSIDIAN, 1);
    public static ItemStack tarn = new ItemStack(Material.DIAMOND_HELMET, 1);
    @SuppressWarnings("Deprecation")
    public static ItemStack fortPic = new ItemStack(Material.DIAMOND_PICKAXE, 1, (short) 1559);
    public static ItemStack exp = new ItemStack(Material.EXPERIENCE_BOTTLE, 8);
    public static ItemStack ltEnc = new ItemStack(Material.ENCHANTING_TABLE, 1);
    public static ItemStack thoB = new ItemStack(Material.ENCHANTED_BOOK, 1);
    public static ItemStack wisA = new ItemStack(Material.APPLE, 2);
    public static ItemStack melon = new ItemStack(Material.MELON_SLICE, 1);
    public static ItemStack aspPt = new ItemStack(Material.POTION, 1);
    public static ItemStack gApple = new ItemStack(Material.GOLDEN_APPLE, 1);
    public static ItemStack hd = new ItemStack(Material.PLAYER_HEAD, 1);
    public static ItemStack pBox = new ItemStack(Material.CHEST, 1);
    public static ItemStack panP = new ItemStack(Material.POTION, 1);
    public static ItemStack cBow = new ItemStack(Material.BOW, 1);
    public static ItemStack arrow = new ItemStack(Material.ARROW, 20);
    public static ItemStack sad = new ItemStack(Material.SADDLE, 1);
    public static ItemStack velPt = new ItemStack(Material.SPLASH_POTION, 1);
    public static ItemStack fer = new ItemStack(Material.WOLF_SPAWN_EGG, 1);
    public static ItemStack forge = new ItemStack(Material.FURNACE, 1);
    public static ItemStack qkPic = new ItemStack(Material.IRON_PICKAXE, 1);
    public static ItemStack lum = new ItemStack(Material.IRON_AXE, 1);
    public static ItemStack eBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
    public static ItemStack gpk = new ItemStack(Material.GOLD_INGOT, 10);
    public static ItemStack sug = new ItemStack(Material.SUGAR_CANE, 4);
    public static ItemStack chest = new ItemStack(Material.CHEST, 1);
    public static ItemStack fs = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
    public static ItemStack shear = new ItemStack(Material.SHEARS, 1);
    public static ItemStack dep = new ItemStack(Material.FISHING_ROD, 1);
    public static ItemStack frs = new ItemStack(Material.ENCHANTED_BOOK, 1);
    public static ItemStack caBo = new ItemStack(Material.DIAMOND_BOOTS, 1);
    public static ItemStack atm = new ItemStack(Material.BOW,1);
    public static ItemStack harm = new ItemStack(Material.SPLASH_POTION, 1);
    public static ItemStack exu = new ItemStack(Material.DIAMOND_HELMET, 1);
    public static ItemStack leg = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
    public static ItemStack fateB = new ItemStack(Material.ENCHANTED_BOOK,1);
    public static ItemStack drAxe = new ItemStack(Material.DIAMOND_AXE, 1);
    public static ItemStack ex = new ItemStack(Material.DIAMOND_SWORD);
    public static ItemStack and = new ItemStack(Material.IRON_SWORD);
    public static ItemStack scy = new ItemStack(Material.IRON_HOE, 1);
    public static ItemStack fate = new ItemStack(Material.CHEST, 1);
    public static ItemStack horn = new ItemStack(Material.GOLDEN_CARROT, 3);
    public static ItemStack ess = new ItemStack(Material.EXPERIENCE_BOTTLE, 32);
    public static ItemStack ext = new ItemStack(Material.POTION, 1);
    public static ItemStack vBox = new ItemStack(Material.ENDER_CHEST, 2);
    public static ItemStack dice = new ItemStack(Material.END_PORTAL_FRAME, 1);
    public static ItemStack rod = new ItemStack(Material.FISHING_ROD, 1);
    public static ItemStack ske = new ItemStack(Material.SKELETON_HORSE_SPAWN_EGG, 1);
    public static ItemStack vid = new ItemStack(Material.DIAMOND_BOOTS, 1);
    public static ItemStack val = new ItemStack(Material.SPLASH_POTION, 1);
    public static ItemStack bls = new ItemStack(Material.NETHERITE_PICKAXE, 1);
    public static ItemStack amb = new ItemStack(Material.GLOWSTONE_DUST, 1);
    public static ItemStack lus = new ItemStack(Material.NETHERITE_SWORD, 1);
    public static ItemStack all = new ItemStack(Material.BOW, 1);
    public static ItemStack eps = new ItemStack(Material.NETHER_STAR, 1);
    public static ItemStack spd = new ItemStack(Material.DIAMOND_BOOTS, 1);
    public static ItemStack rage = new ItemStack(Material.NETHERITE_CHESTPLATE, 1);
    public static ItemStack ft = new ItemStack(Material.FLOWER_POT, 1);
    public static ItemStack flint = new ItemStack(Material.FLINT, 1);
    public static ItemStack cpk = new ItemStack(Material.COPPER_INGOT, 10);
    public static ItemStack egApple = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1);
    public static ItemStack ht = new ItemStack(Material.COMPASS, 1);
    public static ItemStack stick = new ItemStack(Material.STICK, 1);
    public static ItemStack ltAnv = new ItemStack(Material.ANVIL, 1);

    static
    {
        ItemMeta appHelim = appHel.getItemMeta();
        assert appHelim != null;
        appHelim.setDisplayName("§aApprentice Helmet | 学徒之盔");
        appHelim.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
        appHelim.addEnchant(Enchantment.PROTECTION_FIRE, 1, true);
        appHelim.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 1, true);
        appHelim.addEnchant(Enchantment.PROTECTION_PROJECTILE, 1, true);
        appHelim.setLore(Arrays.asList("","§9The Very First Helmet"," ","§cCan't apply enchants",""));
        appHel.setItemMeta(appHelim);

        ItemMeta appSwoim= appSwo.getItemMeta();
        assert appSwoim != null;
        appSwoim.setDisplayName("§aApprentice Sword | 学徒之剑");
        appSwoim.setLore(Arrays.asList(" ","§9Sharp1 on 5 kill","§9Sharp2 on 20 kills","§9Sharp3 on 40 kills"," ","§c'Kill' Means Slaining Any Entities.","§cNo Anvils.",""));
        appSwo.setItemMeta(appSwoim);

        ItemMeta appBowim = appBow.getItemMeta();
        assert appBowim != null;
        appBowim.setDisplayName("§aApprentice Bow | 学徒之弓");
        appBowim.setLore(Arrays.asList(" ","§9Power1 on 5 shots","§9Power2 on 20 shots","§9Power3 on 40 shots"," ","§c'Shot' Means Shooting Any Entities.","§cNo Anvils",""));
        appBow.setItemMeta(appBowim);

        ItemMeta appShieldim = appShield.getItemMeta();
        assert appShieldim != null;
        appShieldim.setDisplayName("§cApprentice Shield | 学徒之盾");
        appShieldim.setLore(Arrays.asList(" ","§9The Blocker.","","§cReplaced Master'sCompass in Hypixel.","§cNo Anvils.",""));
        appShieldim.addEnchant(Enchantment.MENDING, 1, true);
        appShieldim.addEnchant(Enchantment.DURABILITY, 1, true);
        appShield.setItemMeta(appShieldim);

        ItemMeta vpSwoim = vpSwo.getItemMeta();
        assert vpSwoim != null;
        vpSwoim.setDisplayName("§aVorpal Sword | 抢夺之剑");
        vpSwoim.addEnchant(Enchantment.DAMAGE_UNDEAD, 2, true);
        vpSwoim.addEnchant(Enchantment.LOOT_BONUS_MOBS, 2, true);
        vpSwoim.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 2, true);
        vpSwoim.setLore(Arrays.asList("","§9Adjusted Looting2 to Looting3.","","§cNo Anvils.",""));
        vpSwo.setItemMeta(vpSwoim);

        ItemMeta sharpBim = sharpB.getItemMeta();
        assert sharpBim != null;
        sharpBim.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
        sharpB.setItemMeta(sharpBim);

        ItemMeta powBim = powB.getItemMeta();
        assert powBim != null;
        powBim.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
        powB.setItemMeta(powBim);

        ItemMeta dragSwoim = dragSwo.getItemMeta();
        assert dragSwoim != null;
        dragSwoim.setDisplayName("§cDragon Axe | 龙之斧");
        dragSwoim.setLore(Arrays.asList("","§9The Beginning of Invincibility","§9芜湖起飞.","","§cReplaced DragonSword in Hypixel(Because axe is 9 damage in 1.17)"));
        dragSwoim.addEnchant(Enchantment.SWEEPING_EDGE, 4, true);
        dragSwo.setItemMeta(dragSwoim);

        ItemMeta protBim = protB.getItemMeta();
        assert protBim != null;
        protBim.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
        protB.setItemMeta(protBim);

        ItemMeta dragCheim = dragChe.getItemMeta();
        assert dragCheim != null;
        dragCheim.setDisplayName("§cDragon Armour | 龙之甲");
        dragCheim.setLore(Arrays.asList("","§9Main.inst is A Luck Test.","§9Actually I have never done Main.inst before.",""));
        dragCheim.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        dragChe.setItemMeta(dragCheim);

        PotionMeta necim = (PotionMeta) nec.getItemMeta();
        assert necim != null;
        necim.setDisplayName("§aNector | 甘露");
        necim.setLore(Arrays.asList("","§9'久旱逢甘霖'","§9Gain 10 seconds of Regeneration",""));
        necim.addEnchant(Enchantment.DURABILITY, 1 ,true);
        necim.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        necim.setColor(Color.fromRGB(123,104,238));
        necim.setBasePotionData(new PotionData(PotionType.WATER));
        PotionEffect necpe = new PotionEffect(PotionEffectType.REGENERATION, 200, 2, true, true, true);
        necim.addCustomEffect(necpe, true);
        nec.setItemMeta(necim);

        PotionMeta touim = (PotionMeta) tou.getItemMeta();
        assert touim != null;
        touim.setDisplayName("§aPotion of Toughness | 韧性药水");
        touim.setLore(Arrays.asList("","§9The best for Yoga learners",""));
        touim.addEnchant(Enchantment.DURABILITY, 1, true);
        touim.setColor(Color.fromRGB(123,104,238));
        touim.setBasePotionData(new PotionData(PotionType.WATER));
        PotionEffect toupe = new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 2400, 0, true, true, true);
        touim.addCustomEffect(toupe, true);
        tou.setItemMeta(touim);

        LeatherArmorMeta spkCheim = (LeatherArmorMeta) spkChe.getItemMeta();
        assert spkCheim != null;
        spkCheim.setDisplayName("§aSpiked Armour | 荆棘护甲");
        spkCheim.setLore(Arrays.asList("","§9Cheap one with a good Enchantment","§9But too low in defence","","§cNo Anvils.",""));
        spkCheim.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        spkCheim.addEnchant(Enchantment.DURABILITY, 10, true);
        spkCheim.addEnchant(Enchantment.THORNS, 1, true);
        spkCheim.setColor(Color.fromRGB(84,139,84));
        spkChe.setItemMeta(spkCheim);

        ItemMeta sevBotim = sevBot.getItemMeta();
        assert sevBotim != null;
        sevBotim.setDisplayName("§cSeven-league Boots | 七国战靴");
        sevBotim.setLore(Arrays.asList("","§9He's NoFall Hack pls wdr",""));
        sevBotim.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
        sevBotim.addEnchant(Enchantment.PROTECTION_FALL, 3, true);
        sevBot.setItemMeta(sevBotim);

        ItemMeta projBim = projB.getItemMeta();
        assert projBim != null;
        projBim.addEnchant(Enchantment.PROTECTION_PROJECTILE, 1, true);
        projB.setItemMeta(projBim);

        ItemMeta tarnim = tarn.getItemMeta();
        assert tarnim != null;
        tarnim.setDisplayName("§aTarnhelm | 冰壶帽");
        tarnim.setLore(Arrays.asList("", "§9It may be slippy I thought", "", "§cNo Anvils.", ""));
        tarnim.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
        tarnim.addEnchant(Enchantment.PROTECTION_FIRE, 1, true);
        tarnim.addEnchant(Enchantment.WATER_WORKER, 1, true);
        tarn.setItemMeta(tarnim);

        ItemMeta fortPicim = fortPic.getItemMeta();
        assert fortPicim != null;
        fortPicim.setDisplayName("§cPhilosopher's Pickaxe | 哲人镐");
        fortPicim.setLore(Arrays.asList("", "§9It does be involved to a philosophic problem", "", "§cNo Anvils."));
        fortPicim.addEnchant(Enchantment.LUCK, 3, true);
        fortPic.setItemMeta(fortPicim);

        ItemMeta thoBim = thoB.getItemMeta();
        assert thoBim != null;
        thoBim.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
        thoBim.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
        thoBim.addEnchant(Enchantment.ARROW_DAMAGE, 2, true);
        thoBim.addEnchant(Enchantment.ARROW_KNOCKBACK, 2, true);
        thoBim.addEnchant(Enchantment.FIRE_ASPECT,1, true);
        thoB.setItemMeta(thoBim);

        PotionMeta aspPtim = (PotionMeta) aspPt.getItemMeta();
        assert aspPtim != null;
        aspPtim.setDisplayName("§aPotion of Absorption | 生命附加药水");
        aspPtim.setLore(Arrays.asList("", "§9Gain 2 mins of absorption2", ""));
        aspPtim.addEnchant(Enchantment.DURABILITY, 1, true);
        aspPtim.setColor(Color.fromRGB(123, 104, 238));
        aspPtim.setBasePotionData(new PotionData(PotionType.WATER));
        PotionEffect aspPtpe = new PotionEffect(PotionEffectType.ABSORPTION, 2400, 1, true, true, true);
        aspPtim.addCustomEffect(aspPtpe, true);
        aspPt.setItemMeta(aspPtim);

        SkullMeta hdim = (SkullMeta) hd.getItemMeta();
        OfflinePlayer gh = Bukkit.getOfflinePlayer(UUID.fromString("6ee6e3d3-fc3d-4a2b-887a-04374b9cf69d"));
        assert hdim != null;
        hdim.setOwningPlayer(gh);
        hdim.setDisplayName("§aGolden Head | 金头颅");
        hdim.setLore(Arrays.asList("","§9Gain regen2 for 5sec & absorption2 for 2min",""));
        hd.setItemMeta(hdim);

        ItemMeta pBoxim = pBox.getItemMeta();
        assert pBoxim != null;
        pBoxim.setDisplayName("§cPandora's Box | 潘多拉盒");
        pBoxim.setLore(Arrays.asList("", "§92 choices of heads","§9Get a random good",""));
        pBox.setItemMeta(pBoxim);

        PotionMeta panPim = (PotionMeta) panP.getItemMeta();
        assert panPim != null;
        panPim.setDisplayName("§aPanacea | 永生之水");
        panPim.setLore(Arrays.asList("", "§9Gain full health and absorption2 for 1 mins",""));
        panPim.setColor(Color.fromRGB(123, 104, 238));
        panPim.setBasePotionData(new PotionData(PotionType.WATER));
        panPim.addEnchant(Enchantment.DURABILITY, 1, true);
        PotionEffect panPpe1 = new PotionEffect(PotionEffectType.ABSORPTION, 1200, 1, true, true, true);
        PotionEffect panPpe2 = new PotionEffect(PotionEffectType.HEAL, 1, 3, true, true, true);
        panPim.addCustomEffect(panPpe1, true);
        panPim.addCustomEffect(panPpe2, true);
        panP.setItemMeta(panPim);

        ItemMeta cBowim = cBow.getItemMeta();
        assert cBowim != null;
        cBowim.setDisplayName("§cCupid's Bow | 丘比特之弓");
        cBowim.setLore(Arrays.asList("", "§9We call these people '媒人' in Chinese", "§9Recipe changed", ""));
        cBowim.addEnchant(Enchantment.ARROW_DAMAGE, 2, true);
        cBowim.addEnchant(Enchantment.ARROW_FIRE, 1, true);
        cBow.setItemMeta(cBowim);

        PotionMeta velPtim = (PotionMeta) velPt.getItemMeta();
        assert velPtim != null;
        velPtim.setDisplayName("§aPotion of Velocity | 高速药水");
        velPtim.setLore(Arrays.asList("", "§9As fast as Bolt", ""));
        velPtim.setColor(Color.fromRGB(123, 104, 238));
        velPtim.setBasePotionData(new PotionData(PotionType.WATER));
        PotionEffect velPtpe = new PotionEffect(PotionEffectType.SPEED, 240, 2, true, true, true);
        velPtim.addCustomEffect(velPtpe, true);
        velPtim.addEnchant(Enchantment.DURABILITY, 1, true);
        velPt.setItemMeta(velPtim);

        SpawnEggMeta ferim = (SpawnEggMeta) fer.getItemMeta();
        assert ferim != null;
        ferim.setDisplayName("§cFenrir | 芬尼尔犬");
        ferim.setLore(Arrays.asList("", "§9Daaad, pleeese, I want a puppy!","","§cType: §6Wolf","§cAttributes:","§6 - Speed","§6 - Damage Resistance","§6 - Strength","§9Tamed and Loyal to you",""));
        fer.setItemMeta(ferim);

        ItemMeta forgeim = forge.getItemMeta();
        assert forgeim != null;
        forgeim.setDisplayName("§aForge | 锻炉");
        forgeim.setLore(Arrays.asList("","§9Get 5 free-source melting spaces","§9致力于维持资源生态平衡","§9Duuuuuude Main.inst one can be crafted unlimited times","§9So I changed the melting time from 10 to 5",""));
        forgeim.addEnchant(Enchantment.DURABILITY, 1, true);
        forge.setItemMeta(forgeim);

        ItemMeta qkPicim = qkPic.getItemMeta();
        assert qkPicim != null;
        qkPicim.setDisplayName("§cQuick Pick | 快速挖掘镐");
        qkPicim.setLore(Arrays.asList("", "§9Recipe Changed(as you thought)",""));
        qkPicim.addEnchant(Enchantment.DIG_SPEED, 1, true);
        qkPic.setItemMeta(qkPicim);

        ItemMeta lumim = lum.getItemMeta();
        assert lumim != null;
        lumim.setDisplayName("§aLumberjack's Axe | 木匠斧");
        lumim.setLore(Arrays.asList("","§9Drop the entire tree with 1 strike.","§9Idk how it works","§9But im totally shocked",""));
        lum.setItemMeta(lumim);

        ItemMeta eBookim = eBook.getItemMeta();
        assert eBookim != null;
        eBookim.setDisplayName("§cEnhancement Book | 强化书");
        eBookim.setLore(Arrays.asList("","§9Make any weapons(Include pickaxe and so on!)","§9applied 30 lvl enchantment",""));
        eBook.setItemMeta(eBookim);

        ItemMeta chestim = chest.getItemMeta();
        assert chestim != null;
        chestim.setDisplayName("§aBackpack | 背包");
        chestim.setLore(Arrays.asList("","§9Always needed by survivalists","§9Recipe Changed",""));
        chest.setItemMeta(chestim);

        ItemMeta fsim = fs.getItemMeta();
        assert fsim != null;
        fsim.setDisplayName("§cFusion Armour | 聚变甲");
        fsim.setLore(Arrays.asList("","§9Random prot5 diamond armours","§9Get Resistance1 when wearing","§9@下半身制造者Cen",""));
        fsim.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5 ,true);
        fs.setItemMeta(fsim);

        ItemMeta shearim = shear.getItemMeta();
        assert shearim != null;
        shearim.setDisplayName("§aLucky Shears | 幸运剪刀");
        shearim.setLore(Arrays.asList("","§9Make it possible to get apples when cutting leaves","§9Recipe Changed",""));
        shearim.addEnchant(Enchantment.DURABILITY, 2, true);
        shear.setItemMeta(shearim);

        ItemMeta depim = dep.getItemMeta();
        assert depim != null;
        depim.setDisplayName("§aThe Deep | 深海鱼杆");
        depim.setLore(Arrays.asList("","§9Maybe it's not good at fishing","§9So I changed its job",""));
        depim.addEnchant(Enchantment.KNOCKBACK ,2, true);
        dep.setItemMeta(depim);

        ItemMeta frsim = frs.getItemMeta();
        assert frsim != null;
        frsim.setDisplayName("§aBoruto Naruto | 博人传");
        frsim.setLore(Arrays.asList("","§9In Chinese we say","§9as exciting as Boruto Naruto","§9which means something is very exiting","§9这不比博燃","","§cReplaced SwagSong in Hypixel","§cActually idk how to realise SwanSong so I used Main.inst lol",""));
        frsim.addEnchant(Enchantment.FIRE_ASPECT, 1 ,true);
        frsim.addEnchant(Enchantment.ARROW_FIRE, 1, true);
        frsim.addEnchant(Enchantment.PROTECTION_FIRE,2,true);
        frs.setItemMeta(frsim);

        ItemMeta caBoim = caBo.getItemMeta();
        assert caBoim != null;
        caBoim.setDisplayName("§cCannon Boots | 炮手靴");
        caBoim.setLore(Arrays.asList("","§9As you see in skywars","§9Also gives you 24 TNTs in return","§9同时附赠24个TNT","§9ExplosionResistance1 on wearing","","§cReplaced Dorado'sTreasure in Hypixel",""));
        caBoim.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 8, true);
        caBoim.addEnchant(Enchantment.PROTECTION_FALL ,2, true);
        caBoim.addEnchant(Enchantment.DURABILITY, 2, true);
        caBo.setItemMeta(caBoim);

        ItemMeta atmim = atm.getItemMeta();
        assert atmim != null;
        atmim.setDisplayName("§6Artemis' Bow | 月神弓");
        atmim.setLore(Arrays.asList("","§950% to get an arrow back","§9Its ability is different from Hypixel's",""));
        atmim.addEnchant(Enchantment.ARROW_DAMAGE, 3, true);
        atm.setItemMeta(atmim);

        PotionMeta harmim = (PotionMeta) harm.getItemMeta();
        assert harmim != null;
        harmim.setDisplayName("§6Flask of Ichor | 腐蚀药水");
        harmim.setLore(Arrays.asList("","§9WILL take damage to yourself by accident",""));
        harmim.setColor(Color.fromRGB(123,104,238));
        harmim.addEnchant(Enchantment.DURABILITY,1,true);
        harmim.setBasePotionData(new PotionData(PotionType.WATER));
        PotionEffect harmpe = new PotionEffect(PotionEffectType.HARM, 1, 2, true, true, true);
        harmim.addCustomEffect(harmpe ,true);
        harm.setItemMeta(harmim);

        ItemMeta exuim = exu.getItemMeta();
        assert exuim != null;
        exuim.setDisplayName("§6Exodus | 永生帽");
        exuim.setLore(Arrays.asList("","§9Get Regeneration1 when put on","§9Don't worry, it's anvil-allowed",""));
        exuim.addEnchant(Enchantment.DURABILITY, 3,true);
        exu.setItemMeta(exuim);

        ItemMeta legim = leg.getItemMeta();
        assert legim != null;
        legim.setDisplayName("§6Hide Of Leviathan | 潮汐裤");
        legim.setLore(Arrays.asList("","§9集沼泽之精华灵气(雾","","§cNo Anvils",""));
        legim.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        legim.addEnchant(Enchantment.OXYGEN, 3, true);
        legim.addEnchant(Enchantment.WATER_WORKER, 1, true);
        leg.setItemMeta(legim);

        ItemMeta fateBim = fateB.getItemMeta();
        assert fateBim != null;
        fateBim.setDisplayName("§6Tablets of Destiny | 命运之书");
        fateBim.setLore(Arrays.asList("","§9直译:命运平板(?","§9离谱","§9我可以应聘Google Translation了",""));
        fateBim.addEnchant(Enchantment.DAMAGE_ALL , 3 ,true);
        fateBim.addEnchant(Enchantment.ARROW_DAMAGE, 3 ,true);
        fateBim.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        fateBim.addEnchant(Enchantment.FIRE_ASPECT, 1, true);
        fateB.setItemMeta(fateBim);

        ItemMeta drAxeim = drAxe.getItemMeta();
        assert drAxeim != null;
        drAxeim.setDisplayName("§6Dream Slayer | Dream快乐斧");
        drAxeim.setLore(Arrays.asList("","§9Made by Sapnap","","§cReplaced AxeOfPerun in Hypixel","§cNo Anvils.",""));
        drAxeim.addEnchant(Enchantment.DAMAGE_ALL ,5, true);
        drAxeim.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
        drAxeim.addEnchant(Enchantment.KNOCKBACK, 1, true);
        drAxe.setItemMeta(drAxeim);

        ItemMeta exim = ex.getItemMeta();
        assert exim != null;
        exim.setDisplayName("§6Exculibur | 咖喱棒");
        exim.setLore(Arrays.asList("","§9真.咖喱棒","§9Get 1 hearts back when hit(cooldown 5 sec)","§9Ability changed again lol",""));
        exim.addEnchant(Enchantment.DURABILITY,1,true);
        ex.setItemMeta(exim);

        ItemMeta andim = and.getItemMeta();
        assert andim != null;
        andim.setDisplayName("§6Andúril | 安都瑞尔之剑");
        andim.setLore(Arrays.asList("","§9Gain speed1 and resistance1 while holding","","§cNo Anvils"));
        andim.addEnchant(Enchantment.DAMAGE_ALL, 3, true);
        and.setItemMeta(andim);

        ItemMeta scyim = scy.getItemMeta();
        assert scyim != null;
        scyim.setDisplayName("§6Harvesting Scythe | 丰收镰刀");
        scyim.setLore(Arrays.asList("","§9What will a death's scythe do after fighting?","§9解甲归田","","§cReplaced Death'sScythe in Hypixel","","§cNo Anvils.",""));
        scyim.addEnchant(Enchantment.DIG_SPEED, 4, true);
        scyim.addEnchant(Enchantment.DURABILITY, 3, true);
        scyim.addEnchant(Enchantment.SILK_TOUCH, 1, true);
        scy.setItemMeta(scyim);

        ItemMeta fateim = fate.getItemMeta();
        assert fateim != null;
        fateim.setDisplayName("§6Chest of Fate | 命运之箱");
        fateim.setLore(Arrays.asList("","§9Get an OP Potion or EXPLOSION(reduce 10 hearts)",""));
        fate.setItemMeta(fateim);

        ItemMeta hornim = horn.getItemMeta();
        assert hornim != null;
        hornim.setDisplayName("§6Cornucopia | 丰饶之角");
        hornim.setLore(Arrays.asList("","§9Instant eat","§9Get 20 secs of Regeneration1 when eat",""));
        horn.setItemMeta(hornim);

        ItemMeta essim = ess.getItemMeta();
        assert essim != null;
        essim.setDisplayName("§6Essence of Yggdrasil | 大树精华");
        essim.setLore(Arrays.asList("","§9Gives you 30 enchanting levels","§9WON'T give back your enchanting table",""));
        ess.setItemMeta(essim);

        PotionMeta extim = (PotionMeta) ext.getItemMeta();
        assert extim != null;
        extim.setDisplayName("§6Deus Ex Machina | 无敌药水");
        extim.addEnchant(Enchantment.DURABILITY , 1, true);
        extim.setLore(Arrays.asList("","§9Just think it as an Ex-star","§9But also harms you a little","§9Wait did I say a little?","§9Recipe Changed",""));
        extim.setColor(Color.fromRGB(123,104,238));
        extim.setBasePotionData(new PotionData(PotionType.WATER));
        PotionEffect extpe1 = new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 3, true ,true, true);
        PotionEffect extpe2 = new PotionEffect(PotionEffectType.HARM, 1, 1, true, true, true);
        extim.addCustomEffect(extpe1, true);
        extim.addCustomEffect(extpe2, true);
        ext.setItemMeta(extim);

        ItemMeta vBoxim = vBox.getItemMeta();
        assert vBoxim != null;
        vBoxim.setDisplayName("§6Void Chest | 虚空箱");
        vBoxim.setLore(Arrays.asList("","§9Can do a one-time teleport","§9Place one someplace","§9Then place another one at another places","§9Click anyone","§9Teleport you to the other V-chest","§9Note: Main.inst chest can be destoried","§9Sounds easy as pie isn't it","§9Recipe Changed",""));
        vBox.setItemMeta(vBoxim);

        ItemMeta diceim = dice.getItemMeta();
        assert diceim != null;
        diceim.setDisplayName("§6Dice of God | 命运骰子");
        diceim.setLore(Arrays.asList("","§9Get an extra ultimate except Main.inst one","§9Also have chances to get Christmas Cookies"));
        dice.setItemMeta(diceim);

        ItemMeta rodim = rod.getItemMeta();
        assert rodim != null;
        rodim.setDisplayName("§6King's Rod | 王者钓竿");
        rodim.setLore(Arrays.asList("","§9Was used by TaiGong-Jiang you know?","§9姜太公用过的","§9And get 3 gold nuggets per item","","§cNo Anvils.",""));
        rodim.addEnchant(Enchantment.LUCK, 10, true);
        rodim.addEnchant(Enchantment.DURABILITY, 10, true);
        rodim.addEnchant(Enchantment.LURE, 5, true);
        rod.setItemMeta(rodim);

        SpawnEggMeta skeim = (SpawnEggMeta) ske.getItemMeta();
        assert skeim != null;
        skeim.setDisplayName("§6Daredevil | 骷髅战马");
        skeim.setLore(Arrays.asList("","§cType: §6Skeleton Horse","§c - Health: §625 Hearts","§c - Speed: §6Max ","§c - Jump: §63 Blocks","§9With Saddles",""));
        ske.setItemMeta(skeim);

        PotionMeta flaim = (PotionMeta) fla.getItemMeta();
        assert flaim != null;
        flaim.setDisplayName("§6Flask of Music | 天籁之瓶");
        flaim.setLore(Arrays.asList("","§9A paradise and a nether?","§9Recipe Changed","","§cReplaced FlaskofCleansing in Hypixel",""));
        flaim.addEnchant(Enchantment.DURABILITY,1 ,true);
        flaim.setColor(Color.fromRGB(123,104,238));
        flaim.setBasePotionData(new PotionData(PotionType.WATER));
        PotionEffect flape  = new PotionEffect(PotionEffectType.HEAL, 1, 2, true, true, true);
        PotionEffect flape1 = new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 100, 1, true, true, true);
        PotionEffect flape2 = new PotionEffect(PotionEffectType.SATURATION, 100, 1, true, true,true);
        flaim.addCustomEffect(flape1, true);
        flaim.addCustomEffect(flape2, true);
        flaim.addCustomEffect(flape,  true);
        flaim.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        fla.setItemMeta(flaim);

        ItemMeta vidim = vid.getItemMeta();
        assert vidim != null;
        vidim.setDisplayName("§6Shoes of Vider | 维达战靴");
        vidim.setLore(Arrays.asList("","§cNo Anvils",""));
        vidim.addEnchant(Enchantment.DEPTH_STRIDER, 2, true);
        vidim.addEnchant(Enchantment.DURABILITY, 3 ,true);
        vidim.addEnchant(Enchantment.PROTECTION_PROJECTILE, 2, true);
        vidim.addEnchant(Enchantment.THORNS, 1, true);
        vid.setItemMeta(vidim);

        PotionMeta valim = (PotionMeta) val.getItemMeta();
        assert valim != null;
        valim.setDisplayName("§6Potion of Vitality | 活力药水");
        valim.setLore(Arrays.asList("","§9Leeeeet theeeeeee baaaaaas kiiiiiiiick(From author in vitality)","§9It has a better statement now",""));
        valim.addEnchant(Enchantment.DURABILITY, 1, true);
        PotionEffect valpe1= new PotionEffect(PotionEffectType.SPEED, 240, 2,true, true, true);
        PotionEffect valpe2= new PotionEffect(PotionEffectType.REGENERATION, 160, 2, true);
        valim.addCustomEffect(valpe1, true);
        valim.addCustomEffect(valpe2, true);
        valim.setColor(Color.fromRGB(123,104,238));
        valim.setBasePotionData(new PotionData(PotionType.WATER));
        val.setItemMeta(valim);

        ItemMeta blsim = bls.getItemMeta();
        assert blsim != null;
        blsim.setDisplayName("§6Miner's Blessing | 矿神的祝福");
        blsim.setLore(Arrays.asList("","§9Gain eff & sharp1 after breaking 100 blocks","§9     eff & sharp2 after breaking 300 blocks","§9    eff & sharp3 after breaking 600 blocks","§9    eff & sharp3 after breaking 1000 blocks","§9     eff & sharp4 after breaking 1400 blocks","§9     eff & sharp5 after breaking 1700 blocks","§9Get Haste1 while holding","Every 100 broken gives Regen1 for 5sec","§9Recipe Changed","","§cNo Anvils",""));
        bls.setItemMeta(blsim);

        ItemMeta ambim = amb.getItemMeta();
        assert ambim != null;
        ambim.addEnchant(Enchantment.ARROW_DAMAGE, 3, true);
        ambim.setDisplayName("§6Ambrosia | 仙馔密酒");
        ambim.setLore(Arrays.asList("","§9Make any potion to level 3 and reduce 20% of the duration",""));
        amb.setItemMeta(ambim);

        ItemMeta lusim = lus.getItemMeta();
        assert lusim != null;
        lusim.setDisplayName("§6BloodLust | 夺魂剑");
        lusim.setLore(Arrays.asList("","§9Gain sharp2 on 10 kills","§9     sharp3 on 30 kills","§9     sharp4 on 60 kills","§9     sharp5 on 100 kills","","'Kill' Means Slaining Any Entities",""));
        lusim.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
        lus.setItemMeta(lusim);

        ItemMeta allim = all.getItemMeta();
        assert allim != null;
        allim.setDisplayName("§6ComBow | 全能弓");
        allim.setLore(Arrays.asList("","§9小孩子才做选择，我全都要","§9Only children make choices, I will take all","§9(Actually Main.inst is because im lazy)","§9Will give your target a lightning for 1 heart","","§cReplaced ModularBow in Hypixel",""));
        allim.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);
        allim.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
        all.setItemMeta(allim);

        ItemMeta epsim = eps.getItemMeta();
        assert epsim != null;
        epsim.setDisplayName("§6Expert Seal | 大师密卷");
        epsim.setLore(Arrays.asList("","§9这不是黄冈密卷和五三密卷","§9Every item's every ench level will raise by 1","§9Recipe Changed(Hardest one)",""));
        eps.setItemMeta(epsim);

        ItemMeta spdim = spd.getItemMeta();
        assert spdim != null;
        spdim.setDisplayName("§6Hermes' Boots | 赫尔墨斯飞靴");
        spdim.setLore(Arrays.asList("","§9Can't stooooooooooop","§9出现了,炫迈代言人!","§9Get Speed3 while wearing","§9Recipe Changed",""));
        spdim.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
        spdim.addEnchant(Enchantment.PROTECTION_FALL, 1, true);
        spdim.addEnchant(Enchantment.DURABILITY, 2 ,true);
        spd.setItemMeta(spdim);

        ItemMeta rageim = rage.getItemMeta();
        assert rageim != null;
        rageim.setDisplayName("§6Barbarian Chestplate | 愤怒胸甲");
        rageim.setLore(Arrays.asList("","§9Get Resistance1 and Strength1 while wearing",""));
        rageim.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
        rage.setItemMeta(rageim);

        ItemMeta ftim = ft.getItemMeta();
        assert ftim != null;
        ftim.setDisplayName("§6Fate's Call | 命运召唤");
        ftim.setLore(Arrays.asList("","§9Get a result for a random recipe","§9Depends on your luck","§9Another 2 ultimates are not useful totally","§9So I deleted them :D",""));
        ft.setItemMeta(ftim);

        CompassMeta htim = (CompassMeta) ht.getItemMeta();
        assert htim != null;
        htim.setDisplayName("§aHunter's Compass | 猎人罗盘");
        htim.setLore(Arrays.asList("","§9Sounds fimilar?","§9Point to a random player","","§cCustom",""));
        htim.addEnchant(Enchantment.DURABILITY, 1, true);
        htim.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        //测试内容
        ItemMeta stickim = stick.getItemMeta();
        AttributeModifier spdMain = new AttributeModifier(UUID.randomUUID(), "SpeedUpMain", 1.5, AttributeModifier.Operation.ADD_SCALAR, EquipmentSlot.HAND);
        AttributeModifier spdOff = new AttributeModifier(UUID.randomUUID(), "SpeedUpOff", 1.5, AttributeModifier.Operation.ADD_SCALAR, EquipmentSlot.OFF_HAND);
        assert stickim != null;
        stickim.setDisplayName("§aAlpenstock | 登山杖");
        stickim.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, spdMain);
        stickim.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, spdOff);
        stickim.setLore(Arrays.asList("","§9Provide speed1 when holding","","§cFeature By JoeMichaelQiao",""));
        stickim.addEnchant(Enchantment.DURABILITY, 1, true);
        stickim.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        stick.setItemMeta(stickim);
    }

    public static ItemStack makeHead(@Nonnull Player who, Entity killer)
    {
        ItemStack head = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta im = (SkullMeta) head.getItemMeta();
        String name = who.getName();
        String kname = killer.getName();
        assert im != null;
        im.setOwnerProfile(who.getPlayerProfile());
        im.setDisplayName(ChatColor.YELLOW + name + "的头颅");
        im.setLore(Arrays.asList("", ChatColor.GREEN + "击杀者: " + kname, ""));
        head.setItemMeta(im);
        return head;
    }
}
