package me.starboy.projects.ServerOptimization;

import me.starboy.projects.Utils.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AnalyticsModeOn implements CommandExecutor{

    public boolean onCommand(CommandSender sender, Command command, String cmd,String[] args) {
        if(cmd.equalsIgnoreCase("analytics")) {
            if(args.length == 0) {
                sender.sendMessage(Color.add("&CInvaild command please use /analytics on or /analyticsmode help"));
                return true;
            } else {
                if(args[0].equalsIgnoreCase("on")) {

                }
            }
            if(sender instanceof Player) {
                sender.sendMessage(Color.add("Does not work inside the console"));
            }

            Player player = (Player) sender;


            player.sendMessage(Color.add("&AThis server is on analytics mode"));




        }
        return true;

    }
}
