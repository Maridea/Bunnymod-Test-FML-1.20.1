package net.maribunny.funnybunnymod.datagen;

import com.google.common.eventbus.Subscribe;
import net.maribunny.funnybunnymod.funnybunnymod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = funnybunnymod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new BunnyRecipeProvider(packOutput));
        generator.addProvider(event.includeServer(), BunnyLootTableProvider.create(packOutput));

        generator.addProvider(event.includeClient(), new BunnyBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new BunnyItemModelProvider(packOutput, existingFileHelper));

        BunnyBlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(),
                new BunnyBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));

        //generator.addProvider(event.includeServer(), new BunnyRecipeProvider(packOutput));


        generator.addProvider(event.includeServer(), new BunnyItemTagGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));

    }

}