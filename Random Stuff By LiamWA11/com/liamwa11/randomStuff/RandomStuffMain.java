package com.liamwa11.randomStuff;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import com.liamwa11.randomStuff.blocks.BlocksMain;
import com.liamwa11.randomStuff.items.ItemsMain;
import com.liamwa11.randomStuff.materials.MaterialsMain;
import com.liamwa11.randomStuff.oreDictionary.OreDictionaryMain;
import com.liamwa11.randomStuff.recipe.FurnaceRecipesMain;
import com.liamwa11.randomStuff.recipe.ShapedRecipiesMain;
import com.liamwa11.randomStuff.recipe.ShapelessRecipiesMain;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = RandomStuffMain.modid, version = RandomStuffMain.version)
public class RandomStuffMain {
	
	//MATERIALS
	
	public static final Item.ToolMaterial MATERIALgemRuby =
		    EnumHelper.addToolMaterial("MATERIALgemRuby", 2, 1600, 8.0f, 2.5f, 36);
	
	public static final Item.ToolMaterial MATERIALgemRubyHeated =
			EnumHelper.addToolMaterial("MATERIALgemRubyHeated", 3, 1800, 8.5f, 3.0f, 30);
	
	public static final Item.ToolMaterial MATERIALgemRubyInfusedIron =
			EnumHelper.addToolMaterial("MATERIALgemRubyInfusedIron", 3, 2000, 10.0f, 3.75f, 28);

	public static final Item.ToolMaterial MATERIALgemRubyInfusedGold =
			EnumHelper.addToolMaterial("MATERIALgemRubyInfusedGold", 3, 2150, 16.0f, 4.10f, 40);
	
	public static final Item.ToolMaterial MATERIALgemRubyInfusedDiamond =
			EnumHelper.addToolMaterial("MATERIALgemRubyInfusedDiamond", 4, 2400, 18.0f, 4.75f, 34);
	
	
	public static final String modid = "randomstuff";
	public static final String version = "0.03 ALPHA - Public Compiled Version";
	public static final String CLIENTPROXY = modid + ".core.proxy.ClientProxy";
	public static final String COMMONPROXY = modid + ".core.proxy.CommonProxy";
	
	//@SidedProxy(clientSide = CLIENTPROXY, serverSide = COMMONPROXY)
	//public static CommonProxy Proxy;
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event){
		 
		

		//CREATIVE TABS
		

		
		
		//LOADING OTHER CLASSES
		MaterialsMain.loadMaterials();
		ItemsMain.loadItems();
		BlocksMain.loadBlocks();
		OreDictionaryMain.loadOreDictionary();
		
		//proxy.regsterTileEntities();
		
		
		

	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
		//Tile Entites & Events
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
		//Recipies & Addon support
		FurnaceRecipesMain.loadFurnaceRecipies();
		ShapedRecipiesMain.loadShapedRecipies();
		ShapelessRecipiesMain.loadShapelessRecipies();
	}
	
}


