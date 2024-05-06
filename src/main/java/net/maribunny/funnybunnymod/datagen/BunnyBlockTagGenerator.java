package net.maribunny.funnybunnymod.datagen;

import net.maribunny.funnybunnymod.block.BunnyBlocks;
import net.maribunny.funnybunnymod.funnybunnymod;
import net.maribunny.funnybunnymod.util.BunnyTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BunnyBlockTagGenerator extends BlockTagsProvider {


    public BunnyBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, funnybunnymod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BunnyTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(BunnyBlocks.SAPPHIRE_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BunnyBlocks.SAPPHIRE_BLOCK.get(),
                        BunnyBlocks.RAW_SAPPHIRE.get(),
                        BunnyBlocks.RAW_RUBY.get(),
                        BunnyBlocks.SAPPHIRE_ORE.get(),
                        BunnyBlocks.NETHER_SAPPHIRE_ORE.get(),
                        BunnyBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                        BunnyBlocks.END_SAPPHIRE_ORE.get(),
                        BunnyBlocks.RUBY_ORE.get(),
                        BunnyBlocks.DEEPSLATE_RUBY_ORE.get(),
                        BunnyBlocks.NETHER_RUBY_ORE.get(),
                        BunnyBlocks.END_RUBY_ORE.get(),
                        BunnyBlocks.SoundBlock.get()
                        );

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(BunnyBlocks.NETHER_SAPPHIRE_ORE.get()).addTag(Tags.Blocks.ORES
                );
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(BunnyBlocks.SAPPHIRE_BLOCK.get()
                        );
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(BunnyBlocks.RAW_SAPPHIRE.get()
                        );
        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(BunnyBlocks.END_SAPPHIRE_ORE.get()
                );
        this.tag(BlockTags.FENCES)
                .add(BunnyBlocks.SAPPHIRE_FENCE.get()
                );
        this.tag(BlockTags.FENCE_GATES)
                .add(BunnyBlocks.SAPPHIRE_FENCE_GATE.get()
                );
        this.tag(BlockTags.WALLS)
                .add(BunnyBlocks.SAPPHIRE_WALL.get()
                );
    }
}
