package com.liamwa11.randomStuff.recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;

import com.liamwa11.randomStuff.blocks.BlocksMain;
import com.liamwa11.randomStuff.items.ItemsMain;

public class ShapelessRecipiesMain {

	public static void loadShapelessRecipies(){
		
		CraftingManager.getInstance().addShapelessRecipe(new ItemStack(ItemsMain.gemRuby, 9), new Object[]{
			new ItemStack(BlocksMain.blockRuby)
		});
		
	}
	
}
