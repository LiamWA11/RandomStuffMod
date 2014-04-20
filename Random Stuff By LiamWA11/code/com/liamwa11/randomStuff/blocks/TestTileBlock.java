package com.liamwa11.randomStuff.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.liamwa11.randomStuff.creativeTab.CreativeTabMain;
import com.liamwa11.randomStuff.tileent.TestTileEntity;

public class TestTileBlock extends Block {

	
	public TestTileBlock()
	{
		super(Material.rock);
		this.setBlockName("TestTileBlock");
		this.setCreativeTab(CreativeTabMain.tabMain);
		//ModBlocks.register(this);
	}
	@Override
	public boolean hasTileEntity(int meta)
	{
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(World world, int meta){
		return new TestTileEntity();
	}
	
	
}
