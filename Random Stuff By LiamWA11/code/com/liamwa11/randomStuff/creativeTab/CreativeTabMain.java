package com.liamwa11.randomStuff.creativeTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.liamwa11.randomStuff.items.ItemsMain;


public class CreativeTabMain {

	public static CreativeTabs tabMain = new CreativeTabs("tabMain"){
		public Item getTabIconItem(){
			return ItemsMain.gemRuby;}
	};
	
	
}
