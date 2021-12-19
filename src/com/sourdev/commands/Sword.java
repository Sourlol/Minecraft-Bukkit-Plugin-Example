package com.sourdev.commands;

import com.sourdev.util.CommandBase;
import com.sourdev.util.ItemCreator;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Sword {
    public Sword() {
        new CommandBase("Sword", true) {
            @Override
            public boolean onCommand(CommandSender sender, String[] arguments) {
                Player player = (Player) sender;

                ItemCreator item = new ItemCreator(Material.DIAMOND_SWORD);
                item.setName("&aHello World");
                item.addLore("&cTest");
                item.addLore("&cTest 2");
                item.setUnbreakable(true);

                player.getInventory().addItem(item.getItemStack());
                return true;
            }

            @Override
            public String getUsage() {
                return "/sword";
            }
        };
    }
}
