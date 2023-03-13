package net.emberextras.item;

import net.emberextras.EmberExtras;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = EmberExtras.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTab {
    public static CreativeModeTab EMBER_EXTRAS;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        EMBER_EXTRAS = event.registerCreativeModeTab(new ResourceLocation(EmberExtras.MODID, "ember_extras"),
                builder -> builder.icon(() -> new ItemStack(ModItems.TOMATO.get())).title(Component.literal("Ember's Extras")).build());
    }
}