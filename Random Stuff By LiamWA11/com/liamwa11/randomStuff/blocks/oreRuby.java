package com.liamwa11.randomStuff.blocks;

import java.util.Random;

import com.liamwa11.randomStuff.creativeTab.CreativeTabMain;
import com.liamwa11.randomStuff.items.ItemsMain;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class oreRuby extends Block{
	
	public oreRuby(){
		super(Material.rock);
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	{
		return ItemsMain.gemRuby;
	}
	
	{
		this.setCreativeTab(CreativeTabMain.tabMain);
	}


}
