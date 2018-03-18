package com.jesseboogaard.shrekraft.items;

import com.jesseboogaard.shrekraft.shrekraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemGingerbreadCookie extends ItemFood {
    public ItemGingerbreadCookie() {
        super(2, 0.2F, false);
        setUnlocalizedName("ItemGingerbreadCookie");
        setRegistryName("ItemGingerbreadCookie");
        setCreativeTab(shrekraft.shrekraftTab);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add("*Screams violently*");
    }

    public void registerItemModel(Item item) {
        shrekraft.proxy.registerItemRenderer(item, 0, "ItemGingerbreadCookie");
    }
}
