package com.liamwa11.randomStuff.recipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;

import com.liamwa11.randomStuff.blocks.BlocksMain;
import com.liamwa11.randomStuff.items.ItemsMain;

public class ShapelessRecipiesMain {

	public static void loadShapelessRecipies(){
		
		CraftingManager.getInstance().addShapelessRecipe(new ItemStack(ItemsMain.gemRuby, 9), new Object[]{
			new ItemStack(BlocksMain.blockRuby)
		});
		CraftingManager.getInstance().addShapelessRecipe(new ItemStack(BlocksMain.whiteRock), new Object[]{
			new ItemStack(Blocks.stone), new ItemStack(Items.dye, 1, 15)
		});
		CraftingManager.getInstance().addShapelessRecipe(new ItemStack(BlocksMain.whiteRockCobble), new Object[]{
			new ItemStack(BlocksMain.whiteRock)
		});
		
	}
	
}
