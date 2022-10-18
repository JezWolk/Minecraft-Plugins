package me.jez.myfirstplugin.Listeners;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkLoadEvent;
public class DiamondWorld implements Listener{
    @EventHandler
    public void onWorld(ChunkLoadEvent e){
       int x = e.getChunk().getX() << 4;
       int z = e.getChunk().getZ() << 4;
       World world = e.getWorld();
        for(int xx = x; xx < x + 16; xx++) {
            for(int zz = z; zz < z + 16; zz++) {
                for(int yy = 0; yy < 256; yy++) {
                    Block block = e.getWorld().getBlockAt(xx, yy, zz);
                    if (block.getType() == Material.OAK_LOG){
                        block.setType(Material.DIAMOND_BLOCK);
//                        System.out.println("DOGGY");
                    }
                    if (block.getType() == Material.OAK_LEAVES){
                        block.setType(Material.EMERALD_BLOCK);
                    }
                }
            }
        }
    }
}
