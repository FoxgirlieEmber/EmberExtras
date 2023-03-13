package net.emberextras.block;

import net.emberextras.EmberExtras;
import net.emberextras.block.custom.TomatoPlantBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, EmberExtras.MODID);


    public static final RegistryObject<Block> TOMATO_PLANT = BLOCKS.register("tomato_plant",
            () -> new TomatoPlantBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
