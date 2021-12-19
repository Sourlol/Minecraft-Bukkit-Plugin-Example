package com.sourdev.commands;

import com.sourdev.util.CommandBase;
import com.sourdev.util.Msg;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feed {
    public Feed() {
        new CommandBase("feed", 0, 1, true) {
            @Override
            public boolean onCommand(CommandSender sender, String [] arguments) {
                Player player = (Player) sender;
                player.setFoodLevel(20);
                Msg.send(player, "You have been fed.");
                return true;
            }

            @Override
            public String getUsage() {
                return "/feed";
            }
        }.enableDelay(2);
    }
}
