package com.jesseboogaard.shrekraft.items;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class shrekraftItems {

    public static Item ItemCottonSwab = new ItemCottonSwab("ItemCottonSwab");
    public static Item ItemEarwax = new shrekraftBaseItem("ItemEarwax");
    public static Item ItemOnion = new ItemOnion();
    public static Item ItemOnionStew = new ItemOnionStew();
    public static Item ItemPeeledOnion = new ItemPeeledOnion();
    public  static Item ItemPeat = new ItemPeat("ItemPeat");


    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                ItemCottonSwab,
                ItemEarwax,
                ItemOnion,
                ItemPeeledOnion,
                ItemOnionStew,
                ItemPeat);
        ((shrekraftBaseItem)ItemCottonSwab).registerItemModel(ItemCottonSwab);
        ((shrekraftBaseItem)ItemEarwax).registerItemModel(ItemEarwax);
        ((ItemOnion)ItemOnion).registerItemModel(ItemOnion);
        ((ItemOnionStew) ItemOnionStew).registerItemModel(ItemOnionStew);
        ((ItemPeeledOnion) ItemPeeledOnion).registerItemModel(ItemPeeledOnion);
        ((ItemPeat) ItemPeat).registerItemModel(ItemPeat);
    }


}
