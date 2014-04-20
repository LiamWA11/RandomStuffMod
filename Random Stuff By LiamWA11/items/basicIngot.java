package com.liamwa11.randomStuff.items;

import net.minecraft.item.Item;

import com.liamwa11.randomStuff.RandomStuffMain;
import com.liamwa11.randomStuff.creativeTab.CreativeTabMain;

public class basicIngot extends Item{
	
	{
	
		String unlocalizedName = this.getUnlocalizedName();
		
		this.setCreativeTab(CreativeTabMain.tabMain);
		this.setTextureName(RandomStuffMain.modid + ":" + unlocalizedName);
	
	}
	
}
