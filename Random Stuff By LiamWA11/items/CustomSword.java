package com.liamwa11.randomStuff.items;

import com.liamwa11.randomStuff.RandomStuffMain;
import com.liamwa11.randomStuff.creativeTab.CreativeTabMain;

import net.minecraft.item.ItemSword;

public class CustomSword extends ItemSword{

	public CustomSword(ToolMaterial material)
	{
		super(material);
	}
	
	{
		
		String unlocalizedName = this.getUnlocalizedName();
		
		this.setCreativeTab(CreativeTabMain.tabMain);
		
		this.setTextureName(RandomStuffMain.modid + ":" + unlocalizedName);
		
	}
	
}
