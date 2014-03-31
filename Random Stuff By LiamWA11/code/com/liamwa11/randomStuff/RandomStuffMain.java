package com.liamwa11.randomStuff;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import com.liamwa11.randomStuff.blocks.BlocksMain;
import com.liamwa11.randomStuff.items.ItemsMain;
import com.liamwa11.randomStuff.materials.MaterialsMain;
import com.liamwa11.randomStuff.recipe.ShapedRecipiesMain;
import com.liamwa11.randomStuff.recipe.ShapelessRecipiesMain;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = RandomStuffMain.modid, version = RandomStuffMain.version)
public class RandomStuffMain {
	
	//MATERIALS
	
	public static final Item.ToolMaterial MATERIALgemRuby =
		    EnumHelper.addToolMaterial("MATERIALgemRuby", 2, 1600, 8.0f, 2.5f, 36);

	
	
	
	public static final String modid = "randomstuff";
	public static final String version = "0.01 ALPHA";
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event){
		 

		//CREATIVE TABS
		

		
		
		//LOADING OTHER CLASSES
		ItemsMain.loadItems();
		MaterialsMain.loadMaterials();
		ShapedRecipiesMain.loadShapedRecipies();
		BlocksMain.loadBlocks();
		ShapelessRecipiesMain.loadShapelessRecipies();
		

	}
	
}


