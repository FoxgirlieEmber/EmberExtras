package net.emberextras.item;

import net.emberextras.EmberExtras;
import net.emberextras.block.ModBlocks;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EmberExtras.MODID);

    public static final RegistryObject<Item> STONE_EGG = ITEMS.register("stone_egg",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build())));
    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds",
            () -> new ItemNameBlockItem(ModBlocks.TOMATO_PLANT.get(),
                    new Item.Properties()));
    public static final RegistryObject<Item> GREEN_APPLE = ITEMS.register("green_apple",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GLITCHMONGUS = ITEMS.register("glitchmongus",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LOOT_BAG = ITEMS.register("loot_bag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_BELL_UNLINKED = ITEMS.register("magic_bell_unlinked",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_BELL_LINKED = ITEMS.register("magic_bell_linked",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BREAD_HELMET = ITEMS.register("bread_helmet",
            () -> new ArmorItem(ModArmorMaterials.BREAD, EquipmentSlot.HEAD,
                    new Item.Properties()));
    public static final RegistryObject<Item> BREAD_CHESTPLATE = ITEMS.register("bread_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BREAD, EquipmentSlot.HEAD,
                    new Item.Properties()));
    public static final RegistryObject<Item> BREAD_LEGGINGS = ITEMS.register("bread_leggings",
            () -> new ArmorItem(ModArmorMaterials.BREAD, EquipmentSlot.HEAD,
                    new Item.Properties()));
    public static final RegistryObject<Item> BREAD_BOOTS = ITEMS.register("bread_boots",
            () -> new ArmorItem(ModArmorMaterials.BREAD, EquipmentSlot.HEAD,
                    new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
