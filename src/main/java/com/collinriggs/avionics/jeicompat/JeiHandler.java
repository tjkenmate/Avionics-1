/*package com.collinriggs.avionics.jeicompat;

/**
 * Created by Deathly on 11/4/2016.
 */
/*import com.collinriggs.avionics.blocks.ContainerNewWorkbench;
import com.collinriggs.avionics.blocks.GuiNewWorkbench;
import mezz.jei.api.*;
import mezz.jei.api.ingredients.IModIngredientRegistration;
import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.api.recipe.VanillaRecipeCategoryUid;
import mezz.jei.api.recipe.transfer.IRecipeTransferRegistry;
import com.google.common.collect.Lists;
import mezz.jei.api.ISubtypeRegistry.ISubtypeInterpreter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@JEIPlugin
public class JeiHandler implements IModPlugin {

    public static IJeiHelpers jeiHelpers;

    public static void init(){
    }

    @Override
    public void registerItemSubtypes(ISubtypeRegistry subtypeRegistry) {

    }

    @Override
    public void registerIngredients(IModIngredientRegistration registry) {

    }

    @Override
    public void register(IModRegistry registryIn) {
        registryIn.addRecipeClickArea(GuiNewWorkbench.class, 88, 32, 28, 23, VanillaRecipeCategoryUid.CRAFTING);
        IRecipeTransferRegistry recipeTransferRegistry = registryIn.getRecipeTransferRegistry();
        recipeTransferRegistry.addRecipeTransferHandler(ContainerNewWorkbench.class, VanillaRecipeCategoryUid.CRAFTING, 1, 9, 10, 36);

        /*IGuiHelper guiHelper = jeiHelpers.getGuiHelper();
        Avcategory[] categories = {
                new Avcategory(guiHelper)
        };
                jeiHelpers = registryIn.getJeiHelpers();

        registryIn.addRecipeCategories((IRecipeCategory[]) categories);
    }

    @Override
    public void onRuntimeAvailable(IJeiRuntime jeiRuntime) {

    }
}
*/