package net.thecoolj14.sefat.datagen.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class SefatItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public SefatItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORD_ENCHANTABLE)
                .add(Items.WOODEN_AXE)
                .add(Items.STONE_AXE)
                .add(Items.IRON_AXE)
                .add(Items.GOLDEN_AXE)
                .add(Items.DIAMOND_AXE)
                .add(Items.NETHERITE_AXE)
                .add(Items.TRIDENT);
    }
}
