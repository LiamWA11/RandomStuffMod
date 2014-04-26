package com.liamwa11.randomStuff.blocks;

import net.minecraft.block.Block;

import com.liamwa11.randomStuff.RandomStuffMain;
import com.liamwa11.randomStuff.creativeTab.CreativeTabMain;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlocksMain {

//	 public static CreativeTabs blocksTab = new CreativeTabs("blocksTab"){
//	    	public Item getTabIconItem(){
//			return null;}
//	   };
	
	public static Block blockRuby;
	public static Block blockTin;
	public static Block blockSteel;
	
	public static Block oreRuby;
	public static Block oreTin;
	
	public static Block whiteRock;
	public static Block blackRock;
	
	public static Block whiteRockCobble;
	public static Block blackRockCobble;
	
	public static Block blueStone;
	public static Block greenStone;
	public static Block redStone;
	//public static Block testTileBlock;
	
	public static void loadBlocks(){
		
		blockRuby = new basicBlock().setBlockName("blockRuby").setCreativeTab(CreativeTabMain.tabMain).setBlockTextureName(RandomStuffMain.modid + ":" + "blockRuby").setHardness(3f);
		GameRegistry.registerBlock(blockRuby, "blockRuby");
		
		oreRuby = new oreRuby().setBlockName("oreRuby").setBlockTextureName(RandomStuffMain.modid + ":" + "oreRuby").setHardness(3f);
		GameRegistry.registerBlock(oreRuby, "oreRuby");
		
		oreTin = new basicBlock().setBlockName("oreTin").setBlockTextureName(RandomStuffMain.modid + ":" + "oreTin").setHardness(3f);
		GameRegistry.registerBlock(oreTin, "oreTin");
		
		whiteRock = new basicBlock().setBlockName("whiteRock").setBlockTextureName(RandomStuffMain.modid + ":" + "whiteRock" );
		GameRegistry.registerBlock(whiteRock, "whiteRock");
		
		whiteRockCobble = new basicBlock().setBlockName("whiteRockCobble").setBlockTextureName(RandomStuffMain.modid + ":" + "whiteRockCobble" );
		GameRegistry.registerBlock(whiteRockCobble, "whiteRockCobble");
		
		blackRock = new basicBlock().setBlockName("blackRock").setBlockTextureName(RandomStuffMain.modid + ":" + "blackRock");
		GameRegistry.registerBlock(blackRock, "blackRock");
		
		blackRockCobble = new basicBlock().setBlockName("blackRockCobble").setBlockTextureName(RandomStuffMain.modid + ":" + "blackRockCobble");
		GameRegistry.registerBlock(blackRockCobble, "blackRockCobble");
		
		blockTin = new basicBlock().setBlockName("blockTin").setBlockTextureName(RandomStuffMain.modid + ":" + "blockTin");
		GameRegistry.registerBlock(blockTin, "blockTin");
		
		blockSteel = new basicBlock().setBlockName("blockSteel").setBlockTextureName(RandomStuffMain.modid + ":" + "blockSteel");
		GameRegistry.registerBlock(blockSteel, "blockSteel");
		
		blueStone = new glowBlocks().setBlockName("blueStone").setBlockTextureName(RandomStuffMain.modid + ":" + "blueStone");
		GameRegistry.registerBlock(blueStone, "blueStone");
		
		greenStone = new glowBlocks().setBlockName("greenStone").setBlockTextureName(RandomStuffMain.modid + ":" + "greenStone");
		GameRegistry.registerBlock(greenStone, "greenStone");
		
		redStone = new glowBlocks().setBlockName("redStone").setBlockTextureName(RandomStuffMain.modid + ":" + "redStone");
		GameRegistry.registerBlock(redStone, "redStone");
		//testTileBlock = new TestTileBlock();
	}
	
	
}
