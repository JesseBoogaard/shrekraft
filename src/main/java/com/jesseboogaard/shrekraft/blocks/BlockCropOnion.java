package com.jesseboogaard.shrekraft.blocks;

import com.jesseboogaard.shrekraft.items.shrekraftItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockCropOnion extends BlockCrops {

    public BlockCropOnion() {
        this.setSoundType(SoundType.PLANT);
        setUnlocalizedName("BlockCropOnion");
        setRegistryName("BlockCropOnion");
    }

    @Override
    protected Item getSeed() {
        return shrekraftItems.onionSeed;
    }

    @Override
    protected Item getCrop() {
        return shrekraftItems.ItemOnion;
    }
}
