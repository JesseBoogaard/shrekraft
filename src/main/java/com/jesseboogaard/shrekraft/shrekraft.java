package com.jesseboogaard.shrekraft;

import com.jesseboogaard.shrekraft.blocks.shrekraftBlocks;
import com.jesseboogaard.shrekraft.worldgen.shrekraftWorldGen;
import com.jesseboogaard.shrekraft.items.shrekraftItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;


@Mod(modid=sherkraftInfo.MOD_ID, name=sherkraftInfo.NAME, version=sherkraftInfo.VERSION)
public class shrekraft {


    @SidedProxy(clientSide = "com.jesseboogaard.shrekraft.client.ClientProxy", serverSide = "com.jesseboogaard.shrekraft.CommonProxy")
    public static CommonProxy proxy;

    public static final CreativeTabs shrekraftTab = new shrekraftTab(CreativeTabs.getNextID(), sherkraftInfo.MOD_ID);
    static
    {
        FluidRegistry.enableUniversalBucket();
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        GameRegistry.registerWorldGenerator(new shrekraftWorldGen(), 0);

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    @Mod.EventBusSubscriber
    public static class registrationHandler {
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            shrekraftItems.register(event.getRegistry());
            shrekraftBlocks.registerItemBlocks(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            shrekraftBlocks.register(event.getRegistry());
        }
        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event) {
            shrekraftBlocks.registerModels();
        }
    }
}
