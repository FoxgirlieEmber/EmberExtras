package net.emberextras.datagen;

import net.emberextras.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TOMATO_SEEDS.get())
                .requires(ModItems.TOMATO.get())
                .unlockedBy("has_tomato", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TOMATO.get()).build()))
                        .save(consumer);
    }
}
