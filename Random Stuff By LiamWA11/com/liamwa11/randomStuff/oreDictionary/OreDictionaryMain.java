package com.liamwa11.randomStuff.oreDictionary;

import net.minecraftforge.oredict.OreDictionary;

import com.liamwa11.randomStuff.blocks.BlocksMain;
import com.liamwa11.randomStuff.items.ItemsMain;

public class OreDictionaryMain {

	public static void loadOreDictionary(){
		
		//Ore Dictionary - Gems
	     OreDictionary.registerOre("gemRuby", ItemsMain.gemRuby);
	     OreDictionary.registerOre("gemPeridot", ItemsMain.gemPeridot);
	     
	    //Ore Dictionary - Blocks
	     OreDictionary.registerOre("blockGemRuby", BlocksMain.blockRuby);
	     OreDictionary.registerOre("oreGemRuby", BlocksMain.oreRuby);
	     OreDictionary.registerOre("oreTin", BlocksMain.oreTin);
	     
	    //Ore Dictionary - Ingots
	     
	    
		
	}
	
}
