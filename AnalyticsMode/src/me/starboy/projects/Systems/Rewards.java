package me.starboy.projects.Systems;

import me.starboy.projects.Utils.Color;
import me.starboy.projects.Utils.Item;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Rewards implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String cmd, String[] args) {
        if (cmd.equalsIgnoreCase("rewards")) {
            if (args.length == 0) {
                sender.sendMessage(Color.add("&CInvaild command use /rewards set "));
                return true;
            } else {
                if (args[0].equalsIgnoreCase("set")) {

                }
            }

            // Command Ends here!


            //You must have this code in order for player to send messages,Permissions etc.
            Player player = (Player) sender;
            //You must have this code in order for player to send messages,Permissions etc.

            //Permission starts here
            if(player.hasPermission("am.use.rewards")) {

                Inventory inventory = Bukkit.createInventory(null,54,Color.add("&B&LSelect &F&La reward"));

                ItemStack basic = Item.create(Material.ENDER_CHEST,1,"&B&LBasic Reward Machine","&7Gives 10x Diamond to the player who uses this");















                inventory.setItem(22,basic);
                player.openInventory(inventory);


            } else  {
                sender.sendMessage(Color.add("&CYou do not have permission to execute this command!"));
                return true;

            }

            //This is code is to not let anyone execute this command via console.
            if(!(sender instanceof Player)) {
                sender.sendMessage(Color.add(""));
                return true;
            }
            //This is code is to not let anyone execute this command via console.


           //These are the ending statments but keep in mind that you can add code here too!


           //Enter other code here
























        }
        return true;
    }
}