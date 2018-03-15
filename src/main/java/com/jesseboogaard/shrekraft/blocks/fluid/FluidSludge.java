package com.jesseboogaard.shrekraft.blocks.fluid;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidSludge extends Fluid {
    public FluidSludge() {
        super("FluidSludge", new ResourceLocation("shrekraft", "fluids/sludge_still"), new ResourceLocation("shrekraft", "fluids/sludge_flow"));
        FluidRegistry.addBucketForFluid(this);
        this.viscosity = 2300;
    }
}