package com.sworddash.sworddash;

import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Commanddash implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            
            ItemStack item = new ItemStack(Material.WOOD_SWORD);
            ItemMeta meta = item.getItemMeta();
            
            meta.setDisplayName("DASH SWORD");
            meta.setLore(Arrays.asList(ChatColor.YELLOW + "LEFT CLICK TO DASH FORWARD"));
            item.setItemMeta(meta);
            
            player.getInventory().addItem(item);
        
        }
        
        return false;
    }
    
    
}