package com.jesseboogaard.shrekraft.items;

import com.jesseboogaard.shrekraft.blocks.shrekraftBlocks;
import com.jesseboogaard.shrekraft.shrekraft;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.Item;


public class ItemOnion extends ItemSeeds {

    public ItemOnion() {
        super(shrekraftBlocks.blockCropOnion, Blocks.FARMLAND);
        setUnlocalizedName("ItemOnion");
        setRegistryName("ItemOnion");
        setCreativeTab(shrekraft.shrekraftTab);

    }

    public void registerItemModel(Item item) {
        shrekraft.proxy.registerItemRenderer(item, 0, "ItemOnion");
    }
}
