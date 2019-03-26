package me.starboy.projects;

import me.starboy.projects.EventsGUI.RewardsEvents;
import me.starboy.projects.ServerOptimization.AnalyticsModeOff;
import me.starboy.projects.ServerOptimization.AnalyticsModeOn;
import me.starboy.projects.Systems.Rewards;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class MainAnalyticsMode extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Analytics Mode is starting");
        this.getCommand("analytics").setExecutor(new AnalyticsModeOn());
        this.getCommand("turn").setExecutor(new AnalyticsModeOff());
        this.getCommand("rewards").setExecutor(new Rewards());
        Bukkit.getPluginManager().registerEvents(new RewardsEvents(),this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Analytics Mode is shutting down");
    }






}
