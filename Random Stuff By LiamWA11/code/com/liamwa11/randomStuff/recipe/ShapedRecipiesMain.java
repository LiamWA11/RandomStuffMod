package com.liamwa11.randomStuff.recipe;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;

import com.liamwa11.randomStuff.blocks.BlocksMain;
import com.liamwa11.randomStuff.items.ItemsMain;

import cpw.mods.fml.common.registry.GameRegistry;


public class ShapedRecipiesMain{

	public static void loadShapedRecipies(){
		
		 GameRegistry.addRecipe(new ItemStack(ItemsMain.shovelRuby), new Object[]{
				"A","B","B", 'A', ItemsMain.gemRuby, 'B', Items.stick
		 });
		 
		 GameRegistry.addRecipe(new ItemStack(ItemsMain.pickaxeRuby), new Object[]{
			 "AAA", " B ", " B ", 'A', ItemsMain.gemRuby, 'B', Items.stick
		 });
		 
		 GameRegistry.addRecipe(new ItemStack(ItemsMain.axeRuby), new Object[]{
			 "AA ", "AB ", " B ", 'A', ItemsMain.gemRuby, 'B', Items.stick
		 });
		 
		 GameRegistry.addRecipe(new ItemStack(ItemsMain.axeRuby), new Object[]{
		     " AA", " BA", " B ", 'A', ItemsMain.gemRuby, 'B', Items.stick
		 });
		
		 CraftingManager.getInstance().addRecipe(new ItemStack(BlocksMain.blockRuby), new Object[]{
			 "AAA", "AAA", "AAA", 'A', ItemsMain.gemRuby
		 });
	}
	
}
