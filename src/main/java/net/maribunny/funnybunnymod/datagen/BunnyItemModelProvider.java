package net.maribunny.funnybunnymod.datagen;

import net.maribunny.funnybunnymod.block.BunnyBlocks;
import net.maribunny.funnybunnymod.funnybunnymod;
import net.maribunny.funnybunnymod.item.BunnyItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BunnyItemModelProvider extends ItemModelProvider {


    public BunnyItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, funnybunnymod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(BunnyItems.RUBY);
        simpleItem(BunnyItems.RAW_RUBY);
        simpleItem(BunnyItems.SAPPHIRE);
        simpleItem(BunnyItems.RAW_SAPPHIRE);
        simpleItem(BunnyItems.METAL_DETECTOR);
        simpleItem(BunnyItems.PINE_CONE);
        simpleItem(BunnyItems.STRAWBERRY);

        simpleBlockItem(BunnyBlocks.SAPPHIRE_DOOR);

        fenceItem(BunnyBlocks.SAPPHIRE_FENCE, BunnyBlocks.SAPPHIRE_BLOCK);
        buttonItem(BunnyBlocks.SAPPHIRE_BUTTON, BunnyBlocks.SAPPHIRE_BLOCK);
        wallItem(BunnyBlocks.SAPPHIRE_WALL, BunnyBlocks.SAPPHIRE_BLOCK);

        evenSimplerBlockItem(BunnyBlocks.SAPPHIRE_STAIRS);
        evenSimplerBlockItem(BunnyBlocks.SAPPHIRE_SLAB);
        evenSimplerBlockItem(BunnyBlocks.SAPPHIRE_PRESSURE_PLATE);
        evenSimplerBlockItem(BunnyBlocks.SAPPHIRE_FENCE_GATE);

        trapdoorItem(BunnyBlocks.SAPPHIRE_TRAPDOOR);

    }
    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(funnybunnymod.MODID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(funnybunnymod.MODID,"item/" + item.getId().getPath()));
    }
    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(funnybunnymod.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(funnybunnymod.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(funnybunnymod.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(funnybunnymod.MODID,"item/" + item.getId().getPath()));
    }
    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }


}
