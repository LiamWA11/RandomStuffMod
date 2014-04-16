package com.liamwa11.randomStuff.items;

import net.minecraft.item.Item;
import com.liamwa11.randomStuff.RandomStuffMain;
import com.liamwa11.randomStuff.creativeTab.CreativeTabMain;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemsMain extends RandomStuffMain{

//	 public static CreativeTabs itemsTab = new CreativeTabs("itemsTab"){
//	    	public Item getTabIconItem(){
//			return ItemsMain.gemRuby;}
//	    };
	    
//	 public static CreativeTabs toolsTab = new CreativeTabs("toolsTab"){
//		 public Item getTabIconItem(){
//			 return pickaxeRuby;}
//		 };
		 
//     public static CreativeTabs weaponsTab = new CreativeTabs("weaponsTab"){
//    	 public Item getTabIconItem(){
//    		 return swordRuby;
//    	 }
//    	 };
     
	 //RUBY GEM
	    
	 public static Item gemRuby;
	 public static Item shovelRuby;
	 public static Item pickaxeRuby;
	 public static Item axeRuby;
	 public static Item swordRuby;
	 public static Item stirip;
	 public static Item stiripDouble;
	 public static Item buckle; //NEED TEXTURE
	 public static Item gemRubyHeated; //For Making HARDENED TOOLS - ALLOYS/REENFORCED MATERIAL
	 public static Item swordRubyHeated;
	 public static Item axeRubyHeated; //NEED TEXTURE
	 public static Item pickaxeRubyHeated; //NEED TEXTURE
	 public static Item shovelRubyHeated; //NEED TEXTURE
	 public static Item swordRubyInfusedIron;
	 public static Item swordrubyInfusedGold; //NEED TEXTURE
	 public static Item swordRubyInfusedDiamond; //Need to complete
	 
	 //NEW GEM - PERIDOT
	 public static Item gemPeridot;
	 
	 
	 //ALLOYS
	 public static Item ingotInfusedRubyPeridot;
	 
	 
	 public static void loadItems(){
		 
		 
		 //Gems
		 gemRuby = new Item().setCreativeTab(CreativeTabMain.tabMain).setUnlocalizedName("gemRuby").setTextureName(modid + ":" + "ruby");
		 GameRegistry.registerItem(gemRuby, "Gem Ruby");
		 
		 gemRubyHeated = new Item().setCreativeTab(CreativeTabMain.tabMain).setUnlocalizedName("gemRubyHeated").setTextureName(modid + ":" + "gemRubyHeated");
		 GameRegistry.registerItem(gemRubyHeated, "Gem Ruby Heated");
		 
		 
		 
		 //Tools
		 shovelRuby = new CustomShovel(MATERIALgemRuby).setUnlocalizedName("shovelRuby").setCreativeTab(CreativeTabMain.tabMain).setTextureName(modid + ":" + "shovelRuby");
		 GameRegistry.registerItem(shovelRuby, "shovelRuby");
		 
		 shovelRubyHeated = new CustomShovel(MATERIALgemRubyHeated).setUnlocalizedName("shovelRubyHeated").setCreativeTab(CreativeTabMain.tabMain).setTextureName(modid + ":" + "shovelRubyHeated");
		 GameRegistry.registerItem(shovelRubyHeated, "shovelRubyHeated");
		 
		 pickaxeRuby = new CustomPickaxe(MATERIALgemRuby).setUnlocalizedName("pickaxeRuby").setCreativeTab(CreativeTabMain.tabMain).setTextureName(modid + ":" + "pickaxeRuby");
		 GameRegistry.registerItem(pickaxeRuby, "pickaxeRuby");
		 
		 pickaxeRubyHeated = new CustomPickaxe(MATERIALgemRubyHeated).setUnlocalizedName("pickaxeRubyHeated").setCreativeTab(CreativeTabMain.tabMain).setTextureName(modid + ":" + "pickaxeRubyHeated");
		 GameRegistry.registerItem(pickaxeRubyHeated, "pickaxeRubyHeated");

		 axeRuby = new CustomAxe(MATERIALgemRuby).setUnlocalizedName("axeRuby").setCreativeTab(CreativeTabMain.tabMain).setTextureName(modid + ":" + "axeRuby");
		 GameRegistry.registerItem(axeRuby, "axeRuby");

		 axeRubyHeated = new CustomAxe(MATERIALgemRubyHeated).setUnlocalizedName("axeRubyHeated").setCreativeTab(CreativeTabMain.tabMain).setTextureName(modid + ":" + "axeRubyHeated");
		 GameRegistry.registerItem(axeRubyHeated, "axeRubyHeated");
		 
		 //WEAPON
		 swordRuby = new CustomSword(MATERIALgemRuby).setUnlocalizedName("swordRuby").setCreativeTab(CreativeTabMain.tabMain).setTextureName(modid + ":" + "swordRuby");
		 GameRegistry.registerItem(swordRuby, "swordRuby");
		 
		 swordRubyHeated = new CustomSword(MATERIALgemRubyHeated).setUnlocalizedName("swordRubyHeated").setCreativeTab(CreativeTabMain.tabMain).setTextureName(modid + ":" + "swordRubyHeated");
		 GameRegistry.registerItem(swordRubyHeated, "swordRubyHeated");
		 
		 swordRubyInfusedIron = new CustomSword(MATERIALgemRubyInfusedIron).setUnlocalizedName("swordRubyInfusedIron").setCreativeTab(CreativeTabMain.tabMain).setTextureName(modid + ":" + "swordRubyInfusedIron");
		 GameRegistry.registerItem(swordRubyInfusedIron, "swordRubyInfusedIron");
		 
		 swordrubyInfusedGold = new CustomSword(MATERIALgemRubyInfusedGold).setUnlocalizedName("swordrubyInfusedGold").setCreativeTab(CreativeTabMain.tabMain).setTextureName(modid + ":" + "swordRubyInfusedGold");
		 GameRegistry.registerItem(swordrubyInfusedGold, "swordrubyInfusedGold");
		 
		 swordRubyInfusedDiamond = new CustomSword(MATERIALgemRubyInfusedDiamond).setUnlocalizedName("swordRubyInfusedDiamond").setCreativeTab(CreativeTabMain.tabMain).setTextureName(modid + ":" + "swordRubyInfusedDiamond");
		 GameRegistry.registerItem(swordRubyInfusedDiamond, "swordRubyInfusedDiamond");
		 
		 
		 
		 
		 //Items
	     stirip = new Item().setCreativeTab(CreativeTabMain.tabMain).setUnlocalizedName("stirip").setTextureName(modid + ":" + "stirip");
	     GameRegistry.registerItem(stirip, "Saddle Stirip");
	     
	     stiripDouble = new Item().setCreativeTab(CreativeTabMain.tabMain).setUnlocalizedName("stiripDouble").setTextureName(modid + ":" + "stiripDouble");
	     GameRegistry.registerItem(stiripDouble, "stirip Double");
	     
	     buckle = new Item().setCreativeTab(CreativeTabMain.tabMain).setUnlocalizedName("buckle").setTextureName(modid + ":" + "buckle");
	     GameRegistry.registerItem(buckle, "Buckle");
	     
	     
	     
	     
	     
	     
	     
	     
	 }
	 
	    
	
}
