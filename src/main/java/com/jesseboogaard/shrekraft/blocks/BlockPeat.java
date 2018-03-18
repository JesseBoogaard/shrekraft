package com.jesseboogaard.shrekraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockPeat extends shrekraftBaseBlock{

    public BlockPeat(String name) {
        super(Material.GROUND, name);
        this.setSoundType(SoundType.PLANT);

    }
}
