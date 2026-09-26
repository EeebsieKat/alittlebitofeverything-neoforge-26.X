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
import net.neoforged.fml.common.Mod;

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
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LONSDALEITE_CUBE.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.LONSDALEITE.get())
                .unlockedBy(getHasName(ModItems.LONSDALEITE.get()), has(ModItems.LONSDALEITE))
                .group("lonsdaleite")
                .save(output, "alittlebitofeverything:lonsdaleite_cube_packing");

        shapeless(RecipeCategory.MISC, ModItems.LONSDALEITE.get(), 9)
                .requires(ModBlocks.LONSDALEITE_CUBE)
                .unlockedBy(getHasName(ModBlocks.LONSDALEITE_CUBE.get()), has(ModBlocks.LONSDALEITE_CUBE))
                .group("lonsdaleite")
                .save(output, "alittlebitofeverything:lonsdaleite_cube_unpacking");

        shaped(RecipeCategory.MISC, ModItems.LONSDALEITE.get())
                .pattern("AA")
                .pattern("AA")
                .define('A', ModItems.LONSDALEITE_FRAGMENT.get())
                .unlockedBy(getHasName(ModItems.LONSDALEITE_FRAGMENT.get()), has(ModItems.LONSDALEITE_FRAGMENT))
                .group("lonsdaleite")
                .save(output, "alittlebitofeverything:lonsdaleite_packing");

        shapeless(RecipeCategory.MISC, ModItems.LONSDALEITE_FRAGMENT.get(), 4)
                .requires(ModItems.LONSDALEITE)
                .unlockedBy(getHasName(ModItems.LONSDALEITE.get()), has(ModItems.LONSDALEITE))
                .group("lonsdaleite")
                .save(output, "alittlebitofeverything:lonsdaleite_unpacking");

        shaped(RecipeCategory.MISC, ModBlocks.LONSDALEITE_FRAGMENT_CUBE.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.LONSDALEITE_FRAGMENT.get())
                .unlockedBy(getHasName(ModItems.LONSDALEITE_FRAGMENT.get()), has(ModItems.LONSDALEITE_FRAGMENT))
                .group("lonsdaleite")
                .save(output, "alittlebitofeverything:lonsdaleite_fragment_cube_packing");

        shapeless(RecipeCategory.MISC, ModItems.LONSDALEITE_FRAGMENT.get(), 9)
                .requires(ModBlocks.LONSDALEITE_FRAGMENT_CUBE)
                .unlockedBy(getHasName(ModItems.LONSDALEITE.get()), has(ModItems.LONSDALEITE))
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
