package com.fuqing_sxysm.miragic.block;

import com.fuqing_sxysm.miragic.Miragic;
import com.fuqing_sxysm.miragic.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Miragic.MOD_ID);


    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new Block(Block.Properties.copy(Blocks.GOLD_ORE)));//银矿
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            () -> new Block(Block.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE)));//深层银矿
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            () -> new Block(Block.Properties.copy(Blocks.RAW_GOLD_BLOCK)));//粗银块
    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(Block.Properties.copy(Blocks.GOLD_BLOCK)));//银块








    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }






}
