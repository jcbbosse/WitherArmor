package me.ArtizanKnight.WitherArmor;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

import me.leoko.portal.AdvancedLicense;

public class main extends JavaPlugin implements Listener{
	//Item Stacks
	ItemStack dHelm = new ItemStack(Material.DIAMOND_HELMET);
	ItemStack dChest = new ItemStack(Material.DIAMOND_CHESTPLATE);
	ItemStack dLegs = new ItemStack(Material.DIAMOND_LEGGINGS);
	ItemStack dBoot = new ItemStack(Material.DIAMOND_BOOTS);
	ItemStack dSword = new ItemStack(Material.DIAMOND_SWORD);
	ItemStack dPick = new ItemStack(Material.DIAMOND_PICKAXE);
	@Override
	public void onEnable() {
		if(!new AdvancedLicense("YWO0-VIFX-EHR8-F1LY", "https://artizanknight.000webhostapp.com/webpanel/verify.php", this).setSecurityKey("YecoF0I6M05thxLeokoHuW8iUhTdIUInjkfF").register()) return;
		//Item enchants
		dHelm.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 7);
		dChest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 7);
		dLegs.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 7);
		dBoot.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 7);
		dHelm.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
		dChest.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
		dLegs.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
		dBoot.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
		dSword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 8);
		dSword.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
		dPick.addUnsafeEnchantment(Enchantment.DIG_SPEED, 5);
		dPick.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		//Item Names
		ItemMeta dHelmM = dHelm.getItemMeta();
		ItemMeta dChestM = dChest.getItemMeta();
		ItemMeta dLegsM = dLegs.getItemMeta();
		ItemMeta dBootM = dBoot.getItemMeta();
		ItemMeta dSwordM = dSword.getItemMeta();
		ItemMeta dPickM = dPick.getItemMeta();
		dHelmM.setDisplayName(ChatColor.AQUA + "Wither Helmet");
		dChestM.setDisplayName(ChatColor.AQUA + "Wither Chestplate");
		dLegsM.setDisplayName(ChatColor.AQUA + "Wither Leggings");
		dBootM.setDisplayName(ChatColor.AQUA + "Wither Boots");
		dSwordM.setDisplayName(ChatColor.AQUA + "Wither Sword");
		dPickM.setDisplayName(ChatColor.AQUA + "Wither Pickaxe");
		//Item Lore
		List<String> dHelmL = new ArrayList<>();
		dHelmL.add(ChatColor.WHITE + "Congrats! You have slayed enough withers to create this armor.");
		dHelmL.add("WitherArmor");
		dHelmL.add(ChatColor.WHITE + "Gives water breathing effect");
		List<String> dChestL = new ArrayList<>();
		dChestL.add(ChatColor.WHITE + "Congrats! You have slayed enough withers to create this armor.");
		dChestL.add("WitherArmor");
		dChestL.add(ChatColor.WHITE + "Gives night vision effect");
		List<String> dLegsL = new ArrayList<>();
		dLegsL.add(ChatColor.WHITE + "Congrats! You have slayed enough withers to create this armor.");
		dLegsL.add("WitherArmor");
		dLegsL.add(ChatColor.WHITE + "Gives fire resistance effect");
		List<String> dBootL = new ArrayList<>();
		dBootL.add(ChatColor.WHITE + "Congrats! You have slayed enough withers to create this armor.");
		dBootL.add("WitherArmor");
		dBootL.add(ChatColor.WHITE + "Gives speed effect");
		List<String> dSwordL = new ArrayList<>();
		dSwordL.add(ChatColor.WHITE + "Congrats! You have slayed enough withers to create this tool.");
		dSwordL.add("WitherArmor");
		dSwordL.add(ChatColor.WHITE + "Gives strength 1 effect");
		List<String> dPickL = new ArrayList<>();
		dPickL.add(ChatColor.WHITE + "Congrats! You have slayed enough withers to create this tool.");
		dPickL.add("WitherArmor");
		dPickL.add(ChatColor.WHITE + "Gives haste 1 effect");
		//Item lore setting
		dHelmM.setLore(dHelmL);
		dChestM.setLore(dChestL);
		dLegsM.setLore(dLegsL);
		dBootM.setLore(dBootL);
		dSwordM.setLore(dSwordL);
		dPickM.setLore(dPickL);
		//Setting Item Names/Meta
		dHelm.setItemMeta(dHelmM);
		dChest.setItemMeta(dChestM);
		dLegs.setItemMeta(dLegsM);
		dBoot.setItemMeta(dBootM);
		dSword.setItemMeta(dSwordM);
		dPick.setItemMeta(dPickM);

		//Name keys
		NamespacedKey dHelmKey = new NamespacedKey(this, "dHelm_Key");
		NamespacedKey dChestKey = new NamespacedKey(this, "dChest_Key");
		NamespacedKey dLegsKey = new NamespacedKey(this, "dLegs_Key");
		NamespacedKey dBootKey = new NamespacedKey(this, "dBoot_Key");
		NamespacedKey dSwordKey = new NamespacedKey(this, "dSword_Key");
		NamespacedKey dPickKey = new NamespacedKey(this, "dPick_Key");
		//Shaped Recipes
		ShapedRecipe dHelmR = new ShapedRecipe(dHelmKey, dHelm);
		ShapedRecipe dChestR = new ShapedRecipe(dChestKey, dChest);
		ShapedRecipe dLegsR = new ShapedRecipe(dLegsKey, dLegs);
		ShapedRecipe dBootR = new ShapedRecipe(dBootKey, dBoot);
		ShapedRecipe dSwordR = new ShapedRecipe(dSwordKey,dSword);
		ShapedRecipe dPickR = new ShapedRecipe(dPickKey,dPick);
		// Recipe shapes
		dHelmR.shape("   ","NNN","N N");
		dChestR.shape("N N","NNN","NNN");
		dLegsR.shape("NNN","N N","N N");
		dBootR.shape("   ","N N","N N");
		dSwordR.shape(" N "," N "," S ");
		dPickR.shape("NNN"," S "," S ");
		dHelmR.setIngredient('N', Material.NETHER_STAR);
		dChestR.setIngredient('N', Material.NETHER_STAR);
		dLegsR.setIngredient('N', Material.NETHER_STAR);
		dBootR.setIngredient('N', Material.NETHER_STAR);
		dSwordR.setIngredient('N', Material.NETHER_STAR);
		dSwordR.setIngredient('S', Material.STICK);
		dPickR.setIngredient('N', Material.NETHER_STAR);
		dPickR.setIngredient('S', Material.STICK);
		// Adding the recipes
		Bukkit.addRecipe(dHelmR);
		Bukkit.addRecipe(dChestR);
		Bukkit.addRecipe(dLegsR);
		Bukkit.addRecipe(dBootR);
		Bukkit.addRecipe(dSwordR);
		Bukkit.addRecipe(dPickR);

		new BukkitRunnable() {
	         public void run() {
	        	 for(Player player : Bukkit.getOnlinePlayers()){
	        		 //Helmet check
	        		 	if(player.getInventory().getHelmet() != null){
		        		 	List<String> dHelm1 = player.getInventory().getHelmet().getItemMeta().getLore();
		        		 	if(dHelm1.contains("WitherArmor")) {
		        		 		player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING,300,0));
		        		 	}
	        		 	}
	        		 	//Chestplate check
	        		 	if(player.getInventory().getChestplate() != null) {
		        		 	List<String> dChest1 = player.getInventory().getChestplate().getItemMeta().getLore();
		        		 	if(dChest1.contains("WitherArmor")) {
		        		 		player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION,300,0));
		        		 	}
	        		 	}
	        		 	//Leggings check
	        		 	if(player.getInventory().getLeggings() != null) {
		        		 	List<String> dLegs1 = player.getInventory().getLeggings().getItemMeta().getLore();
		        		 	if(dLegs1.contains("WitherArmor")) {
		        		 		player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE,300,0));
		        		 	}
	        		 	}
	        		 	//Boots check
	        		 	if(player.getInventory().getBoots() != null) {
		        		 	List<String> dBoot1 = player.getInventory().getBoots().getItemMeta().getLore();
		        		 	if(dBoot1.contains("WitherArmor")) {
		        		 		player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,300,0));
		        		 	}
	        		 	}
	        		 	
