package net.emberextras;

import com.mojang.logging.LogUtils;
import net.emberextras.item.ModCreativeModeTab;
import net.emberextras.item.ModItems;
import net.emberextras.block.ModBlocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(EmberExtras.MODID)
public class EmberExtras {
    public static final String MODID = "emberextras";
    private static final Logger LOGGER = LogUtils.getLogger();

    // Very Important Comment
    public EmberExtras() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == ModCreativeModeTab.EMBER_EXTRAS) {
            event.accept(ModItems.BREAD_HELMET);
            event.accept(ModItems.BREAD_CHESTPLATE);
            event.accept(ModItems.BREAD_LEGGINGS);
            event.accept(ModItems.BREAD_BOOTS);
            event.accept(ModItems.STONE_EGG);
            event.accept(ModItems.TOMATO);
            event.accept(ModItems.TOMATO_SEEDS);
            event.accept(ModItems.GREEN_APPLE);
            event.accept(ModItems.GLITCHMONGUS);
            event.accept(ModItems.LOOT_BAG);
            event.accept(ModItems.MAGIC_BELL_UNLINKED);
            event.accept(ModItems.MAGIC_BELL_LINKED);
        }
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
