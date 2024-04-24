package net.maribunny.funnybunnymod.item;

import net.maribunny.funnybunnymod.funnybunnymod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.awt.event.InputEvent;

public class BunnyItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, funnybunnymod.MODID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register( "sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register( "raw_sapphire",
            () -> new Item((new Item.Properties())));

    public static final RegistryObject<Item> RUBY = ITEMS.register( "ruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register( "raw_ruby",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
