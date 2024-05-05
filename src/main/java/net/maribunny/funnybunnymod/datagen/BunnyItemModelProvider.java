package net.maribunny.funnybunnymod.datagen;

import net.maribunny.funnybunnymod.funnybunnymod;
import net.maribunny.funnybunnymod.item.BunnyItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
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


    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(funnybunnymod.MODID,"item/" + item.getId().getPath()));
    }
}
