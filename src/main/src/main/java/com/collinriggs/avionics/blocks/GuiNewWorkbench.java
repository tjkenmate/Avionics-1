/*
 * Copyright (c) TheDragonTeam 2016.
 */

package com.collinriggs.avionics.blocks;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

/**
 * net.thedragonteam.armorplus.client.gui
 * ArmorPlus created by sokratis12GR on 6/19/2016 10:37 AM.
 * - TheDragonTeam
 */
public class GuiNewWorkbench extends GuiContainer {
    private static final ResourceLocation ARP_WORKBENCH_GUI_TEXTURES = new ResourceLocation("modsquad:textures/gui/container/gui_workbench.png");

    public GuiNewWorkbench(InventoryPlayer playerInv, World worldIn) {
        super(new ContainerNewWorkbench(playerInv, worldIn));
        this.xSize = 176;
        this.ySize = 165;
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        this.fontRendererObj.drawString(I18n.format("container.modsquad.workbench", new Object[0]), 28, 6, 4210752);
        this.fontRendererObj.drawString(I18n.format("container.modsquad.inventory", new Object[0]), 8, this.ySize - 96 + 2, 4210752);
    }

    /**
     * Draws the background layer of this container (behind the items).
     */
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(ARP_WORKBENCH_GUI_TEXTURES);
        int i = (this.width - this.xSize) / 2;
        int j = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);
    }
}
