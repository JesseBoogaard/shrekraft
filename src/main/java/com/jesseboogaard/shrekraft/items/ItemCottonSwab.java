package com.jesseboogaard.shrekraft.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

import java.util.Random;

public class ItemCottonSwab extends shrekraftBaseItem {

    public ItemCottonSwab(String name) {
        super(name);
        setMaxDamage(20);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand hand) {

        ItemStack itemstack = player.getHeldItem(hand);
        itemstack.damageItem(1, player);
        Random random = new Random();
        if(random.nextBoolean()) {
            player.inventory.addItemStackToInventory(new ItemStack(shrekraftItems.ItemEarwax, 1));
        }
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);

    }
}
