package net.maribunny.funnybunnymod.datagen;

import net.maribunny.funnybunnymod.block.BunnyBlocks;
import net.maribunny.funnybunnymod.funnybunnymod;
import net.maribunny.funnybunnymod.item.BunnyItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class BunnyRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> SAPPHIRE_SMELTABLES = List.of(BunnyItems.RAW_SAPPHIRE.get(),
            BunnyBlocks.SAPPHIRE_ORE.get(), BunnyBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), BunnyBlocks.NETHER_SAPPHIRE_ORE.get(),
            BunnyBlocks.END_SAPPHIRE_ORE.get());

    private static final List<ItemLike> RUBY_SMELTABLES = List.of(BunnyItems.RAW_RUBY.get(),
            BunnyBlocks.RUBY_ORE.get(), BunnyBlocks.DEEPSLATE_RUBY_ORE.get(), BunnyBlocks.NETHER_RUBY_ORE.get(),
            BunnyBlocks.END_RUBY_ORE.get());



    public BunnyRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        oreBlasting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, BunnyItems.SAPPHIRE.get(), 0.25F, 200, "sapphire");
        oreBlasting(pWriter, RUBY_SMELTABLES, RecipeCategory.MISC, BunnyItems.RUBY.get(), 0.25F, 200, "ruby");
        oreSmelting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, BunnyItems.SAPPHIRE.get(), 0.25F, 100, "sapphire");
        oreSmelting(pWriter, RUBY_SMELTABLES, RecipeCategory.MISC, BunnyItems.RUBY.get(), 0.25F, 100, "ruby");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BunnyBlocks.SAPPHIRE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', BunnyItems.SAPPHIRE.get())
                .unlockedBy(getHasName(BunnyItems.SAPPHIRE.get()), has(BunnyItems.SAPPHIRE.get()))
                .save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BunnyItems.SAPPHIRE.get(), 9)
                .requires(BunnyBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(BunnyBlocks.SAPPHIRE_BLOCK.get()), has(BunnyBlocks.SAPPHIRE_BLOCK.get()))
                .save(pWriter);
    }
    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        Iterator var9 = pIngredients.iterator();

        while(var9.hasNext()) {
            ItemLike itemlike = (ItemLike)var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, funnybunnymod.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
