package com.collinriggs.avionics.utils;

import com.collinriggs.avionics.jeicompat.ICompatibility;

/**
 * net.thedragonteam.armorplus.compat.jei
 * ArmorPlus created by sokratis12GR on 6/21/2016 10:54 PM.
 * - TheDragonTeam
 */
public class JustEnoughItemsCompatability implements ICompatibility {
    @Override
    public void loadCompatibility(InitializationPhase phase) {
    }


    @Override
    public String getMODID() {
        return "JEI";
    }

    @Override
    public boolean enableCompat() {
        return true;
    }
}