package com.liamwa11.randomStuff.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.liamwa11.randomStuff.RandomStuffMain;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemsMain extends RandomStuffMain{

	 public static CreativeTabs itemsTab = new CreativeTabs("itemsTab"){
	    	public Item getTabIconItem(){
			return ItemsMain.gemRuby;}
	    };
	    
	 public static CreativeTabs toolsTab = new CreativeTabs("toolsTab"){
		 public Item getTabIconItem(){
			 return pickaxeRuby;}
		 };
		 
     public static CreativeTabs weaponsTab = new CreativeTabs("weaponsTab"){
    	 public Item getTabIconItem(){
    		 return swordRuby;
    	 }
    	 };
     
	 
	    
	 public static Item gemRuby;
	 public static Item shovelRuby;
	 public static Item pickaxeRuby;
	 public static Item axeRuby;
	 public static Item swordRuby;
	 
	 public static Item stirip; //NEED TEXTURE
	 public static Item stiripDouble; //NEED TEXTURE
	 public static Item buckle; //NEED TEXTURE
	 
	 public static Item gemRubyHeated; //For Making HARDENED TOOLS - ALLOYS/REENFORCED MATERIAL
	 
	 public static Item swordRubyHeated;
	 public static Item axeRubyHeated; //Need to complete
	 public static Item pickaxeRubyHeated; //Need to complete
	 public static Item shovelRubyHeated; //Need to complete
	 
	 
	 public static Item swordRubyInfusedIron;
	 public static Item swordrubyInfusedGold;
	 public static Item swordRubyInfusedDiamond; //Need to complete
	 
	 public static void loadItems(){
		 
		 //Gems
		 gemRuby = new Item().setCreativeTab(itemsTab).setUnlocalizedName("gemRuby").setTextureName(modid + ":" + "ruby");
		 GameRegistry.registerItem(gemRuby, "Gem Ruby");
		 
		 
		 
		 //Tools
		 shovelRuby = new CustomShovel(MATERIALgemRuby).setUnlocalizedName("shovelRuby").setCreativeTab(toolsTab).setTextureName(modid + ":" + "shovelRuby");
		 GameRegistry.registerItem(shovelRuby, "shovelRuby");
		 
		 pickaxeRuby = new CustomPickaxe(MATERIALgemRuby).setUnlocalizedName("pickaxeRuby").setCreativeTab(toolsTab).setTextureName(modid + ":" + "pickaxeRuby");
		 GameRegistry.registerItem(pickaxeRuby, "pickaxeRuby");

		 axeRuby = new CustomAxe(MATERIALgemRuby).setUnlocalizedName("axeRuby").setCreativeTab(toolsTab).setTextureName(modid + ":" + "axeRuby");
		 GameRegistry.registerItem(axeRuby, "axeRuby");

		 
		 
		 //WEAPON
		 swordRuby = new CustomSword(MATERIALgemRuby).setUnlocalizedName("swordRuby").setCreativeTab(weaponsTab).setTextureName(modid + ":" + "swordRuby");
		 GameRegistry.registerItem(swordRuby, "swordRuby");
		 
		 swordRubyHeated = new CustomSword(MATERIALgemRubyHeated).setUnlocalizedName("swordRubyHeated").setCreativeTab(weaponsTab).setTextureName(modid + ":" + "swordRubyHeated");
		 GameRegistry.registerItem(swordRubyHeated, "swordRubyHeated");
		 
		 swordRubyInfusedIron = new CustomSword(MATERIALgemRubyInfusedIron).setUnlocalizedName("swordRubyInfusedIron").setCreativeTab(weaponsTab).setTextureName(modid + ":" + "swordRubyInfusedIron");
		 GameRegistry.registerItem(swordRubyInfusedIron, "swordRubyInfusedIron");
		 
		 swordrubyInfusedGold = new CustomSword(MATERIALgemRubyInfusedGold).setUnlocalizedName("swordrubyInfusedGold").setCreativeTab(weaponsTab).setTextureName(modid + ":" + "swordrubyInfusedGold");
		 GameRegistry.registerItem(swordrubyInfusedGold, "swordrubyInfusedGold");
		 
		 //Items
	     stirip = new Item().setCreativeTab(itemsTab).setUnlocalizedName("stirip").setTextureName(modid + ":" + "stirip");
	     GameRegistry.registerItem(stirip, "Saddle Stirip");
	     
	     stiripDouble = new Item().setCreativeTab(itemsTab).setUnlocalizedName("stiripDouble").setTextureName(modid + ":" + "stiripDouble");
	     GameRegistry.registerItem(stiripDouble, "stirip Double");
	     
	     buckle = new Item().setCreativeTab(itemsTab).setUnlocalizedName("buckle").setTextureName(modid + ":" + "buckle");
	     GameRegistry.registerItem(buckle, "Buckle");
	     
	 }
	 
	    
	
}
