package com.liamwa11.randomStuff.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.liamwa11.randomStuff.creativeTab.CreativeTabMain;

public class glowBlocks extends Block{

	public glowBlocks(){
		super(Material.rock);
	}
	
	{
		
		this.setCreativeTab(CreativeTabMain.tabMain);
		this.setLightLevel(1f);
		
	}
	
}
