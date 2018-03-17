package com.jesseboogaard.shrekraft.items;

import com.jesseboogaard.shrekraft.shrekraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemPeeledOnion extends ItemFood {
    public ItemPeeledOnion() {
        super(4, 0.4f, false);
        setUnlocalizedName("ItemPeeledOnion");
        setRegistryName("ItemPeeledOnion");
        setCreativeTab(shrekraft.shrekraftTab);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add("Onions have layers. Ogres have layers.");
    }

    public void registerItemModel(Item item) {
        shrekraft.proxy.registerItemRenderer(item, 0, "ItemPeeledOnion");
    }
}
