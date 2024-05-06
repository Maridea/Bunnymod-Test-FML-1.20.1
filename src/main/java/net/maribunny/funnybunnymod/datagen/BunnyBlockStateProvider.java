package net.maribunny.funnybunnymod.datagen;

import net.maribunny.funnybunnymod.block.BunnyBlocks;
import net.maribunny.funnybunnymod.funnybunnymod;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
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

        //SAPPHIRE EXTRAS -SPEX
        stairsBlock(((StairBlock) BunnyBlocks.SAPPHIRE_STAIRS.get()), blockTexture(BunnyBlocks.SAPPHIRE_BLOCK.get()));
        slabBlock(((SlabBlock) BunnyBlocks.SAPPHIRE_SLAB.get()), blockTexture(BunnyBlocks.SAPPHIRE_BLOCK.get()), blockTexture(BunnyBlocks.SAPPHIRE_BLOCK.get()));
        buttonBlock(((ButtonBlock)BunnyBlocks.SAPPHIRE_BUTTON.get()),blockTexture(BunnyBlocks.SAPPHIRE_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) BunnyBlocks.SAPPHIRE_PRESSURE_PLATE.get()),blockTexture(BunnyBlocks.SAPPHIRE_BLOCK.get()));

        fenceBlock(((FenceBlock) BunnyBlocks.SAPPHIRE_FENCE.get()), blockTexture(BunnyBlocks.SAPPHIRE_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) BunnyBlocks.SAPPHIRE_FENCE_GATE.get()), blockTexture(BunnyBlocks.SAPPHIRE_BLOCK.get()));
        wallBlock(((WallBlock) BunnyBlocks.SAPPHIRE_WALL.get()), blockTexture(BunnyBlocks.SAPPHIRE_BLOCK.get()));

        doorBlockWithRenderType(((DoorBlock) BunnyBlocks.SAPPHIRE_DOOR.get()),
                modLoc("block/sapphire_door_bottom"),
                modLoc("block/sapphire_door_top"),
                "cutout");

        trapdoorBlockWithRenderType(((TrapDoorBlock) BunnyBlocks.SAPPHIRE_TRAPDOOR.get()),
                modLoc("block/sapphire_trapdoor"), true, "cutout");

    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
