package com.jesseboogaard.shrekraft.blocks;

import com.jesseboogaard.shrekraft.blocks.fluid.FluidSludge;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class shrekraftBlocks {

    public static BlockCompactedEarwax blockCompactedEarwax = new BlockCompactedEarwax("BlockCompactedEarwax");
    public static BlockEarwaxCandle blockEarwaxCandle = new BlockEarwaxCandle("BlockEarwaxCandle");
    public static BlockGingerBread blockGingerBread = new BlockGingerBread("BlockGingerBread");
    public static BlockPeat blockPeat = new BlockPeat("BlockPeat");
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
                blockGingerBread,
                blockPeat,
                blockCropOnion,
                blockFluidSludge,
                blockCropGinger
        );

    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                blockCompactedEarwax.createItemBlock(),
                blockEarwaxCandle.createItemBlock(),
                blockGingerBread.createItemBlock(),
                blockPeat.createItemBlock());
    }

    public static void registerModels() {
        blockCompactedEarwax.registerItemModel(Item.getItemFromBlock(blockCompactedEarwax));
        blockGingerBread.registerItemModel(Item.getItemFromBlock(blockGingerBread));
        blockPeat.registerItemModel(Item.getItemFromBlock(blockPeat));
        blockEarwaxCandle.registerItemModel(Item.getItemFromBlock(blockEarwaxCandle));
        blockFluidSludge.render();
    }
}
