package com.jmqstudio.strlantian.Orientation;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import javax.annotation.Nonnull;
import java.util.Objects;
import java.util.UUID;

public final class CreateBar
{
    private static final ScoreboardManager MANAGER = Objects.requireNonNull(Bukkit.getScoreboardManager());

    public static Scoreboard getHealthBar(@Nonnull Player user, @Nonnull Scoreboard board)
    {
        int userHealth = (int) user.getHealth();
        Objective obj = board.registerNewObjective(UUID.randomUUID().toString(), "dummy", ChatColor.GREEN + "血量: " + ChatColor.RED + userHealth + "❤");
        obj.setDisplaySlot(DisplaySlot.BELOW_NAME);
        return board;
    }

    public static Scoreboard getTabHealth(@Nonnull Player user, @Nonnull Scoreboard board)
    {
        int userHealth = (int) user.getHealth();
        Objective obj = board.registerNewObjective(UUID.randomUUID().toString(), "dummy", ChatColor.RED + String.valueOf(userHealth) + "❤");
        obj.setDisplaySlot(DisplaySlot.PLAYER_LIST);
        return board;
    }
}
