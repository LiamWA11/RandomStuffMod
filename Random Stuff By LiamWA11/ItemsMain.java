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
	 
	 
	 //Ingots
	 public static Item ingotInfusedRubyPeridot;
	 public static Item ingotTin;
	 
	 
	 public static void loadItems(){
		 
		 
		 //Gems
		 gemRuby = new basicItem().setUnlocalizedName("ruby").setTextureName(RandomStuffMain.modid + ":" + "ruby");
		 gemRubyHeated = new basicItem().setUnlocalizedName("gemRubyHeated").setTextureName(RandomStuffMain.modid + ":" + "gemRubyHeated");
		 
		 //Tools
		 shovelRuby = new CustomShovel(MATERIALgemRuby).setUnlocalizedName("shovelRuby").setTextureName(RandomStuffMain.modid + ":" + "shovelRuby");
		 shovelRubyHeated = new CustomShovel(MATERIALgemRubyHeated).setUnlocalizedName("shovelRubyHeated").setTextureName(RandomStuffMain.modid + ":" + "shovelRubyHeated");
		 pickaxeRuby = new CustomPickaxe(MATERIALgemRuby).setUnlocalizedName("pickaxeRuby").setTextureName(RandomStuffMain.modid + ":" + "pickaxeRuby");
		 pickaxeRubyHeated = new CustomPickaxe(MATERIALgemRubyHeated).setUnlocalizedName("pickaxeRubyHeated").setTextureName(RandomStuffMain.modid + ":" + "pickaxeRubyHeated");
		 axeRuby = new CustomAxe(MATERIALgemRuby).setUnlocalizedName("axeRuby").setTextureName(RandomStuffMain.modid + ":" + "axeRuby");
		 axeRubyHeated = new CustomAxe(MATERIALgemRubyHeated).setUnlocalizedName("axeRubyHeated").setTextureName(RandomStuffMain.modid + ":" + "axeRubyHeated");
		 
		 //WEAPON
		 swordRuby = new CustomSword(MATERIALgemRuby).setUnlocalizedName("swordRuby").setTextureName(RandomStuffMain.modid + ":" + "swordRuby");
		 swordRubyHeated = new CustomSword(MATERIALgemRubyHeated).setUnlocalizedName("swordRubyHeated").setTextureName(RandomStuffMain.modid + ":" + "swordRubyHeated");
		 swordRubyInfusedIron = new CustomSword(MATERIALgemRubyInfusedIron).setUnlocalizedName("swordRubyInfusedIron").setTextureName(RandomStuffMain.modid + ":" + "swordRubyInfusedIron");
		 swordrubyInfusedGold = new CustomSword(MATERIALgemRubyInfusedGold).setUnlocalizedName("swordrubyInfusedGold").setTextureName(RandomStuffMain.modid + ":" + "swordRubyInfusedGold");
		 swordRubyInfusedDiamond = new CustomSword(MATERIALgemRubyInfusedDiamond).setUnlocalizedName("swordRubyInfusedDiamond").setTextureName(RandomStuffMain.modid + ":" + "swordRuyInfusedDiamond");
		 		 
		 //Items
	     stirip = new basicItem().setUnlocalizedName("stirip").setTextureName(RandomStuffMain.modid + ":" + "stirip");
	     stiripDouble = new basicItem().setUnlocalizedName("stiripDouble").setTextureName(RandomStuffMain.modid + ":" + "stiripDouble");
	     buckle = new basicItem().setUnlocalizedName("buckle").setTextureName(RandomStuffMain.modid + ":" + "buckle");
	     
	     //INGOTS
	     ingotTin = new basicIngot().setUnlocalizedName("ingotTin").setTextureName(RandomStuffMain.modid + ":" + "ingotTin");
	     
	     //GAME REGISTRY
	     GameRegistry.registerItem(gemRuby, "Gem Ruby");
	     GameRegistry.registerItem(gemRubyHeated, "Gem Ruby Heated");
	     GameRegistry.registerItem(buckle, "Buckle");
	     GameRegistry.registerItem(stiripDouble, "stirip Double");
	     GameRegistry.registerItem(stirip, "Saddle Stirip");
	     GameRegistry.registerItem(ingotTin, "ingotTin");
	     GameRegistry.registerItem(swordRubyInfusedDiamond, "swordRubyInfusedDiamond");
	     GameRegistry.registerItem(swordrubyInfusedGold, "swordrubyInfusedGold");
	     GameRegistry.registerItem(swordRubyInfusedIron, "swordRubyInfusedIron");
	     GameRegistry.registerItem(swordRubyHeated, "swordRubyHeated");
	     GameRegistry.registerItem(swordRuby, "swordRuby");
	     GameRegistry.registerItem(shovelRuby, "shovelRuby");
	     GameRegistry.registerItem(shovelRubyHeated, "shovelRubyHeated");
	     GameRegistry.registerItem(pickaxeRuby, "pickaxeRuby");
	     GameRegistry.registerItem(pickaxeRubyHeated, "pickaxeRubyHeated");
	     GameRegistry.registerItem(axeRuby, "axeRuby");
	     GameRegistry.registerItem(axeRubyHeated, "axeRubyHeated");
	     
	     
	     
	 }
	 
	    
	
}
