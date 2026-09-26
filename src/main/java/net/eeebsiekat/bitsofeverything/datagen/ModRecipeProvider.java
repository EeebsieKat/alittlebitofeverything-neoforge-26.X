package net.eeebsiekat.bitsofeverything.datagen;

import net.eeebsiekat.bitsofeverything.ALittleBitofEverything;
import net.eeebsiekat.bitsofeverything.block.ModBlocks;
import net.eeebsiekat.bitsofeverything.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new ModRecipeProvider(registries, output);
        }

        @Override
        public String getName() {
            return "A Little Bit of Recipes";
        }
    }

    @Override
    protected void buildRecipes() {
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROSE_SPAR_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ROSE_SPAR.get())
                .unlockedBy(getHasName(ModItems.ROSE_SPAR.get()), has(ModItems.ROSE_SPAR))
                .group("lonsdaleite")
                .save(output, "alittlebitofeverything:lonsdaleite_cube_packing");

        shapeless(RecipeCategory.MISC, ModItems.ROSE_SPAR.get(), 9)
                .requires(ModBlocks.ROSE_SPAR_BLOCK)
                .unlockedBy(getHasName(ModBlocks.ROSE_SPAR_BLOCK.get()), has(ModBlocks.ROSE_SPAR_BLOCK))
                .group("lonsdaleite")
                .save(output, "alittlebitofeverything:lonsdaleite_cube_unpacking");

        shaped(RecipeCategory.MISC, ModItems.ROSE_SPAR.get())
                .pattern("AA")
                .pattern("AA")
                .define('A', ModItems.ROSE_SPAR_SHARD.get())
                .unlockedBy(getHasName(ModItems.ROSE_SPAR_SHARD.get()), has(ModItems.ROSE_SPAR_SHARD))
                .group("lonsdaleite")
                .save(output, "alittlebitofeverything:lonsdaleite_packing");

        shapeless(RecipeCategory.MISC, ModItems.ROSE_SPAR_SHARD.get(), 4)
                .requires(ModItems.ROSE_SPAR)
                .unlockedBy(getHasName(ModItems.ROSE_SPAR.get()), has(ModItems.ROSE_SPAR))
                .group("lonsdaleite")
                .save(output, "alittlebitofeverything:lonsdaleite_unpacking");

        shaped(RecipeCategory.MISC, ModBlocks.ROSE_SPAR_SHARD_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ROSE_SPAR_SHARD.get())
                .unlockedBy(getHasName(ModItems.ROSE_SPAR_SHARD.get()), has(ModItems.ROSE_SPAR_SHARD))
                .group("lonsdaleite")
                .save(output, "alittlebitofeverything:lonsdaleite_fragment_cube_packing");

        shapeless(RecipeCategory.MISC, ModItems.ROSE_SPAR_SHARD.get(), 9)
                .requires(ModBlocks.ROSE_SPAR_SHARD_BLOCK)
                .unlockedBy(getHasName(ModItems.ROSE_SPAR.get()), has(ModItems.ROSE_SPAR))
                .group("lonsdaleite")
                .save(output, "alittlebitofeverything:lonsdaleite_fragment_cube_unpacking");

        List<ItemLike> PIGEONITE_SMELTABLES = List.of(ModItems.RAW_PIGEONITE, ModBlocks.PIGEONITE);

        oreSmelting(PIGEONITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.PIGEONITE.get(), 0.25f, 200, "pigeonite");
        oreBlasting(PIGEONITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.PIGEONITE.get(), 0.25f, 100, "pigeonite");

        List<ItemLike> OLIVINE_SMELTABLES = List.of(ModItems.RAW_OLIVINE, ModBlocks.OLIVINE);

        oreSmelting(OLIVINE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.OLIVINE.get(), 0.25f, 200, "olivine");
        oreBlasting(OLIVINE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.OLIVINE.get(), 0.25f, 100, "olivine");

    }

    @Override
    protected <T extends AbstractCookingRecipe> void oreCooking(AbstractCookingRecipe.Factory<T> factory, List<ItemLike> smeltables,
                                                                RecipeCategory craftingCategory, CookingBookCategory cookingCategory, ItemLike result,
                                                                float experience, int cookingTime, String group, String fromDesc) {
        for(ItemLike itemlike : smeltables) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), craftingCategory, cookingCategory, result, experience, cookingTime, factory).group(group).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(output, ALittleBitofEverything.MOD_ID + ":" + getItemName(result) + fromDesc + "_" + getItemName(itemlike));
        }
    }
}
