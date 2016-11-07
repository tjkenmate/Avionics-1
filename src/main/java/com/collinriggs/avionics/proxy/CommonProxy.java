package com.collinriggs.avionics.proxy;

import com.collinriggs.avionics.Avionics;
import com.collinriggs.avionics.blocks.GuiHandler;
import com.collinriggs.avionics.blocks.ModBlocks;
//import com.collinriggs.avionics.jeicompat.JeiHandler;
import com.collinriggs.avionics.utils.ModCompatability;
import com.collinriggs.avionics.jeicompat.ICompatibility;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {

        ModBlocks.init();
        ModCompatability.registerModCompat();
        ModCompatability.loadCompat(ICompatibility.InitializationPhase.PRE_INIT);
    }

    public void init(FMLInitializationEvent e) {

        NetworkRegistry.INSTANCE.registerGuiHandler(Avionics.instance, new GuiHandler());
        ModCompatability.loadCompat(ICompatibility.InitializationPhase.INIT);
    }

    public void postInit(FMLPostInitializationEvent e) {

        ModCompatability.loadCompat(ICompatibility.InitializationPhase.POST_INIT);

    }
    //public void registerJeiHandler(){
        //AvionicsPlugin.init();
    //}

}