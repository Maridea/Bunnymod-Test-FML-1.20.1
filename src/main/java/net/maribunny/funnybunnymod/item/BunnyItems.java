package net.maribunny.funnybunnymod.item;

import net.maribunny.funnybunnymod.funnybunnymod;
import net.maribunny.funnybunnymod.item.custom.BunnyFuel;
import net.maribunny.funnybunnymod.item.custom.MetalDetectorItem;
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

    public static final RegistryObject<Item> PINE_CONE = ITEMS.register( "pine_cone",
            () -> new BunnyFuel(new Item.Properties(), 400));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register( "metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register( "strawberry",
            () -> new Item((new Item.Properties().food(BunnyFoods.STRAWBERRY))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
