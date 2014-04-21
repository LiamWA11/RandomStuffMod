package com.liamwa11.randomStuff.items;

import com.liamwa11.randomStuff.RandomStuffMain;
import com.liamwa11.randomStuff.creativeTab.CreativeTabMain;

import net.minecraft.item.ItemAxe;

public class CustomAxe extends ItemAxe{
	
	public CustomAxe(ToolMaterial material){
		super(material);
	}
	
	{
		
		String unlocalizedName = this.getUnlocalizedName();
		
		this.setCreativeTab(CreativeTabMain.tabMain);

		
	}
	
}
