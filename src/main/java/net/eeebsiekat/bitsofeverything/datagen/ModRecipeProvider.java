package net.eeebsiekat.bitsofeverything.datagen;

import net.eeebsiekat.bitsofeverything.ALittleBitofEverything;
import net.eeebsiekat.bitsofeverything.block.ModBlocks;
import net.eeebsiekat.bitsofeverything.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.SuspiciousEffectHolder;

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
        // ROSE SPAR
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROSE_SPAR_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ROSE_SPAR.get())
                .unlockedBy(getHasName(ModItems.ROSE_SPAR.get()), has(ModItems.ROSE_SPAR))
                .group("rose_spar")
                .save(output, "alittlebitofeverything:rose_spar_block_packing");

        shapeless(RecipeCategory.MISC, ModItems.ROSE_SPAR.get(), 9)
                .requires(ModBlocks.ROSE_SPAR_BLOCK)
                .unlockedBy(getHasName(ModBlocks.ROSE_SPAR_BLOCK.get()), has(ModBlocks.ROSE_SPAR_BLOCK))
                .group("rose_spar")
                .save(output, "alittlebitofeverything:rose_spar_block_unpacking");

        shaped(RecipeCategory.MISC, ModItems.ROSE_SPAR.get())
                .pattern("AA")
                .pattern("AA")
                .define('A', ModItems.ROSE_SPAR_SHARD.get())
                .unlockedBy(getHasName(ModItems.ROSE_SPAR_SHARD.get()), has(ModItems.ROSE_SPAR_SHARD))
                .group("rose_spar")
                .save(output, "alittlebitofeverything:rose_spar_packing");

        shapeless(RecipeCategory.MISC, ModItems.ROSE_SPAR_SHARD.get(), 4)
                .requires(ModItems.ROSE_SPAR)
                .unlockedBy(getHasName(ModItems.ROSE_SPAR.get()), has(ModItems.ROSE_SPAR))
                .group("rose_spar")
                .save(output, "alittlebitofeverything:rose_spar_unpacking");

        shaped(RecipeCategory.MISC, ModBlocks.ROSE_SPAR_SHARD_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ROSE_SPAR_SHARD.get())
                .unlockedBy(getHasName(ModItems.ROSE_SPAR_SHARD.get()), has(ModItems.ROSE_SPAR_SHARD))
                .group("rose_spar")
                .save(output, "alittlebitofeverything:rose_spar_shard_block_packing");

        shapeless(RecipeCategory.MISC, ModItems.ROSE_SPAR_SHARD.get(), 9)
                .requires(ModBlocks.ROSE_SPAR_SHARD_BLOCK)
                .unlockedBy(getHasName(ModItems.ROSE_SPAR.get()), has(ModItems.ROSE_SPAR))
                .group("rose_spar")
                .save(output, "alittlebitofeverything:rose_spar_shard_block_unpacking");

        // TEAL SPAR
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TEAL_SPAR_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.TEAL_SPAR.get())
                .unlockedBy(getHasName(ModItems.TEAL_SPAR.get()), has(ModItems.TEAL_SPAR))
                .group("teal_spar")
                .save(output, "alittlebitofeverything:teal_spar_block_packing");

        shapeless(RecipeCategory.MISC, ModItems.TEAL_SPAR.get(), 9)
                .requires(ModBlocks.TEAL_SPAR_BLOCK)
                .unlockedBy(getHasName(ModBlocks.TEAL_SPAR_BLOCK.get()), has(ModBlocks.TEAL_SPAR_BLOCK))
                .group("teal_spar")
                .save(output, "alittlebitofeverything:teal_spar_block_unpacking");

        shaped(RecipeCategory.MISC, ModItems.TEAL_SPAR.get())
                .pattern("AA")
                .pattern("AA")
                .define('A', ModItems.TEAL_SPAR_SHARD.get())
                .unlockedBy(getHasName(ModItems.TEAL_SPAR_SHARD.get()), has(ModItems.TEAL_SPAR_SHARD))
                .group("teal_spar")
                .save(output, "alittlebitofeverything:teal_spar_packing");

        shapeless(RecipeCategory.MISC, ModItems.TEAL_SPAR_SHARD.get(), 4)
                .requires(ModItems.TEAL_SPAR)
                .unlockedBy(getHasName(ModItems.TEAL_SPAR.get()), has(ModItems.TEAL_SPAR))
                .group("teal_spar")
                .save(output, "alittlebitofeverything:teal_spar_unpacking");

        shaped(RecipeCategory.MISC, ModBlocks.TEAL_SPAR_SHARD_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.TEAL_SPAR_SHARD.get())
                .unlockedBy(getHasName(ModItems.TEAL_SPAR_SHARD.get()), has(ModItems.TEAL_SPAR_SHARD))
                .group("teal_spar")
                .save(output, "alittlebitofeverything:teal_spar_shard_block_packing");

        shapeless(RecipeCategory.MISC, ModItems.TEAL_SPAR_SHARD.get(), 9)
                .requires(ModBlocks.TEAL_SPAR_SHARD_BLOCK)
                .unlockedBy(getHasName(ModBlocks.TEAL_SPAR_SHARD_BLOCK.get()), has(ModBlocks.TEAL_SPAR_SHARD_BLOCK))
                .group("teal_spar")
                .save(output, "alittlebitofeverything:teal_spar_shard_block_unpacking");

        // FROMAGE SPAR
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROMAGE_SPAR_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.FROMAGE_SPAR.get())
                .unlockedBy(getHasName(ModItems.FROMAGE_SPAR.get()), has(ModItems.FROMAGE_SPAR))
                .group("fromage_spar")
                .save(output, "alittlebitofeverything:fromage_spar_block_packing");

        shapeless(RecipeCategory.MISC, ModItems.FROMAGE_SPAR.get(), 9)
                .requires(ModBlocks.FROMAGE_SPAR_BLOCK)
                .unlockedBy(getHasName(ModBlocks.FROMAGE_SPAR_BLOCK.get()), has(ModBlocks.FROMAGE_SPAR_BLOCK))
                .group("fromage_spar")
                .save(output, "alittlebitofeverything:fromage_spar_block_unpacking");

        shaped(RecipeCategory.MISC, ModItems.FROMAGE_SPAR.get())
                .pattern("AA")
                .pattern("AA")
                .define('A', ModItems.FROMAGE_SPAR_SHARD.get())
                .unlockedBy(getHasName(ModItems.FROMAGE_SPAR_SHARD.get()), has(ModItems.FROMAGE_SPAR_SHARD))
                .group("fromage_spar")
                .save(output, "alittlebitofeverything:fromage_spar_packing");

        shapeless(RecipeCategory.MISC, ModItems.FROMAGE_SPAR_SHARD.get(), 4)
                .requires(ModItems.FROMAGE_SPAR)
                .unlockedBy(getHasName(ModItems.FROMAGE_SPAR.get()), has(ModItems.FROMAGE_SPAR))
                .group("fromage_spar")
                .save(output, "alittlebitofeverything:fromage_spar_unpacking");

        shaped(RecipeCategory.MISC, ModBlocks.FROMAGE_SPAR_SHARD_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.FROMAGE_SPAR_SHARD.get())
                .unlockedBy(getHasName(ModItems.FROMAGE_SPAR_SHARD.get()), has(ModItems.FROMAGE_SPAR_SHARD))
                .group("fromage_spar")
                .save(output, "alittlebitofeverything:fromage_spar_shard_block_packing");

        shapeless(RecipeCategory.MISC, ModItems.FROMAGE_SPAR_SHARD.get(), 9)
                .requires(ModBlocks.FROMAGE_SPAR_SHARD_BLOCK)
                .unlockedBy(getHasName(ModBlocks.FROMAGE_SPAR_SHARD_BLOCK.get()), has(ModBlocks.FROMAGE_SPAR_SHARD_BLOCK))
                .group("fromage_spar")
                .save(output, "alittlebitofeverything:fromage_spar_shard_block_unpacking");

        List<ItemLike> PIGEONITE_SMELTABLES = List.of(ModItems.RAW_PIGEONITE, ModBlocks.PIGEONITE_ROSE_SPAR_ORE);

        oreSmelting(PIGEONITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.PIGEONITE.get(), 0.25f, 200, "pigeonite");
        oreBlasting(PIGEONITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.PIGEONITE.get(), 0.25f, 100, "pigeonite");

        List<ItemLike> OLIVINE_SMELTABLES = List.of(ModItems.RAW_OLIVINE, ModBlocks.OLIVINE_ROSE_SPAR_ORE);

        oreSmelting(OLIVINE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.OLIVINE.get(), 0.25f, 200, "olivine");
        oreBlasting(OLIVINE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.OLIVINE.get(), 0.25f, 100, "olivine");

        stairBuilder(ModBlocks.BRECCIA_STAIRS.get(), Ingredient.of(ModBlocks.BRECCIA))
                .unlockedBy(getHasName(ModBlocks.BRECCIA.get()), has(ModBlocks.BRECCIA))
                .group("breccia")
                .save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BRECCIA_SLAB.get(), ModBlocks.BRECCIA.get());
        stairBuilder(ModBlocks.SINTERED_BRECCIA_STAIRS.get(), Ingredient.of(ModBlocks.SINTERED_BRECCIA))
                .unlockedBy(getHasName(ModBlocks.SINTERED_BRECCIA.get()), has(ModBlocks.SINTERED_BRECCIA))
                .group("breccia")
                .save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SINTERED_BRECCIA_SLAB.get(), ModBlocks.SINTERED_BRECCIA.get());
        buttonBuilder(ModBlocks.BRECCIA_BUTTON.get(), Ingredient.of(ModBlocks.BRECCIA.get()))
                .unlockedBy(getHasName(ModBlocks.BRECCIA.get()), has(ModBlocks.BRECCIA))
                .group("breccia")
                .save(output);
        pressurePlate(ModBlocks.BRECCIA_PRESSURE_PLATE.get(), ModBlocks.BRECCIA);
        fenceBuilder(ModBlocks.BRECCIA_FENCE, Ingredient.of(ModBlocks.BRECCIA))
                .unlockedBy(getHasName(ModBlocks.BRECCIA.get()), has(ModBlocks.BRECCIA))
                .group("breccia")
                .save(output);
        fenceGateBuilder(ModBlocks.BRECCIA_FENCE_GATE, Ingredient.of(ModBlocks.BRECCIA))
                .unlockedBy(getHasName(ModBlocks.BRECCIA.get()), has(ModBlocks.BRECCIA))
                .group("breccia")
                .save(output);
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BRECCIA_WALL.get(), ModBlocks.BRECCIA.get());
        doorBuilder(ModBlocks.BRECCIA_DOR.get(), Ingredient.of(ModBlocks.BRECCIA.get()))
                .unlockedBy(getHasName(ModBlocks.BRECCIA.get()), has(ModBlocks.BRECCIA))
                .group("breccia")
                .save(output);
        trapdoorBuilder(ModBlocks.BRECCIA_TRAPDOR.get(), Ingredient.of(ModBlocks.BRECCIA.get()))
                .unlockedBy(getHasName(ModBlocks.BRECCIA.get()), has(ModBlocks.BRECCIA))
                .group("breccia")
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.CHROMITE_BAR.get(), 8)
                .pattern(" C ")
                .pattern(" C ")
                .define('C', ModItems.CHROMITE.get())
                .unlockedBy(getHasName(ModItems.CHROMITE.get()), has(ModItems.CHROMITE))
                .group("chromite")
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.CHROMITE_SABRE.get())
                .pattern("C")
                .pattern("C")
                .pattern("B")
                .define('C', ModItems.CHROMITE.get())
                .define('B', ModItems.CHROMITE_BAR.get())
                .unlockedBy(getHasName(ModItems.CHROMITE.get()), has(ModItems.CHROMITE))
                .group("chromite")
                .save(output);
        shaped(RecipeCategory.TOOLS, ModItems.CHROMITE_PICKAXE.get())
                .pattern("CCC")
                .pattern(" B ")
                .pattern(" B ")
                .define('C', ModItems.CHROMITE.get())
                .define('B', ModItems.CHROMITE_BAR.get())
                .unlockedBy(getHasName(ModItems.CHROMITE.get()), has(ModItems.CHROMITE))
                .group("chromite")
                .save(output);
        shaped(RecipeCategory.COMBAT, ModItems.CHROMITE_AXE.get())
                .pattern("CC")
                .pattern("BC")
                .pattern("B ")
                .define('C', ModItems.CHROMITE.get())
                .define('B', ModItems.CHROMITE_BAR.get())
                .unlockedBy(getHasName(ModItems.CHROMITE.get()), has(ModItems.CHROMITE))
                .group("chromite")
                .save(output);
        shaped(RecipeCategory.TOOLS, ModItems.CHROMITE_SHOVEL.get())
                .pattern("C")
                .pattern("B")
                .pattern("B")
                .define('C', ModItems.CHROMITE.get())
                .define('B', ModItems.CHROMITE_BAR.get())
                .unlockedBy(getHasName(ModItems.CHROMITE.get()), has(ModItems.CHROMITE))
                .group("chromite")
                .save(output);
        shaped(RecipeCategory.TOOLS, ModItems.CHROMITE_HOE.get())
                .pattern("CC")
                .pattern("B ")
                .pattern("B ")
                .define('C', ModItems.CHROMITE.get())
                .define('B', ModItems.CHROMITE_BAR.get())
                .unlockedBy(getHasName(ModItems.CHROMITE.get()), has(ModItems.CHROMITE))
                .group("chromite")
                .save(output);
        shaped(RecipeCategory.COMBAT, ModItems.CHROMITE_SPEAR.get())
                .pattern("  C")
                .pattern(" B ")
                .pattern("B  ")
                .define('C', ModItems.CHROMITE.get())
                .define('B', ModItems.CHROMITE_BAR.get())
                .unlockedBy(getHasName(ModItems.CHROMITE.get()), has(ModItems.CHROMITE))
                .group("chromite")
                .save(output);
        shaped(RecipeCategory.COMBAT, ModItems.CHROMITE_LANCE.get())
                .pattern("  C")
                .pattern(" B ")
                .pattern("BC ")
                .define('C', ModItems.CHROMITE.get())
                .define('B', ModItems.CHROMITE_BAR.get())
                .unlockedBy(getHasName(ModItems.CHROMITE.get()), has(ModItems.CHROMITE))
                .group("chromite")
                .save(output);
        shaped(RecipeCategory.COMBAT, ModItems.CHROMITE_GREATSWORD.get())
                .pattern("  C")
                .pattern("CC ")
                .pattern("BC ")
                .define('C', ModItems.CHROMITE.get())
                .define('B', ModItems.CHROMITE_BAR.get())
                .unlockedBy(getHasName(ModItems.CHROMITE.get()), has(ModItems.CHROMITE))
                .group("chromite")
                .save(output);
        shaped(RecipeCategory.COMBAT, ModItems.CHROMITE_HALBERD.get())
                .pattern(" CC")
                .pattern(" BC")
                .pattern("B  ")
                .define('C', ModItems.CHROMITE.get())
                .define('B', ModItems.CHROMITE_BAR.get())
                .unlockedBy(getHasName(ModItems.CHROMITE.get()), has(ModItems.CHROMITE))
                .group("chromite")
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.CHROMITE_HELMET.get())
                .pattern("CCC")
                .pattern("C C")
                .define('C', ModItems.CHROMITE.get())
                .unlockedBy(getHasName(ModItems.CHROMITE.get()), has(ModItems.CHROMITE))
                .group("chromite")
                .save(output);
        shaped(RecipeCategory.COMBAT, ModItems.CHROMITE_CHESTPLATE.get())
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .define('C', ModItems.CHROMITE.get())
                .unlockedBy(getHasName(ModItems.CHROMITE.get()), has(ModItems.CHROMITE))
                .group("chromite")
                .save(output);
        shaped(RecipeCategory.COMBAT, ModItems.CHROMITE_LEGGINGS.get())
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .define('C', ModItems.CHROMITE.get())
                .unlockedBy(getHasName(ModItems.CHROMITE.get()), has(ModItems.CHROMITE))
                .group("chromite")
                .save(output);
        shaped(RecipeCategory.COMBAT, ModItems.CHROMITE_BOOTS.get())
                .pattern("C C")
                .pattern("C C")
                .define('C', ModItems.CHROMITE.get())
                .unlockedBy(getHasName(ModItems.CHROMITE.get()), has(ModItems.CHROMITE))
                .group("chromite")
                .save(output);

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
