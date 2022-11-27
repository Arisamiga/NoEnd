package me.arisamiga.noend;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoendMain extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        // Register Listeners
        Bukkit.getPluginManager().registerEvents(this, this);

        // Plugin startup logic
        System.out.println("Successfully loaded NoEnd");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Successfully shutdown NoEnd");
    }

    @EventHandler
    public void onPortalTravel(PlayerPortalEvent event){
        if(event.getCause().equals(PlayerTeleportEvent.TeleportCause.END_PORTAL))
            event.setCancelled(true);
    }
}


