package me.starboy.projects.EventsGUI;

import me.starboy.projects.Utils.Color;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class RewardsEvents implements Listener {

    @EventHandler
    public void InvClick(InventoryClickEvent event)
    {
        if (event.getClickedInventory() == null) return;
        String title = event.getClickedInventory().getTitle();
        if (title.equals(Color.add("&2&lPoints Manager"))) {
            event.setCancelled(true);

            switch (event.getCurrentItem().getType())
            {
                case ENDER_CHEST:
            }

        }
    }
}
