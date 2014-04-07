package com.liamwa11.randomStuff.blocks;

import com.liamwa11.randomStuff.RandomStuffMain;
import com.liamwa11.randomStuff.items.ItemsMain;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlocksMain {

	 public static CreativeTabs blocksTab = new CreativeTabs("blocksTab"){
	    	public Item getTabIconItem(){
			return ItemsMain.gemRuby;}
	   };
	
	public static Block blockRuby;
	public static Block oreRuby;
	public static Block oreTin;
	//public static Block testTileBlock;
	
	public static void loadBlocks(){
		
		blockRuby = new basicBlock().setBlockName("blockRuby").setCreativeTab(blocksTab).setBlockTextureName(RandomStuffMain.modid + ":" + "blockRuby").setHardness(3f);
		GameRegistry.registerBlock(blockRuby, "blockRuby");
		//ADD RECIPIE
		
		oreRuby = new oreRuby().setBlockName("oreRuby").setCreativeTab(blocksTab).setBlockTextureName(RandomStuffMain.modid + ":" + "oreRuby").setHardness(3f);
		GameRegistry.registerBlock(oreRuby, "oreRuby");
		
		oreTin = new basicBlock().setBlockName("oreTin").setCreativeTab(blocksTab).setBlockTextureName(RandomStuffMain.modid + ":" + "oreTin").setHardness(3f);
		GameRegistry.registerBlock(oreTin, "oreTin");
		
		
		//testTileBlock = new TestTileBlock();
	}
	
	
}
