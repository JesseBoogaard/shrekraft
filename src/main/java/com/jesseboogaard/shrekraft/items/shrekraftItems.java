package com.jesseboogaard.shrekraft.items;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class shrekraftItems {

    public static Item ItemCottonSwab = new ItemCottonSwab("ItemCottonSwab");
    public static Item ItemEarwax = new shrekraftBaseItem("ItemEarwax");

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                ItemCottonSwab,
                ItemEarwax);
        ((shrekraftBaseItem)ItemCottonSwab).registerItemModel(ItemCottonSwab);
        ((shrekraftBaseItem)ItemEarwax).registerItemModel(ItemEarwax);
    }


}
