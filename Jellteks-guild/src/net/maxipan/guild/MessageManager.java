package net.maxipan.guild;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class MessageManager {
	
	private MessageManager() { } 
	
	private static MessageManager instance = new MessageManager();
	
	public static MessageManager getInstance() {
		return instance;
	}
	
	private String[] prefix = {
			ChatColor.DARK_RED  + "" + ChatColor.BOLD + "(!) " + ChatColor.GRAY,
			ChatColor.YELLOW  + "" + ChatColor.BOLD + "(!) " + ChatColor.GRAY
	};
	
	public void info(Player p, String msg, boolean sound) {
		if (sound) {
			p.sendMessage(prefix[1] + msg);
			p.playSound(p.getLocation(), "random.orb", 100, 100);
		} else {
			p.sendMessage(prefix[1] + msg);
		}
	}
	
	public void severe(Player p, String msg, boolean sound) {
		if (sound) {
			p.sendMessage(prefix[0] + msg);
			p.playSound(p.getLocation(), "note.bassattack", 100, 100);
		} else {
			p.sendMessage(prefix[0] + msg);
		}
	}

}
