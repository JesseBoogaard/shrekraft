package com.jesseboogaard.shrekraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import com.jesseboogaard.shrekraft.items.shrekraftItems;

public class shrekraftTab extends CreativeTabs {
    public shrekraftTab(int par1, String par2) {
        super(par1, par2);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(shrekraftItems.ItemOnion);
    }
    
}
