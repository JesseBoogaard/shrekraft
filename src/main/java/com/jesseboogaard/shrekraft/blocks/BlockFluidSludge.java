package com.jesseboogaard.shrekraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockFluidSludge extends BlockFluidClassic {

    public BlockFluidSludge() {
        super(shrekraftBlocks.fluidSludge, Material.WATER);
        setRegistryName("FluidSludge");
        setUnlocalizedName(getRegistryName().toString());

    }
    @SideOnly(Side.CLIENT)
    void render() {
        ModelLoader.setCustomStateMapper(this, new StateMap.Builder().ignore(LEVEL).build());
    }
}
