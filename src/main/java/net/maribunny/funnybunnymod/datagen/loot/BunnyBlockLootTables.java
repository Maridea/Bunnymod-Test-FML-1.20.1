package net.maribunny.funnybunnymod.datagen.loot;

import net.maribunny.funnybunnymod.block.BunnyBlocks;
import net.maribunny.funnybunnymod.item.BunnyItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class BunnyBlockLootTables extends BlockLootSubProvider {
    public BunnyBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(BunnyBlocks.SAPPHIRE_BLOCK.get());
        this.dropSelf(BunnyBlocks.RUBY_BLOCK.get());
        this.dropSelf(BunnyBlocks.RAW_SAPPHIRE.get());
        this.dropSelf(BunnyBlocks.RAW_RUBY.get());
        this.dropSelf(BunnyBlocks.SoundBlock.get());

        this.add(BunnyBlocks.SAPPHIRE_ORE.get(),
                block -> createOreDrop(BunnyBlocks.SAPPHIRE_ORE.get(), BunnyItems.RAW_SAPPHIRE.get()));
        this.add(BunnyBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                block -> createOreDrop(BunnyBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), BunnyItems.RAW_SAPPHIRE.get()));
        this.add(BunnyBlocks.NETHER_SAPPHIRE_ORE.get(),
                block -> createOreDrop(BunnyBlocks.NETHER_SAPPHIRE_ORE.get(), BunnyItems.RAW_SAPPHIRE.get()));
        this.add(BunnyBlocks.END_SAPPHIRE_ORE.get(),
                block -> createOreDrop(BunnyBlocks.END_SAPPHIRE_ORE.get(), BunnyItems.RAW_SAPPHIRE.get()));

        this.add(BunnyBlocks.RUBY_ORE.get(),
                block -> createOreDrop(BunnyBlocks.RUBY_ORE.get(), BunnyItems.RAW_RUBY.get()));
        this.add(BunnyBlocks.DEEPSLATE_RUBY_ORE.get(),
                block -> createOreDrop(BunnyBlocks.DEEPSLATE_RUBY_ORE.get(), BunnyItems.RAW_RUBY.get()));
        this.add(BunnyBlocks.NETHER_RUBY_ORE.get(),
                block -> createOreDrop(BunnyBlocks.NETHER_RUBY_ORE.get(), BunnyItems.RAW_RUBY.get()));
        this.add(BunnyBlocks.END_RUBY_ORE.get(),
                block -> createOreDrop(BunnyBlocks.END_RUBY_ORE.get(), BunnyItems.RAW_RUBY.get()));
    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BunnyBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
