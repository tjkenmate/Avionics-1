package com.collinriggs.avionics.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import static net.minecraftforge.fml.common.registry.GameRegistry.registerTileEntity;

public class ModBlocks {

    public static NewCraftingTable newWorkbench;

    public static void init() {
        newWorkbench = new NewCraftingTable();
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        newWorkbench.initModel();
    }


	/*
	public static void register() {
		registerBlock(newWorkbench);

		registerTileEntity(TileEntityNewWorkbench.class, "modBench");
	}

	private static void registerBlock(Block block) {
        GameRegistry.register(block);
        Item item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        GameRegistry.register(item);
    }
    */

}
