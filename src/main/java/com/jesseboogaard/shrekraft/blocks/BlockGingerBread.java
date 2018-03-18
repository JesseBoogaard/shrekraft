package com.jesseboogaard.shrekraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockGingerBread extends shrekraftBaseBlock{

    public BlockGingerBread(String name) {
        super(Material.GROUND, name);
        this.setSoundType(SoundType.WOOD);

    }
}
