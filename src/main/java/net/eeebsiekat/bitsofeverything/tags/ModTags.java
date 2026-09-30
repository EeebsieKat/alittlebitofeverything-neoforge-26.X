package net.eeebsiekat.bitsofeverything.tags;

import net.eeebsiekat.bitsofeverything.ALittleBitofEverything;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {


        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(Identifier.fromNamespaceAndPath(ALittleBitofEverything.MOD_ID, name));
        }
    }
}
