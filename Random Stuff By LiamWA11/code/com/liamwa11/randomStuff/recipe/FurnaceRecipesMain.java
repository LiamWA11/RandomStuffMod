package com.liamwa11.randomStuff.recipe;

import net.minecraft.item.ItemStack;

import com.liamwa11.randomStuff.items.ItemsMain;

import cpw.mods.fml.common.registry.GameRegistry;

public class FurnaceRecipesMain {

	public static void loadFurnaceRecipies(){
		GameRegistry.addSmelting(ItemsMain.swordRuby, new ItemStack(ItemsMain.swordRubyHeated), 10.0f);
	}
	
}
