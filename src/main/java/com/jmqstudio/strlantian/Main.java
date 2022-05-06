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
