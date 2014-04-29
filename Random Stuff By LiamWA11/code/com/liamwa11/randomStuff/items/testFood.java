package com.liamwa11.randomStuff.items;

import com.liamwa11.randomStuff.creativeTab.CreativeTabMain;

import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class testFood extends ItemFood {

	public testFood(){
		
		super(7, 1F, false);
        
		this.setCreativeTab(CreativeTabMain.tabMain);
        
        this.setPotionEffect(4, 10, 1, 1F);
        
        this.setAlwaysEdible();
        
		
	}
	
	@Override
    public int getMaxItemUseDuration(ItemStack itemStack)
    {
        return 10;
    }
	
}
