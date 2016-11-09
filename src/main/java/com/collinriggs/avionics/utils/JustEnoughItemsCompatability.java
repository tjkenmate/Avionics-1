package com.collinriggs.avionics.utils;

import com.collinriggs.avionics.jeicompat.ICompatibility;

/**
 * Created by Deathly
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