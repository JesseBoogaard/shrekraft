package com.jesseboogaard.shrekraft.blocks.fluid;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import com.jesseboogaard.shrekraft.sherkraftInfo;
public class FluidSludge extends Fluid {
    public FluidSludge() {
        super("FluidSludge", new ResourceLocation(sherkraftInfo.RESOURCE_LOCATION, "fluids/sludge_still"), new ResourceLocation("shrekraft", "fluids/sludge_flow"));
        FluidRegistry.addBucketForFluid(this);
        this.viscosity = 2300;
    }
}