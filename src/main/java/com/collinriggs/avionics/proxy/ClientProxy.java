package com.collinriggs.avionics.proxy;

import com.collinriggs.avionics.blocks.ModBlocks;

public class ClientProxy implements CommonProxy {

	@Override
	public void preInit() {
        ModBlocks.initModels();
	}

	@Override
	public void init() {
	}

	@Override
	public void postInit() {
	}

}
