package com.jesseboogaard.shrekraft.items;

import com.jesseboogaard.shrekraft.blocks.shrekraftBlocks;
import com.jesseboogaard.shrekraft.shrekraft;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.Item;


public class ItemOnionSeed extends ItemSeeds {

    public ItemOnionSeed() {
        super(shrekraftBlocks.blockCropOnion, Blocks.FARMLAND);
        setUnlocalizedName("ItemOnionSeed");
        setRegistryName("ItemOnionSeed");

    }

    public void registerItemModel(Item item) {
        shrekraft.proxy.registerItemRenderer(item, 0, "ItemOnionSeed");
    }
}
