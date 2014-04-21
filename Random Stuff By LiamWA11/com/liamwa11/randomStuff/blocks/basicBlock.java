package com.liamwa11.randomStuff.blocks;

import com.liamwa11.randomStuff.creativeTab.CreativeTabMain;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class basicBlock extends Block{

	public basicBlock(){
		super(Material.rock);
	}
	
	{
		
		this.setCreativeTab(CreativeTabMain.tabMain);
		
	}
	
}
