package com.jmqstudio.strlantian.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;
import java.util.Arrays;
import java.util.List;

import static com.jmqstudio.strlantian.Factory.GUI.*;
import static com.jmqstudio.strlantian.Factory.Ref.WHYRUCON;

public final class OpenGUI implements TabExecutor
{
    @Override
    public boolean onCommand(@Nonnull CommandSender sd, @Nonnull Command cmd, @Nonnull String label,@Nonnull String[] s)
    {
        if(!(sd instanceof Entity))
        {
            System.out.println(WHYRUCON);
            return true;
        }
        Player pl = Bukkit.getPlayer(sd.getName());
        assert pl != null;
        if(s.length == 0)
        {
            pl.openInventory(pg1);
        }
        else
        {
            switch (s[0])
            {
                case "1" -> pl.openInventory(pg1);
                case "2" -> pl.openInventory(pg2);
                case "3" -> pl.openInventory(pg3);
                case "4" -> pl.openInventory(pg4);
                default -> pl.sendMessage(ChatColor.RED + "你输入的值不对");
            }
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
        if(s.length > 1)
        {
            return null;
        }
        if(s.length == 1)
        {
            return Arrays.asList("1", "2", "3", "4", null);
        }
        return null;
    }
}
