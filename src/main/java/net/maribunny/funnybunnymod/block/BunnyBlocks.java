package net.maribunny.funnybunnymod.block;

import net.maribunny.funnybunnymod.funnybunnymod;
import net.maribunny.funnybunnymod.item.BunnyItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class BunnyBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, funnybunnymod.MODID);

    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> RAW_SAPPHIRE = registerBlock("raw_sapphire_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE).sound(SoundType.CALCITE)));

    public static final RegistryObject<Block> RAW_RUBY = registerBlock("raw_ruby_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE).sound(SoundType.CALCITE)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;

    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return BunnyItems.ITEMS.register(name, () -> new BlockItem(block.get(), new  Item.Properties()));

    }






    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);


    }
}
