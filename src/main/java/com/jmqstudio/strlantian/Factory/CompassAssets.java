package com.jmqstudio.strlantian.Factory;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public final class CompassAssets
{
    private static Player target;
    private static final Location loc = target.getLocation();
    public static Location getTargetLocation(Player user)
    {
        return loc;
    }
    public static void registerTarget(Player target)
    {
        CompassAssets.target = target;
    }
}