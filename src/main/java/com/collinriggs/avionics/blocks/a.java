package com.collinriggs.avionics.blocks;

/**
 * Created by Deathly on 11/6/2016.
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.relauncher.Side;

import javax.annotation.Nullable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class a extends BlockWorkbench {

    public a(){
        super();
        if(!(Blocks.CRAFTING_TABLE instanceof NewCraftingTable) && Blocks.CRAFTING_TABLE instanceof BlockWorkbench){
            try { for (Field f : Block.class.getDeclaredFields()){
                f.setAccessible(true);
                System.out.println("Setting: "+f.getName());
                if(!((f.getModifiers()&Modifier.STATIC)==Modifier.STATIC)) f.set(this, f.get(Blocks.CRAFTING_TABLE));
            } }catch(Exception e){ e.printStackTrace(); }
        }
        setRegistryName(new ResourceLocation("minecraft:crafting_table"));
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        return false;

    }
}
