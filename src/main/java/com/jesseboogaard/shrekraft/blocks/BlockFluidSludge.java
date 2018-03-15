package com.jesseboogaard.shrekraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockFluidSludge extends BlockFluidClassic {

    public BlockFluidSludge() {
        super(shrekraftBlocks.fluidSludge, Material.WATER);
        setRegistryName("FluidSludge");
        setUnlocalizedName(getRegistryName().toString());

    }
}
