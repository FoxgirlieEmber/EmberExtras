package net.emberextras.datagen;

import net.emberextras.EmberExtras;
import net.emberextras.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EmberExtras.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.BREAD_HELMET);
        simpleItem(ModItems.BREAD_CHESTPLATE);
        simpleItem(ModItems.BREAD_LEGGINGS);
        simpleItem(ModItems.BREAD_BOOTS);
        simpleItem(ModItems.GLITCHMONGUS);
        simpleItem(ModItems.GREEN_APPLE);
        simpleItem(ModItems.LOOT_BAG);
        simpleItem(ModItems.MAGIC_BELL_LINKED);
        simpleItem(ModItems.MAGIC_BELL_UNLINKED);
        simpleItem(ModItems.STONE_EGG);
        simpleItem(ModItems.TOMATO);
        simpleItem(ModItems.TOMATO_SEEDS);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(EmberExtras.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(EmberExtras.MODID,"item/" + item.getId().getPath()));
    }
}
