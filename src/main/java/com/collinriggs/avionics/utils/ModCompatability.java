package com.collinriggs.avionics.utils;

import net.minecraftforge.fml.common.Loader;
import com.collinriggs.avionics.jeicompat.ICompatibility;
import com.collinriggs.avionics.utils.JustEnoughItemsCompatability;

import java.util.ArrayList;

/**
 * net.thedragonteam.armorplus.registry
 * ArmorPlus created by sokratis12GR on 6/22/2016 12:20 AM.
 * - TheDragonTeam
 */
public class ModCompatability {
    private static ArrayList<ICompatibility> compatibilities = new ArrayList<ICompatibility>();

    public static void registerModCompat() {
        compatibilities.add(new JustEnoughItemsCompatability());
    }

    public static void loadCompat(ICompatibility.InitializationPhase phase) {
        for (ICompatibility compatibility : compatibilities)
            if (Loader.isModLoaded(compatibility.getMODID()) && compatibility.enableCompat())
                compatibility.loadCompatibility(phase);
    }
}