//	        		 	//Sword check
//	        		 	if(player.getInventory().getItemInMainHand() != null) {
//	        		 		if(player.getInventory().getItemInMainHand().hasItemMeta()) {
//	        		 			if(!player.getInventory().getItemInMainHand().isSimilar(dPick)/* || !player.getInventory().getItemInMainHand().isSimilar(dBoot) || !player.getInventory().getItemInMainHand().isSimilar(dChest) || !player.getInventory().getItemInMainHand().isSimilar(dHelm) || !player.getInventory().getItemInMainHand().isSimilar(dLegs) || !player.getInventory().getItemInMainHand().isSimilar(dBoot) || !player.getInventory().getItemInMainHand().isSimilar(dChest)*/) {
//	        		 				if(player.getInventory().getItemInMainHand() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore() != null) {
//	        		 					List<String> dSword1 = player.getInventory().getItemInMainHand().getItemMeta().getLore();
//	        		 					if(dSword1.contains("WitherArmor") && dSword1 != null) {
//	        		 						player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,300,0));
//	        		 					}
//	        		 				}
//	        		 			}
//	        		 		}
//	        		 	}
//	        		   //Pickaxe check
//	        		 	if(player.getInventory().getItemInMainHand() != null) {
//	        		 		if(player.getInventory().getItemInMainHand().hasItemMeta()) {
//	        		 			if(!player.getInventory().getItemInMainHand().isSimilar(dSword) || !player.getInventory().getItemInMainHand().isSimilar(dBoot) || !player.getInventory().getItemInMainHand().isSimilar(dChest) || !player.getInventory().getItemInMainHand().isSimilar(dHelm) || !player.getInventory().getItemInMainHand().isSimilar(dLegs) || !player.getInventory().getItemInMainHand().isSimilar(dBoot) || !player.getInventory().getItemInMainHand().isSimilar(dChest)) {
//	        		 				if(player.getInventory().getItemInMainHand() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore() != null) {
//	        		 					List<String> dPick1 = player.getInventory().getItemInMainHand().getItemMeta().getLore();
//	        		 					if(dPick1.contains("WitherArmor") && dPick1 != null) {
//	        		 						player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING,300,0));
//	        		 						return;
//	        		 					}
//	        		 				return;
//	        		 				}
//	        		 			return;
//	        		 			}
//	        		 		return;
//	        		 		}
//	        		 	return;
//	        		 	} 
	        		 	
	        	}
	        }
	     }.runTaskTimer(this, 20l, 20l);
	}
}