package com.nametagedit.plugin.hooks;

import com.nametagedit.plugin.NametagHandler;
import lombok.AllArgsConstructor;
import me.glaremasters.guilds.api.events.base.GuildEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

@AllArgsConstructor
public class HookGuilds implements Listener {

    private NametagHandler handler;

    @EventHandler
    public void onGuildEvent(GuildEvent event) {
        Player player = Bukkit.getPlayerExact(event.getPlayer().getName());
        if (player != null) {
            handler.applyTagToPlayer(player, false);
        }
    }

}