package net.maribunny.funnybunnymod.item;

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
                        pOutput.accept(BunnyItems.SAPPHIRE.get());
                        pOutput.accept(BunnyItems.RAW_SAPPHIRE.get());
                        pOutput.accept(BunnyItems.RAW_RUBY.get());
                        pOutput.accept(BunnyItems.RUBY.get());
                        pOutput.accept(Items.RABBIT_SPAWN_EGG);
                    })
                    .build());

    public static void register (IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);

    }
}
