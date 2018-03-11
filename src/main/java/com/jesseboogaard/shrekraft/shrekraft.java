package com.jesseboogaard.shrekraft;

import net.minecraft.block.Block;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraft.creativetab.CreativeTabs;
import com.jesseboogaard.shrekraft.items.shrekraftItems;


@Mod(modid="shrekraft", name="ShreKraft", version="0.0.1")
public class shrekraft {

    @SidedProxy(clientSide = "com.jesseboogaard.shrekraft.client.ClientProxy", serverSide = "com.jesseboogaard.shrekraft.CommonProxy")
    public static CommonProxy proxy;

    public static final CreativeTabs shrekraftTab = new shrekraftTab(CreativeTabs.getNextID(), "shrekraft");

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {


    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    @Mod.EventBusSubscriber
    public static class registrationHandler {
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            shrekraftItems.register(event.getRegistry());
        }
    }
}
