package com.sworddash.sworddash;

import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import java.text.SimpleDateFormat;
import java.util.Calendar;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import com.sworddash.sworddash.*;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Main extends JavaPlugin implements Listener {
	
	ConsoleCommandSender consol = Bukkit.getConsoleSender();
	public static HashMap<UUID, Integer> map = new HashMap<UUID, Integer>(); 
	
	@Override
	public void onEnable() {
		consol.sendMessage( ChatColor.AQUA + "[THIS PLUGIN'S ORIGINAL COPYRIGHT IS OCCUPIED BY CAPTAIN0POTLID IN GITHUB]");
		getServer().getPluginManager().registerEvents(this, this);
    	getCommand("sworddash").setExecutor(new Commanddash());
	}

	@EventHandler
	public void PlayerInteract(PlayerInteractEvent e) {
		
		if(!(e.getAction() == Action.LEFT_CLICK_AIR) || !(e.getAction() == Action.LEFT_CLICK_AIR)) return;
		
		Player p = e.getPlayer();
		Block b = p.getTargetBlock(null, 50);
		
		if(e.getAction() == Action.LEFT_CLICK_AIR || e.getAction() == Action.LEFT_CLICK_AIR ) {
			if(p.getItemInHand().getItemMeta().getDisplayName().contentEquals("DASH SWORD")) {
				
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20*5, 2));
				
				Vector unitVector = new Vector(p.getLocation().getDirection().getX(),p.getLocation().getDirection().getY(),p.getLocation().getDirection().getZ());
				unitVector = unitVector.normalize();
				unitVector.multiply(2.2);
				
				p.setVelocity(unitVector);
				
				Location loc = p.getLocation();
				
				p.getWorld().playEffect( loc, Effect.MOBSPAWNER_FLAMES, 0);
				p.getWorld().playEffect( loc, Effect.MOBSPAWNER_FLAMES, 0);
				p.getWorld().playEffect( loc, Effect.MOBSPAWNER_FLAMES, 0);
				p.getWorld().playEffect( loc, Effect.MOBSPAWNER_FLAMES, 0);
				p.getWorld().playEffect( loc, Effect.MOBSPAWNER_FLAMES, 0);
				p.getWorld().playEffect( loc, Effect.MOBSPAWNER_FLAMES, 0);
				p.getWorld().playEffect( loc, Effect.MOBSPAWNER_FLAMES, 0);
				p.getWorld().playEffect( loc, Effect.MOBSPAWNER_FLAMES, 0);
				p.getWorld().playEffect( loc, Effect.MOBSPAWNER_FLAMES, 0);
				p.getWorld().playEffect( loc, Effect.MOBSPAWNER_FLAMES, 0);
				p.getWorld().playEffect( loc, Effect.MOBSPAWNER_FLAMES, 0);
				p.getWorld().playEffect( loc, Effect.MOBSPAWNER_FLAMES, 0);
				p.getWorld().playEffect( loc, Effect.MOBSPAWNER_FLAMES, 0);
				p.getWorld().playEffect( loc, Effect.MOBSPAWNER_FLAMES, 0);
				p.getWorld().playEffect( loc, Effect.MOBSPAWNER_FLAMES, 0);
				p.getWorld().playEffect( loc, Effect.MOBSPAWNER_FLAMES, 0);
				p.getWorld().playEffect( loc, Effect.MOBSPAWNER_FLAMES, 0);
				p.getWorld().playEffect( loc, Effect.MOBSPAWNER_FLAMES, 0);
				p.getWorld().playEffect( loc, Effect.MOBSPAWNER_FLAMES, 0);
				p.getWorld().playEffect( loc, Effect.MOBSPAWNER_FLAMES, 0);
				
				return;
			}
		}
		return;	
	}
}