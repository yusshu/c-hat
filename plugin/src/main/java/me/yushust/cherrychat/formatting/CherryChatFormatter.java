package me.yushust.cherrychat.formatting;

import me.yushust.cherrychat.CherryChatPlugin;
import org.bukkit.entity.Player;

public class CherryChatFormatter extends DefaultFormatter {

    public CherryChatFormatter(CherryChatPlugin plugin) {
        super(plugin);
    }

    @Override
    public String format(Player player, String message) {
        return this.format(player, plugin.getConfig().getString("chat-format.format"), message);
    }

}
