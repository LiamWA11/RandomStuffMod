package com.liamwa11.randomStuff.tileent;

import net.minecraft.tileentity.TileEntity;

public class TestTileEntity extends TileEntity{
	/**
     * A basic Tile Entity.
     * For demonstration purpose, ill change the worldtime every 5 seconds.
     */
    int tick;
    int worldTime = 1;

    /**
     * This method gets called every tick (tick = 1/20 sec)
     */
    @Override
    public void updateEntity()
    {
        if(!worldObj.isRemote)
        {
            tick++;
            if(tick == 100)
            {
                if(worldTime == 1)
                {
                    this.worldObj.setWorldTime(1000);
                    worldTime = 0;
                }
                else
                {
                    this.worldObj.setWorldTime(0);
                    worldTime = 1;
                }
                tick = 0;
                System.out.print("test");
            }
        }
    }
}
