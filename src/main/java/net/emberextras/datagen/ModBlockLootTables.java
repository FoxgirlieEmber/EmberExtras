package net.emberextras.datagen;

import net.emberextras.block.ModBlocks;
import net.emberextras.block.custom.TomatoPlantBlock;
import net.emberextras.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        /*add(ModBlocks.TOMATO_PLANT.get(),
                (block) -> createCropDrops(
                        ModBlocks.TOMATO_PLANT.get(),
                        ModItems.TOMATO.get(),
                        ModItems.TOMATO_SEEDS.get(),
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                .setProperties(StatePropertiesPredicate.Builder.properties()
                                        .hasProperty(TomatoPlantBlock.AGE, 3))));*/
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
