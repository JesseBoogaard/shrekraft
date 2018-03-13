package com.jesseboogaard.shrekraft.blocks;

import com.jesseboogaard.shrekraft.items.shrekraftItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class BlockCropOnion extends BlockCrops {

    public BlockCropOnion() {
        this.setSoundType(SoundType.PLANT);
        setUnlocalizedName("BlockCropOnion");
        setRegistryName("BlockCropOnion");
    }

    @Override
    protected Item getSeed() {
        return shrekraftItems.ItemOnion;
    }

    @Override
    protected Item getCrop() {
        return shrekraftItems.ItemOnion;
    }

    @Override
    public void getDrops(net.minecraft.util.NonNullList<ItemStack> drops, net.minecraft.world.IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        super.getDrops(drops, world, pos, state, 0);
        int age = getAge(state);
        Random rand = world instanceof World ? ((World)world).rand : new Random();

        if (age >= getMaxAge())
        {
            int k = 3 + fortune;

            for (int i = 0; i < 3 + fortune; ++i)
            {
                if (rand.nextInt(2 * getMaxAge()) <= age)
                {
                    drops.add(new ItemStack(this.getSeed(), rand.nextInt(1) , 0));
                }
            }
        }
    }
}
