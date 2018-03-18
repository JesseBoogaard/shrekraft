package com.jesseboogaard.shrekraft.blocks;

import com.jesseboogaard.shrekraft.blocks.fluid.FluidSludge;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class shrekraftBlocks {

    public static BlockCompactedEarwax blockCompactedEarwax = new BlockCompactedEarwax("BlockCompactedEarwax");
    public static BlockEarwaxCandle blockEarwaxCandle = new BlockEarwaxCandle("BlockEarwaxCandle");
    public static BlockCropOnion blockCropOnion = new BlockCropOnion();
    public static FluidSludge fluidSludge = new FluidSludge();
    public static BlockFluidSludge blockFluidSludge;
    public static BlockCropGinger blockCropGinger = new BlockCropGinger();
    public static void register(IForgeRegistry<Block> registry) {
        FluidRegistry.registerFluid(fluidSludge);
        blockFluidSludge = new BlockFluidSludge();
        registry.registerAll(
                blockCompactedEarwax,
                blockEarwaxCandle,
                blockCropOnion,
                blockFluidSludge,
                blockCropGinger
        );


    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                blockCompactedEarwax.createItemBlock(),
                blockEarwaxCandle.createItemBlock());
    }

    public static void registerModels() {
        blockCompactedEarwax.registerItemModel(Item.getItemFromBlock(blockCompactedEarwax));
        blockEarwaxCandle.registerItemModel(Item.getItemFromBlock(blockEarwaxCandle));
        blockFluidSludge.render();
    }
}
