package net.emberextras.datagen;

import net.emberextras.EmberExtras;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider{
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, EmberExtras.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }
}