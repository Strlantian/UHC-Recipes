package com.jmqstudio.strlantian.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public final class HelpPage implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sd, Command cmd, String label, String[] str)
    {
        if(str.length == 0)
        {
            sd.sendMessage(ChatColor.GOLD + "UHCRecipes -- By STRlantian");
            sd.sendMessage(ChatColor.LIGHT_PURPLE + "====================");
            sd.sendMessage(ChatColor.GREEN + "描述: 提供UHC所需配方(根据Hypixel),并适当改进以适应生存");
            sd.sendMessage(ChatColor.GREEN + "查看配方: /uhcrecipes(无需加页码)");
            sd.sendMessage(ChatColor.GREEN + "查看帮助: /uhchelp");
            sd.sendMessage(ChatColor.GREEN + "联系作者: B站名 这里是陌蓝qwq");
            sd.sendMessage(ChatColor.GREEN + "作者第一次做挺大的插件,还请大佬多多指教qwq");
            sd.sendMessage(ChatColor.RED + "特别鸣谢: JoeMichaelQiao, MrKBear");
            sd.sendMessage(ChatColor.LIGHT_PURPLE + "====================");
            sd.sendMessage(ChatColor.GOLD + "Have Fun! ovo");
        }
        else
        {
            sd.sendMessage(ChatColor.RED + "你能别瞎输入吗");
        }
        return true;
    }
}
