package me.jez.mcplugins;

import me.jez.mcplugins.Listeners.CreeperExplosionListener;
import me.jez.mcplugins.Listeners.JoinLeaveListener;
import me.jez.mcplugins.Listeners.ShearSheepListener;
import me.jez.mcplugins.Listeners.XPBottleBreakListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class MyFirstPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("My first plugin has started!!!");

        getServer().getPluginManager().registerEvents(this,this);
        getServer().getPluginManager().registerEvents(new XPBottleBreakListener(),this);
        getServer().getPluginManager().registerEvents(new CreeperExplosionListener(),this);
        getServer().getPluginManager().registerEvents(new ShearSheepListener(),this);
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
    }
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        e.setJoinMessage("Welcome to my server monke!");
        System.out.println("A player has joined the server");
    }


}








//    @Override
//    public void onDisable() {
//        // Plugin shutdown logic
//        System.out.println("My first plugin has stopped!!!");
//    }