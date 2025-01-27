package com.fuqing_sxysm.miragic;

import com.fuqing_sxysm.miragic.block.ModBlocks;
import com.fuqing_sxysm.miragic.item.ModCreativeModTabs;
import com.fuqing_sxysm.miragic.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Miragic.MOD_ID)
public class Miragic
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "miragic";
    // 直接引用 slf4j 记录器
    private static final Logger LOGGER = LogUtils.getLogger();

    public Miragic() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();



        //注册自定义物品栏对象
        ModCreativeModTabs.register(modEventBus);

        //注册物品事件对象
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);





        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // 将示例块项添加到 Building Block 选项卡
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
