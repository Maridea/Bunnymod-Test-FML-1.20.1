package net.maribunny.funnybunnymod.item;

import net.maribunny.funnybunnymod.block.BunnyBlocks;
import net.maribunny.funnybunnymod.funnybunnymod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class BunnyCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, funnybunnymod.MODID);

    public static final RegistryObject<CreativeModeTab> BUNNY_TAB = CREATIVE_MODE_TABS.register("bunny_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(BunnyItems.RUBY.get()))
                    .title(Component.translatable("creativetab.bunny_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //items
                        pOutput.accept(BunnyItems.SAPPHIRE.get());
                        pOutput.accept(BunnyItems.RAW_SAPPHIRE.get());
                        pOutput.accept(BunnyItems.RAW_RUBY.get());
                        pOutput.accept(BunnyItems.RUBY.get());
                        pOutput.accept(BunnyItems.METAL_DETECTOR.get());
                        //bnuy
                        pOutput.accept(Items.RABBIT_SPAWN_EGG);
                        //refined blocks
                        pOutput.accept(BunnyBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(BunnyBlocks.RUBY_BLOCK.get());
                        //raw blocks
                        pOutput.accept(BunnyBlocks.RAW_RUBY.get());
                        pOutput.accept(BunnyBlocks.RAW_SAPPHIRE.get());
                        pOutput.accept(BunnyBlocks.SoundBlock.get());
                        //ores
                        pOutput.accept(BunnyBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(BunnyBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        pOutput.accept(BunnyBlocks.NETHER_SAPPHIRE_ORE.get());
                        pOutput.accept(BunnyBlocks.END_SAPPHIRE_ORE.get());

                        pOutput.accept(BunnyBlocks.RUBY_ORE.get());
                        pOutput.accept(BunnyBlocks.DEEPSLATE_RUBY_ORE.get());
                        pOutput.accept(BunnyBlocks.NETHER_RUBY_ORE.get());
                        pOutput.accept(BunnyBlocks.END_RUBY_ORE.get());


                        ;
                    })
                    .build());

    public static void register (IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);

    }
}
