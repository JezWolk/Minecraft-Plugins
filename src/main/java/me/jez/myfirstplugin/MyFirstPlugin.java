package me.jez.myfirstplugin;

import me.jez.myfirstplugin.Listeners.CreeperExplosionListener;
import me.jez.myfirstplugin.Listeners.ShearSheepListener;
import me.jez.myfirstplugin.Listeners.XPBottleBreakListener;
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