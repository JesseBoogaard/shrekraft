package com.jesseboogaard.shrekraft.items;

import com.jesseboogaard.shrekraft.shrekraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class shrekraftBaseItem extends Item {
    public shrekraftBaseItem(String name) {
        super();
        setCreativeTab(shrekraft.shrekraftTab);
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return super.getUnlocalizedName();
    }

    public void registerItemModel(Item item) {
        shrekraft.proxy.registerItemRenderer(item, 0, item.getUnlocalizedName());
    }


}
