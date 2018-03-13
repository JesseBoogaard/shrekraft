package com.jesseboogaard.shrekraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class shrekraftBlocks {

    public static BlockCompactedEarwax blockCompactedEarwax = new BlockCompactedEarwax("BlockCompactedEarwax");
    public static BlockEarwaxCandle blockEarwaxCandle = new BlockEarwaxCandle("BlockEarwaxCandle");
    public static BlockCropOnion blockCropOnion = new BlockCropOnion();
    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                blockCompactedEarwax,
                blockEarwaxCandle,
                blockCropOnion
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
    }
}
