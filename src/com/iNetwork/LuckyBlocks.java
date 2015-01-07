package com.iNetwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class LuckyBlocks extends JavaPlugin implements Listener{
	
	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
    public void onBlockBreak(BlockBreakEvent event){
        Random rand = new Random();
        
        ItemStack LuckySwordEnchant = new ItemStack (Material.GOLD_SWORD, 1);
        ItemMeta LuckySwordEnchantMeta = LuckySwordEnchant.getItemMeta();
        LuckySwordEnchantMeta.addEnchant(Enchantment.DAMAGE_ALL, 15, true);
        LuckySwordEnchantMeta.addEnchant(Enchantment.KNOCKBACK, 10, true);
        LuckySwordEnchantMeta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 10, true);
        LuckySwordEnchantMeta.addEnchant(Enchantment.DURABILITY, 10, true);
        LuckySwordEnchantMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Lucky Sword");
        LuckySwordEnchant.setItemMeta(LuckySwordEnchantMeta);
        
        ItemStack LuckyHelmet = new ItemStack (Material.GOLD_SWORD, 1);
        ItemMeta LuckyHelmetMeta = LuckySwordEnchant.getItemMeta();
        LuckyHelmetMeta.addEnchant(Enchantment.DAMAGE_ALL, 15, true);
        LuckyHelmetMeta.addEnchant(Enchantment.KNOCKBACK, 10, true);
        LuckyHelmetMeta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 10, true);
        LuckyHelmetMeta.addEnchant(Enchantment.DURABILITY, 10, true);
        LuckyHelmetMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Lucky Sword");
        LuckyHelmet.setItemMeta(LuckyHelmetMeta);
        
        
        if(event.getBlock().getType() == Material.SPONGE){
            List<ItemStack> gift = new ArrayList<ItemStack>();
            gift.add(new ItemStack(Material.DIAMOND));
            gift.add(new ItemStack(Material.PAPER));
            gift.add(new ItemStack(Material.COCOA));
            gift.add(new ItemStack(Material.PAPER));
            gift.add(new ItemStack(Material.GLASS));
            gift.add(new ItemStack(Material.EYE_OF_ENDER));
            gift.add(new ItemStack(Material.MELON_SEEDS));
            gift.add(new ItemStack(Material.MELON_STEM));
            gift.add(new ItemStack(Material.FIREWORK_CHARGE));
            gift.add(new ItemStack(Material.STICK));
            gift.add(new ItemStack(LuckySwordEnchant));
            gift.add(new ItemStack(Material.GOLDEN_CARROT));
            gift.add(new ItemStack(Material.GOLD_INGOT));
            gift.add(new ItemStack(Material.WHEAT));
            gift.add(new ItemStack(Material.GOLD_BLOCK));
            gift.add(new ItemStack(Material.AIR));;
            gift.add(new ItemStack(Material.GOLD_AXE));
            gift.add(new ItemStack(Material.ROTTEN_FLESH));
            ItemStack m = gift.get(rand.nextInt(gift.size()));
            Player p = event.getPlayer();
            p.getInventory().addItem(m);
        }
	}
}
