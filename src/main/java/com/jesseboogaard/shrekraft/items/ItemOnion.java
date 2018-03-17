package com.jesseboogaard.shrekraft.items;

import com.jesseboogaard.shrekraft.blocks.shrekraftBlocks;
import com.jesseboogaard.shrekraft.shrekraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;


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
        tooltip.add("Onions have layers. Ogres have layers.");
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand hand) {

        ItemStack itemstack = player.getHeldItem(hand);
        if (!player.capabilities.isCreativeMode)
        {
            itemstack.shrink(1);
        }
            player.inventory.addItemStackToInventory(new ItemStack(shrekraftItems.ItemPeeledOnion, 1));
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);

    }

    public void registerItemModel(Item item) {
        shrekraft.proxy.registerItemRenderer(item, 0, "ItemOnion");
    }
}
