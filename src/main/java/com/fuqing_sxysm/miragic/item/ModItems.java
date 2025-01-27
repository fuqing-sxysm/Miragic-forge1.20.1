package com.fuqing_sxysm.miragic.item;

import com.fuqing_sxysm.miragic.Miragic;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Miragic.MOD_ID);


    public static final RegistryObject<Item> MANA_CRYSTAL= ITEMS.register("mana_crystal",
            () -> new Item(new Item.Properties()));//魔晶
    public static final RegistryObject<Item> LIMITQUEST_HEART= ITEMS.register("limitquest_heart",
            () -> new Item(new Item.Properties()));//极限之心

    public static final RegistryObject<Item> RAW_SILVER=ITEMS.register("raw_silver",
            ()->new Item(new Item.Properties()));//粗银
    public static final RegistryObject<Item> SILVER_INGOT=ITEMS.register("silver_ingot",
            ()->new Item(new Item.Properties()));//银锭
    public static final RegistryObject<Item> SILVER_NUGGET=ITEMS.register("silver_nugget",
            ()->new Item(new Item.Properties()));//银粒






    public static void register (IEventBus eventBus){

        ITEMS.register(eventBus);

    }

}
