package com.liamwa11.randomStuff.recipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;

import com.liamwa11.randomStuff.blocks.BlocksMain;
import com.liamwa11.randomStuff.items.ItemsMain;

import cpw.mods.fml.common.registry.GameRegistry;


public class ShapedRecipiesMain{

	public static void loadShapedRecipies(){
		 
		//TOOLS
		
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
		 
		 //WEAPONS
		 
		 GameRegistry.addRecipe(new ItemStack(ItemsMain.swordRuby), new Object[]{
		 	 " A ", " A ", " B ", 'A', ItemsMain.gemRuby, 'B', Items.stick
		 });
		 
		 
		 GameRegistry.addRecipe(new ItemStack(ItemsMain.swordRubyInfusedIron), new Object[]{
		 	 "ABA", "BCB", "ABA", 'A', Items.iron_ingot, 'B', Blocks.iron_block, 'C', ItemsMain.swordRubyHeated
		 });
		 
		 
		 
		 GameRegistry.addRecipe(new ItemStack(BlocksMain.blockRuby), new Object[]{
		     "AAA", "AAA", "AAA", 'A', ItemsMain.gemRuby
		 });
		 
		 //ITEMS
		 
		 CraftingManager.getInstance().addRecipe(new ItemStack(Items.saddle), new Object[]{
		 	"ABA", "C C", "D D", 'A', Items.leather, 'B', Blocks.wool, 'C', Items.string, 'D', ItemsMain.stiripDouble 
		 });
		 
		 CraftingManager.getInstance().addRecipe(new ItemStack(ItemsMain.stirip), new Object[]{
		 	" A ", "B C", "ADA", 'A', Items.iron_ingot, 'B', Items.leather, 'D', Blocks.iron_block, 'C', ItemsMain.buckle
		 });
		 
		 CraftingManager.getInstance().addRecipe(new ItemStack(ItemsMain.stiripDouble), new Object[]{
		 	 "AAA", "B B", "C C", 'A', Items.leather, 'B', Items.string, 'C', ItemsMain.stirip
		 });
		 
		 CraftingManager.getInstance().addRecipe(new ItemStack(ItemsMain.buckle), new Object[]{
		 	 "AAA", "BAB", "AAA", 'A', Items.iron_ingot, 'B', Items.leather 
		 });
	}
	
}
