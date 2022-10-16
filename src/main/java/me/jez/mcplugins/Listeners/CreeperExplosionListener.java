package me.jez.mcplugins.Listeners;

import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExplosionPrimeEvent;

public class CreeperExplosionListener implements Listener {
    @EventHandler
    public void onExplode(ExplosionPrimeEvent event) {
        Entity entity = event.getEntity();
        if (!(entity instanceof Creeper)) {
            return;
        }
        event.setRadius(0);
    }

}
