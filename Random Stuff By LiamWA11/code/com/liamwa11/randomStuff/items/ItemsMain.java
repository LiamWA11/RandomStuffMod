package com.liamwa11.randomStuff.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.liamwa11.randomStuff.RandomStuffMain;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemsMain extends RandomStuffMain{

	 public static CreativeTabs itemsTab = new CreativeTabs("itemsTab"){
	    	public Item getTabIconItem(){
			return gemRuby;}
	    };
	    
	 public static Item gemRuby;
	 public static Item shovelRuby;
	 
	 public static void loadItems(){
		 
		 gemRuby = new Item().setCreativeTab(itemsTab).setUnlocalizedName("gemRuby").setTextureName(modid + ":" + "ruby");
		 GameRegistry.registerItem(gemRuby, "Gem Ruby");
		 
		 shovelRuby = new CustomShovel(MATERIALgemRuby).setUnlocalizedName("shovelRuby").setCreativeTab(itemsTab).setTextureName(modid + ":" + "shovelRuby");
		 GameRegistry.registerItem(shovelRuby, "shovelRuby");
	 }
	    
	
}
