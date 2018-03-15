package com.jesseboogaard.shrekraft.items;

import net.minecraft.item.ItemStack;

public class ItemPeat extends shrekraftBaseItem{

    public ItemPeat(String name) {
        super(name);
    }

    @Override
    public int getItemBurnTime(ItemStack itemStack) {
        return 2000;
    }
}
