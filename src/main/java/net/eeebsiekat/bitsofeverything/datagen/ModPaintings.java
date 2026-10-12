package net.eeebsiekat.bitsofeverything.datagen;

import net.eeebsiekat.bitsofeverything.ALittleBitofEverything;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.decoration.painting.PaintingVariant;

import java.util.Optional;

public class ModPaintings {
    public static final ResourceKey<PaintingVariant> DOOBIE_WAP_KEY = create("doobie_wap");
    public static final ResourceKey<PaintingVariant> EYE_SEE_YOU_KEY = create("eye_see_you");
    public static final ResourceKey<PaintingVariant> STRAWBERRY_MOONSHINE_KEY = create("strawberry_moonshine");

    public static void bootstrap(BootstrapContext<PaintingVariant> context) {
        register(context, DOOBIE_WAP_KEY, 4, 4, true);
        register(context, EYE_SEE_YOU_KEY, 1, 1, true);
        register(context, STRAWBERRY_MOONSHINE_KEY, 3, 1, true);
    }

    private static ResourceKey<PaintingVariant> create(final String id) {
        return ResourceKey.create(Registries.PAINTING_VARIANT, Identifier.fromNamespaceAndPath(ALittleBitofEverything.MOD_ID, id));
    }

    private static void register(final BootstrapContext<PaintingVariant> context, final ResourceKey<PaintingVariant> key, final int width,
                                 final int height, final boolean hasAuthor
    ) {
        context.register(key, new PaintingVariant(width, height, key.identifier(),
                Optional.of(Component.translatable(key.identifier().toLanguageKey("painting", "title")).withStyle(ChatFormatting.YELLOW)),
                hasAuthor ? Optional.of(Component.translatable(key.identifier().toLanguageKey("painting", "author")).withStyle(ChatFormatting.GRAY)) : Optional.empty()));
    }
}
