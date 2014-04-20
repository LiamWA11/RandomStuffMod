package com.liamwa11.randomStuff.items;

import com.liamwa11.randomStuff.RandomStuffMain;
import com.liamwa11.randomStuff.creativeTab.CreativeTabMain;

import net.minecraft.item.ItemPickaxe;

public class CustomPickaxe extends ItemPickaxe{
	
	public CustomPickaxe(ToolMaterial material){
		super(material);
	}

	{
		
		String unlocalizedName = this.getUnlocalizedName();
		
		this.setCreativeTab(CreativeTabMain.tabMain);
		
		this.setTextureName(RandomStuffMain.modid + ":" + unlocalizedName);
		
	}
	
}
