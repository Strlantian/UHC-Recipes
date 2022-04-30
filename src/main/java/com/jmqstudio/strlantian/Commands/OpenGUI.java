package com.jmqstudio.strlantian.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static com.jmqstudio.strlantian.Factory.GUI.*;

public final class OpenGUI implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sd, Command cmd, String label, String[] s)
    {
        Player pl = Bukkit.getPlayer(sd.getName());
        assert pl != null;
        if(s[0] == null)
        {
            pl.openInventory(pg1);
        }
        else
        {
            switch (s[0])
            {
                case "1" ->
                {
                    pl.openInventory(pg1);
                }
                case "2" ->
                {
                    pl.openInventory(pg2);
                }
                case "3" ->
                {
                    pl.openInventory(pg3);
                }
                case "4" ->
                {
                    pl.openInventory(pg4);
                }
                default ->
                {
                    pl.sendMessage(ChatColor.RED + "你输入的值不对");
                }
            }
        }
        return true;
    }
}
