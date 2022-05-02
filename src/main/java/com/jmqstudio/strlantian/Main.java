package com.jmqstudio.strlantian;

import com.jmqstudio.strlantian.Commands.HelpPage;
import com.jmqstudio.strlantian.Commands.OpenGUI;
import com.jmqstudio.strlantian.Listeners.AboutPlayers;
import com.jmqstudio.strlantian.Listeners.GUIPage;
import com.jmqstudio.strlantian.Listeners.ItemEffects;
import com.jmqstudio.strlantian.Listeners.RecipePage;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

import static com.jmqstudio.strlantian.Factory.Recipes.*;

public final class Main extends JavaPlugin
{
    public static JavaPlugin inst;

    @Override
    public void onEnable()
    {
        inst = this;

        getLogger().info(ChatColor.GREEN + "UHCRecipes is enabled");
        getLogger().info(ChatColor.GREEN + "Use /uhcrecipes to check UHC recipes");

        Bukkit.getPluginManager().registerEvents(new GUIPage(), this);
        Bukkit.getPluginManager().registerEvents(new ItemEffects(), this);
        Bukkit.getPluginManager().registerEvents(new AboutPlayers(), this);
        Bukkit.getPluginManager().registerEvents(new RecipePage(),this);
        Objects.requireNonNull(Bukkit.getPluginCommand("uhcrecipes")).setExecutor(new OpenGUI());
        Objects.requireNonNull(Bukkit.getPluginCommand("uhchelp")).setExecutor(new HelpPage());

        Bukkit.addRecipe(leapkrc);
        Bukkit.addRecipe(appHelrc);
        Bukkit.addRecipe(appSworc);
        Bukkit.addRecipe(appBowrc);
        Bukkit.addRecipe(appShieldrc);
        Bukkit.addRecipe(vpSworc);
        Bukkit.addRecipe(sharpBrc);
        Bukkit.addRecipe(powBrc);
        Bukkit.addRecipe(dragSworc);
        Bukkit.addRecipe(projBrc);
        Bukkit.addRecipe(protBrc);
        Bukkit.addRecipe(dragCherc);
        Bukkit.addRecipe(dustrc);
        Bukkit.addRecipe(wartrc);
        Bukkit.addRecipe(necrc);
        Bukkit.addRecipe(netArtrc);
        Bukkit.addRecipe(steakrc);
        Bukkit.addRecipe(tourc);
        Bukkit.addRecipe(spkCherc);
        Bukkit.addRecipe(sevBotrc);
        Bukkit.addRecipe(ipkrc);
        Bukkit.addRecipe(obsrc);
        Bukkit.addRecipe(tarnrc);
        Bukkit.addRecipe(fortPicrc);
        Bukkit.addRecipe(exprc);
        Bukkit.addRecipe(ltAnvrc);
        Bukkit.addRecipe(ltEncrc);
        Bukkit.addRecipe(thoBrc);
        Bukkit.addRecipe(wisArc);
        Bukkit.addRecipe(melonrc);
        Bukkit.addRecipe(aspPtrc);
        Bukkit.addRecipe(gApplerc);
        Bukkit.addRecipe(hdrc);
        Bukkit.addRecipe(pBoxrc);
        Bukkit.addRecipe(panPrc);
        Bukkit.addRecipe(cBowrc);
        Bukkit.addRecipe(arrowrc);
        Bukkit.addRecipe(sadrc);
        Bukkit.addRecipe(velPtrc);
        Bukkit.addRecipe(ferrc);
        Bukkit.addRecipe(forgerc);
        Bukkit.addRecipe(qkPicrc);
        Bukkit.addRecipe(lumrc);
        Bukkit.addRecipe(eBookrc);
        Bukkit.addRecipe(gpkrc);
        Bukkit.addRecipe(sugrc);
        Bukkit.addRecipe(chestrc);
        Bukkit.addRecipe(fsrc);
        Bukkit.addRecipe(shearrc);
        Bukkit.addRecipe(deprc);
        Bukkit.addRecipe(frsrc);
        Bukkit.addRecipe(caBorc);
        Bukkit.addRecipe(atmrc);
        Bukkit.addRecipe(harmrc);
        Bukkit.addRecipe(exurc);
        Bukkit.addRecipe(legrc);
        Bukkit.addRecipe(fateBrc);
        Bukkit.addRecipe(drAxerc);
        Bukkit.addRecipe(exrc);
        Bukkit.addRecipe(andrc);
        Bukkit.addRecipe(scyrc);
        Bukkit.addRecipe(faterc);
        Bukkit.addRecipe(hornrc);
        Bukkit.addRecipe(essrc);
        Bukkit.addRecipe(extrc);
        Bukkit.addRecipe(dicerc);
        Bukkit.addRecipe(vBoxrc);
        Bukkit.addRecipe(rodrc);
        Bukkit.addRecipe(skerc);
        Bukkit.addRecipe(flarc);
        Bukkit.addRecipe(vidrc);
        Bukkit.addRecipe(valrc);
        Bukkit.addRecipe(blsrc);
        Bukkit.addRecipe(ambrc);
        Bukkit.addRecipe(lusrc);
        Bukkit.addRecipe(epsrc);
        Bukkit.addRecipe(spdrc);
        Bukkit.addRecipe(ragerc);
        Bukkit.addRecipe(ftrc);
        Bukkit.addRecipe(flintrc);
        Bukkit.addRecipe(cpkrc);
        Bukkit.addRecipe(egApplerc);
        Bukkit.addRecipe(htrc);
        Bukkit.addRecipe(stickrc);
    }

    @Override
    public void onDisable()
    {
        getLogger().info(ChatColor.YELLOW + "UHCRecipes is disabled");
    }

    @Override
    public void onLoad()
    {
        getLogger().info(ChatColor.GREEN + "UHCRecipes is loaded");
    }
}
