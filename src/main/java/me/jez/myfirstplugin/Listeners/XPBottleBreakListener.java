package me.jez.myfirstplugin.Listeners;

import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.meta.FireworkMeta;

public class XPBottleBreakListener implements Listener {
    @EventHandler
    public void onProjectileHit(ProjectileHitEvent e) {
        Entity entity = e.getEntity();
        Player player = (Player) e.getEntity().getShooter();
        if ((entity instanceof ThrownExpBottle) && player != null) {
            Location location = e.getHitBlock().getLocation();
//            e.getHitBlock().getWorld().spawnEntity(location, EntityType.FIREWORK);
            this.firework(player, entity);
            System.out.println("TRIPLED BY EXP BOTTLE");
        }
    }
    public void firework (Player player, Entity entity){

        Firework firework = (Firework) player.getWorld().spawnEntity(entity.getLocation(), EntityType.FIREWORK);
        FireworkMeta meta = firework.getFireworkMeta();
        FireworkEffect.Builder builder = FireworkEffect.builder();
        builder.withTrail().withFlicker().withFade(Color.GREEN, Color.WHITE, Color.YELLOW,
                        Color.BLUE, Color.FUCHSIA, Color.PURPLE, Color.MAROON, Color.LIME, Color.ORANGE)
                .with(FireworkEffect.Type.BALL_LARGE).withColor(Color.GREEN);
        meta.addEffect(builder.build());
        meta.setPower(4);
        firework.setFireworkMeta(meta);
        firework.setMaxLife(50);

    }
    @EventHandler
    public void onXPBottleBreak(ExpBottleEvent e){
        e.setShowEffect(false);
    }
}
