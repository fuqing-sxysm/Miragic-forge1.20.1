package com.fuqing_sxysm.miragic.item;

import com.fuqing_sxysm.miragic.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, com.fuqing_sxysm.miragic.Miragic.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MIRAGIC_TAB = CREATIVE_MODE_TABS.register("miragic_tab",
            ()-> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MANA_CRYSTAL.get()))
                    .title(Component.translatable("creativetab.miragic_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //在此添加物品到自定义物品栏
                        output.accept(ModItems.MANA_CRYSTAL.get());//魔晶
                        output.accept(ModItems.LIMITQUEST_HEART.get());//极限之心
                        output.accept(ModItems.RAW_SILVER.get());//粗银
                        output.accept(ModItems.SILVER_INGOT.get());//银锭
                        output.accept(ModItems.SILVER_NUGGET.get());//银粒



                        output.accept(ModBlocks.SILVER_ORE.get());//银矿
                        output.accept(ModBlocks.SILVER_BLOCK.get());//银块
                        output.accept(ModBlocks.DEEPSLATE_SILVER_ORE.get());//深层银矿
                        output.accept(ModBlocks.RAW_SILVER_BLOCK.get());//粗银块





                    })
                    .build());




    public static void register(IEventBus eventBus){
       CREATIVE_MODE_TABS.register(eventBus);
    }


}
