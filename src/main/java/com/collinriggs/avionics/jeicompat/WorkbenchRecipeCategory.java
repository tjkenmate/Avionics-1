/*******************************************************************************
 * Copyright (c) TheDragonTeam 2016.
 ******************************************************************************/

package com.collinriggs.avionics.jeicompat;

import com.collinriggs.avionics.Constants;
import mezz.jei.api.gui.ICraftingGridHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.api.recipe.IRecipeWrapper;
import mezz.jei.api.recipe.wrapper.IShapedCraftingRecipeWrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;



import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Created by Deathly
 */
public class WorkbenchRecipeCategory implements IRecipeCategory {

    public static final int width = 116;
    public static final int height = 54;
    private static final int OUTPUT_SLOT = 0;
    private static final int INPUT_SLOT = 1;
    @Nonnull
    private final IDrawable background;
    @Nonnull
    private final ICraftingGridHelper craftingGridHelper;

    public WorkbenchRecipeCategory() {
        ResourceLocation location = new ResourceLocation("avionics","textures/gui/container/gui_workbench.png");
        background = AvionicsPlugin.jeiHelper.getGuiHelper().createDrawable(location, 29, 16, width, height);
        craftingGridHelper = AvionicsPlugin.jeiHelper.getGuiHelper().createCraftingGridHelper(INPUT_SLOT, OUTPUT_SLOT);
    }

    @Override
    public void drawExtras(@Nonnull Minecraft minecraft) {

    }

    @Override
    public void drawAnimations(@Nonnull Minecraft minecraft) {

    }

    @Nonnull
    @Override
    public String getUid() {
        return Constants.Compat.JEI_CATEGORY_WORKBENCH;
    }

    @Nonnull
    @Override
    public String getTitle() {
        return ("Avionic Crafting");
    }

    @Nonnull
    @Override
    public IDrawable getBackground() {
        return background;
    }

    @Nullable
    @Override
    public IDrawable getIcon() {
        return null;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void setRecipe(@Nonnull IRecipeLayout recipeLayout, @Nonnull IRecipeWrapper recipeWrapper) {
        IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();

        guiItemStacks.init(OUTPUT_SLOT, false, 94, 18);

        for (int y = 0; y < 3; ++y) {
            for (int x = 0; x < 3; ++x) {
                int index = INPUT_SLOT + x + (y * 3);
                guiItemStacks.init(index, true, x * 18, y * 18);
            }
        }

        if (recipeWrapper instanceof IShapedCraftingRecipeWrapper) {
            IShapedCraftingRecipeWrapper wrapper = (IShapedCraftingRecipeWrapper) recipeWrapper;
            craftingGridHelper.setInput(guiItemStacks, wrapper.getInputs(), wrapper.getWidth(), wrapper.getHeight());
            craftingGridHelper.setOutput(guiItemStacks, wrapper.getOutputs());
        } else {
            craftingGridHelper.setInput(guiItemStacks, recipeWrapper.getInputs());
            craftingGridHelper.setOutput(guiItemStacks, recipeWrapper.getOutputs());
        }
    }

    @Override
    public void setRecipe(IRecipeLayout recipeLayout, IRecipeWrapper recipeWrapper, IIngredients ingredients) {
        IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();

        guiItemStacks.init(OUTPUT_SLOT, false, 94, 18);

        for (int y = 0; y < 3; ++y) {
            for (int x = 0; x < 3; ++x) {
                int index = INPUT_SLOT + x + (y * 3);
                guiItemStacks.init(index, true, x * 18, y * 18);
            }
        }

        if (recipeWrapper instanceof IShapedCraftingRecipeWrapper) {
            IShapedCraftingRecipeWrapper wrapper = (IShapedCraftingRecipeWrapper) recipeWrapper;
            craftingGridHelper.setInput(guiItemStacks, wrapper.getInputs(), wrapper.getWidth(), wrapper.getHeight());
            craftingGridHelper.setOutput(guiItemStacks, wrapper.getOutputs());
        } else {
            craftingGridHelper.setInput(guiItemStacks, recipeWrapper.getInputs());
            craftingGridHelper.setOutput(guiItemStacks, recipeWrapper.getOutputs());
        }
    }

}