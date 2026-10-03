package net.eeebsiekat.bitsofeverything.tags;

import net.eeebsiekat.bitsofeverything.ALittleBitofEverything;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> METAL_DETECTABLES = createTag("metal_detectables");

        public static final TagKey<Block> NEEDS_CHROMITE_TOOL = createTag("needs_chromite_tool");
        public static final TagKey<Block> INCORRECT_FOR_CHROMITE_TOOL = createTag("incorrect_for_chromite_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(Identifier.fromNamespaceAndPath(ALittleBitofEverything.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> CARBON_LIKES = createTag("carbon_likes");

        public static final TagKey<Item> CHROMITE_REPAIRABLES = createTag("chromite_repairables");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(Identifier.fromNamespaceAndPath(ALittleBitofEverything.MOD_ID, name));
        }
    }
}
