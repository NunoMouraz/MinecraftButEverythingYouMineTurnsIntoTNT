package com.pinoco.minecraftbuteverythingyoumineturnsintotnt;

import com.pinoco.minecraftbuteverythingyoumineturnsintotnt.eventlisteners.BlockBreakEventListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
       registerEventListeners();
    }

    private void registerEventListeners() {
        new BlockBreakEventListener(this);
    }
}
