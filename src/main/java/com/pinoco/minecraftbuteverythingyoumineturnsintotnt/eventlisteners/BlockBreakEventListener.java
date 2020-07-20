package com.pinoco.minecraftbuteverythingyoumineturnsintotnt.eventlisteners;

import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class BlockBreakEventListener implements Listener {

    public BlockBreakEventListener(JavaPlugin plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onBlockBreakEvent(BlockBreakEvent event) {
        Block block = event.getBlock();
        block.getWorld().spawnEntity(block.getLocation(), EntityType.PRIMED_TNT);
    }
}
