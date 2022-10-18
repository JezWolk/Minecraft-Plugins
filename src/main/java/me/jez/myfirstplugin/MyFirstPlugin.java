package me.jez.myfirstplugin;

import me.jez.myfirstplugin.Listeners.*;
import me.jez.myfirstplugin.commands.GodCommand;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class MyFirstPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("My first plugin has started!!!");

        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new XPBottleBreakListener(), this);
        getServer().getPluginManager().registerEvents(new CreeperExplosionListener(), this);
        getServer().getPluginManager().registerEvents(new ShearSheepListener(), this);
        getServer().getPluginManager().registerEvents(new DiamondWorld(), this);
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
        getCommand("god").setExecutor(new GodCommand());
    }
}