package net.maribunny.funnybunnymod.datagen;

import net.maribunny.funnybunnymod.block.BunnyBlocks;
import net.maribunny.funnybunnymod.funnybunnymod;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class BunnyBlockStateProvider extends BlockStateProvider {

    public BunnyBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, funnybunnymod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(BunnyBlocks.SAPPHIRE_BLOCK);
        blockWithItem(BunnyBlocks.RUBY_BLOCK);
        blockWithItem(BunnyBlocks.RAW_SAPPHIRE);
        blockWithItem(BunnyBlocks.RAW_RUBY);
        blockWithItem(BunnyBlocks.RUBY_ORE);
        blockWithItem(BunnyBlocks.SAPPHIRE_ORE);
        blockWithItem(BunnyBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockWithItem(BunnyBlocks.NETHER_SAPPHIRE_ORE);
        blockWithItem(BunnyBlocks.END_SAPPHIRE_ORE);
        blockWithItem(BunnyBlocks.DEEPSLATE_RUBY_ORE);
        blockWithItem(BunnyBlocks.NETHER_RUBY_ORE);
        blockWithItem(BunnyBlocks.END_RUBY_ORE);
        blockWithItem(BunnyBlocks.SoundBlock);


    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
