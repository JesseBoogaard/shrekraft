package com.jesseboogaard.shrekraft.blocks;

import com.jesseboogaard.shrekraft.shrekraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class shrekraftBaseBlock extends Block{

    protected String name;

    public shrekraftBaseBlock(Material material, String name) {
        super(material);

        this.name = name;

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(shrekraft.shrekraftTab);
    }

    public void registerItemModel(Item itemBlock) {
        shrekraft.proxy.registerItemRenderer(itemBlock, 0, name);
    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }



}
