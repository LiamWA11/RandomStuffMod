package com.liamwa11.randomStuff.recipe;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.liamwa11.randomStuff.blocks.BlocksMain;
import com.liamwa11.randomStuff.items.ItemsMain;

import cpw.mods.fml.common.registry.GameRegistry;

public class FurnaceRecipesMain {

	public static void loadFurnaceRecipies(){
	
		GameRegistry.addSmelting(ItemsMain.swordRuby, new ItemStack(ItemsMain.swordRubyHeated), 10.0f);
		GameRegistry.addSmelting(BlocksMain.oreTin, new ItemStack(ItemsMain.ingotTin), 10.0f);
		GameRegistry.addSmelting(ItemsMain.axeRuby, new ItemStack(ItemsMain.axeRubyHeated), 10.0f);
		GameRegistry.addSmelting(ItemsMain.gemRuby, new ItemStack(ItemsMain.gemRubyHeated), 10.0f);
		GameRegistry.addSmelting(ItemsMain.pickaxeRuby, new ItemStack(ItemsMain.pickaxeRubyHeated), 10.0f);
		GameRegistry.addSmelting(ItemsMain.shovelRuby, new ItemStack(ItemsMain.shovelRubyHeated), 10.0f);
		GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(ItemsMain.ingotSteel), 10.0f);
		
	}
	
	
}
