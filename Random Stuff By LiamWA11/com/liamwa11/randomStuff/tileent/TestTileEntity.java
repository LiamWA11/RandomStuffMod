package com.liamwa11.randomStuff.tileent;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.tileentity.TileEntity;

public class TestTileEntity extends TileEntity{

	public void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TestTileEntity.class, "TestBlockTileEntity");
	}
	
}
