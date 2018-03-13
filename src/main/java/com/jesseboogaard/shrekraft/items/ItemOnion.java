package com.jesseboogaard.shrekraft.items;

import com.jesseboogaard.shrekraft.blocks.shrekraftBlocks;
import com.jesseboogaard.shrekraft.shrekraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.init.Blocks;
import net.minecraft.item.*;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;


public class ItemOnion extends ItemSeeds {

    public ItemOnion() {
        super(shrekraftBlocks.blockCropOnion, Blocks.FARMLAND);
        setUnlocalizedName("ItemOnion");
        setRegistryName("ItemOnion");
        setCreativeTab(shrekraft.shrekraftTab);

    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add("Onions have layers, so do Ogres.");
    }

    public void registerItemModel(Item item) {
        shrekraft.proxy.registerItemRenderer(item, 0, "ItemOnion");
    }
}
