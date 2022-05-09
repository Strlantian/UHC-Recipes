package com.jmqstudio.strlantian.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Entity;

import javax.annotation.Nonnull;
import java.util.List;

import static com.jmqstudio.strlantian.Factory.Ref.WHYRUCON;

public final class HelpPage implements TabExecutor
{
    @Override
    public boolean onCommand(@Nonnull CommandSender sd, @Nonnull Command cmd,@Nonnull String label, String[] str)
    {
        if(str.length == 0)
        {
            sd.sendMessage(ChatColor.GOLD + "UHCRecipes -- By STRlantian");
            sd.sendMessage(ChatColor.LIGHT_PURPLE + "====================");
            sd.sendMessage(ChatColor.GREEN + "描述: 提供UHC所需配方(根据Hypixel),并适当改进以适应生存需要");
            sd.sendMessage(ChatColor.GREEN + "查看配方: /uhcrecipes");
            sd.sendMessage(ChatColor.GREEN + "查看帮助: /uhchelp");
            sd.sendMessage(ChatColor.GREEN + "联系作者: B站名 这里是陌蓝qwq[其他方式可见jar文件中的ABOUT]");
            sd.sendMessage(ChatColor.GREEN + "作者第一次做挺大的插件,还请大佬多多指教qwq");
            sd.sendMessage(ChatColor.RED + "特别鸣谢: JoeMichaelQiao, ThatRarityEG, MrKBear");
            sd.sendMessage(ChatColor.LIGHT_PURPLE + "====================");
            sd.sendMessage(ChatColor.GOLD + "Have Fun! ovo");
        }
        else
        {
            sd.sendMessage(ChatColor.RED + "你能别瞎输入吗");
        }
        return true;
    }

    @Override
    public List<String> onTabComplete(@Nonnull CommandSender sd,@Nonnull Command cmd,@Nonnull String label,@Nonnull String[] s)
    {
        if(!(sd instanceof Entity))
        {
            System.out.println(WHYRUCON);
            return null;
        }
        return null;
    }
}
