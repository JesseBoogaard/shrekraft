package com.jesseboogaard.shrekraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockEarwaxCandle extends shrekraftBaseBlock{
    private final AxisAlignedBB box = new AxisAlignedBB(0.4000000059604645D, 0.0D, 0.4000000059604645D, 0.6000000238418579D, 0.4D, 0.6000000238418579D);

    public BlockEarwaxCandle(String name) {
        super(Material.WOOD, name);
        this.setSoundType(SoundType.SLIME);
        this.setLightLevel(0.9f);

    }
    @Override
    @Deprecated
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    @Deprecated
    public boolean isFullCube(IBlockState state) {
        return false;
    }
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return this.box;
    }

}
