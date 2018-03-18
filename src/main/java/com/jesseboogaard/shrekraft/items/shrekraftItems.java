package com.jesseboogaard.shrekraft.items;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class shrekraftItems {

    public static Item ItemCottonSwab = new ItemCottonSwab("ItemCottonSwab");
    public static Item ItemEarwax = new shrekraftBaseItem("ItemEarwax");
    public  static Item ItemPeat = new ItemPeat("ItemPeat");
    public static Item ItemCompactor = new ItemCompactor("ItemCompactor");
    public static Item ItemMortarAndPestle = new ItemMortarAndPestle("ItemMortarAndPestle");
    public static Item ItemGroundGinger = new ItemGroundGinger("ItemGroundGinger");
    public static Item ItemOnion = new ItemOnion();
    public static Item ItemPeeledOnion = new ItemPeeledOnion();
    public static Item ItemOnionStew = new ItemOnionStew();
    public static Item ItemGinger = new ItemGinger();
    public static Item ItemGingerbreadCookie = new ItemGingerbreadCookie();


    public static void register(IForgeRegistry<Item> registry) {

        registry.registerAll(
                ItemCottonSwab,
                ItemEarwax,
                ItemPeat,
                ItemCompactor,
                ItemMortarAndPestle,
                ItemGroundGinger,
                ItemOnion,
                ItemPeeledOnion,
                ItemOnionStew,
                ItemGinger,
                ItemGingerbreadCookie);

        ((shrekraftBaseItem)ItemCottonSwab).registerItemModel(ItemCottonSwab);
        ((shrekraftBaseItem)ItemEarwax).registerItemModel(ItemEarwax);
        ((ItemPeat) ItemPeat).registerItemModel(ItemPeat);
        ((ItemCompactor) ItemCompactor).registerItemModel(ItemCompactor);
        ((ItemMortarAndPestle) ItemMortarAndPestle).registerItemModel(ItemMortarAndPestle);
        ((ItemGroundGinger) ItemGroundGinger).registerItemModel(ItemGroundGinger);
        ((ItemOnion)ItemOnion).registerItemModel(ItemOnion);
        ((ItemPeeledOnion) ItemPeeledOnion).registerItemModel(ItemPeeledOnion);
        ((ItemOnionStew) ItemOnionStew).registerItemModel(ItemOnionStew);
        ((ItemGinger)ItemGinger).registerItemModel(ItemGinger);
        ((ItemGingerbreadCookie) ItemGingerbreadCookie).registerItemModel(ItemGingerbreadCookie);
    }


}
