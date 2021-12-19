package com.sourdev;

import com.sourdev.commands.Feed;
import com.sourdev.commands.Heal;
import com.sourdev.commands.Spawn;
import com.sourdev.commands.Sword;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class MyFirstPlugin extends JavaPlugin {
    private static MyFirstPlugin instance;

    @Override
    public void onEnable() {
        instance = this;

        System.out.println("The plugin has been enabled.");

        saveDefaultConfig();

        Bukkit.getPluginManager().registerEvents(new HelloWorld(), this);
        getCommand("heal").setExecutor(new Heal());
        new Feed();
        new Spawn(this);
        new Sword();
    }

    @Override
    public void onDisable() {
        System.out.println("The plugin has been disabled.");
    }

    public static MyFirstPlugin getInstance() {
        return instance;
    }
}
