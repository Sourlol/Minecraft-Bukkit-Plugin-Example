package com.sourdev.util;

import com.sourdev.MyFirstPlugin;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

public class EventUtil {
    public static void register(Listener listener) {
        Bukkit.getServer().getPluginManager().registerEvents(listener, MyFirstPlugin.getInstance());
    }
}
