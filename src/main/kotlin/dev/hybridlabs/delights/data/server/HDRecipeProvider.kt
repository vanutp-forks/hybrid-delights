package dev.hybridlabs.delights.data.server

import dev.hybridlabs.aquatic.item.HAItems
import dev.hybridlabs.aquatic.item.HAPlatformItems
import dev.hybridlabs.delights.items.HDItems
import dev.hybridlabs.delights.tags.HDItemTags
import net.minecraft.core.HolderLookup
import net.minecraft.data.PackOutput
import net.minecraft.data.recipes.*
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item
import net.minecraft.world.item.Items
import net.minecraft.world.item.crafting.*
import net.neoforged.neoforge.common.Tags
import vectorwing.farmersdelight.client.recipebook.CookingPotRecipeBookTab
import vectorwing.farmersdelight.common.registry.ModItems
import vectorwing.farmersdelight.common.tag.CommonTags
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder
import vectorwing.farmersdelight.data.recipe.CuttingRecipes
import java.util.concurrent.CompletableFuture

class HDRecipeProvider(
    output: PackOutput,
    registries: CompletableFuture<HolderLookup.Provider>
) : RecipeProvider(output, registries) {
    override fun buildRecipes(exporter: RecipeOutput) {
        cuttingRecipes(exporter)
        knifeRecipes(exporter)
        craftingRecipes(exporter)
        smeltingRecipes(exporter)
        cookingRecipes(exporter)
    }

    private fun cookingRecipes(exporter: RecipeOutput) {
        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.SALT.get(), 1, 100, 1.0f
        )
            .addIngredient(HDItems.BRINE_BOTTLE.get())
            .unlockedByAnyIngredient(
                HDItems.BRINE_BOTTLE.get()
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.CURED_COD_ROE.get(), 1, 150, 1.0f, Items.GLASS_BOTTLE
        )
            .addIngredient(HDItems.SALT.get())
            .addIngredient(HDItems.COD_ROE.get())
            .unlockedByAnyIngredient(
                HDItems.SALT.get(),
                HDItems.COD_ROE.get()
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.CURED_SALMON_ROE.get(), 1, 150, 1.0f, Items.GLASS_BOTTLE
        )
            .addIngredient(HDItems.SALT.get())
            .addIngredient(HDItems.SALMON_ROE.get())
            .unlockedByAnyIngredient(
                HDItems.SALT.get(),
                HDItems.SALMON_ROE.get()
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.CURED_TROPICAL_FISH_ROE.get(), 1, 150, 1.0f, Items.GLASS_BOTTLE
        )
            .addIngredient(HDItems.SALT.get())
            .addIngredient(HDItems.TROPICAL_FISH_ROE.get())
            .unlockedByAnyIngredient(
                HDItems.SALT.get(),
                HDItems.TROPICAL_FISH_ROE.get()
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.CURED_CARP_ROE.get(), 1, 150, 1.0f, Items.GLASS_BOTTLE
        )
            .addIngredient(HDItems.SALT.get())
            .addIngredient(HDItems.CARP_ROE.get())
            .unlockedByAnyIngredient(
                HDItems.SALT.get(),
                HDItems.CARP_ROE.get()
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.BAKED_STUFFED_LOBSTER.get(), 1, 400, 1.0f
        )
            .addIngredient(HAItems.RAW_LOBSTER.get())
            .addIngredient(HAItems.RAW_LOBSTER_TAIL.get())
            .addIngredient(HAItems.RAW_CRAB.get())
            .addIngredient(CommonTags.Items.CROPS_ONION)
            .unlockedByAnyIngredient(
                HAItems.RAW_LOBSTER.get(),
                HAItems.RAW_LOBSTER_TAIL.get(),
                HAItems.RAW_CRAB.get()
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.LOBSTER_STEW.get(), 1, 400, 1.0f, Items.BOWL
        )
            .addIngredient(HAItems.RAW_LOBSTER.get())
            .addIngredient(HAItems.RAW_LOBSTER_TAIL.get())
            .addIngredient(Tags.Items.FOODS_BREAD)
            .addIngredient(CommonTags.Items.CROPS_ONION)
            .addIngredient(CommonTags.Items.CROPS_TOMATO)
            .unlockedByAnyIngredient(
                HAItems.RAW_LOBSTER.get(),
                HAItems.RAW_LOBSTER_TAIL.get(),
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.BISQUE.get(), 1, 300, 1.0f, Items.BOWL
        )
            .addIngredient(HAItems.RAW_TENTACLE.get())
            .addIngredient(HAItems.RAW_CRAYFISH.get())
            .addIngredient(HAItems.UNI.get())
            .addIngredient(CommonTags.Items.CROPS_TOMATO)
            .unlockedByAnyIngredient(
                HAItems.RAW_TENTACLE.get(),
                HAItems.RAW_CRAYFISH.get(),
                HAItems.UNI.get()
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.CHOWDER.get(), 1, 300, 1.0f, Items.BOWL
        )
            .addIngredient(HAItems.RAW_CRAB.get())
            .addIngredient(ModItems.MILK_BOTTLE.get())
            .addIngredient(Tags.Items.CROPS_POTATO)
            .addIngredient(CommonTags.Items.CROPS_TOMATO)
            .unlockedByAnyIngredient(
                HAItems.RAW_CRAB.get()
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.CRAB_CAKE.get(), 1, 300, 1.0f
        )
            .addIngredient(HAItems.COOKED_CRAB.get())
            .addIngredient(Tags.Items.CROPS_WHEAT)
            .addIngredient(Tags.Items.EGGS)
            .unlockedByAnyIngredient(
                HAItems.COOKED_CRAB.get()
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.CRAB_RANGOON.get(), 1, 200, 1.0f
        )
            .addIngredient(HAItems.RAW_CRAB.get())
            .addIngredient(ModItems.MILK_BOTTLE.get())
            .addIngredient(CommonTags.Items.FOODS_DOUGH_WHEAT)
            .addIngredient(CommonTags.Items.CROPS_ONION)
            .unlockedByAnyIngredient(
                HAItems.RAW_CRAB.get()
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.TUNA_CASSEROLE.get(), 1, 400, 1.0f, Items.BOWL
        )
            .addIngredient(HAItems.TUNA.get())
            .addIngredient(ModItems.RAW_PASTA.get())
            .addIngredient(Tags.Items.EGGS)
            .unlockedByAnyIngredient(
                HAItems.TUNA.get()
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.MASGOUF.get(), 1, 400, 1.0f
        )
            .addIngredient(HAItems.CARP.get())
            .addIngredient(CommonTags.Items.CROPS_ONION)
            .addIngredient(CommonTags.Items.CROPS_TOMATO)
            .unlockedByAnyIngredient(
                HAItems.CARP.get()
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.FISHERMANS_SOUP.get(), 1, 200, 1.0f, Items.BOWL
        )
            .addIngredient(HAItems.RAW_FISH_MEAT.get())
            .addIngredient(CommonTags.Items.CROPS_ONION)
            .addIngredient(CommonTags.Items.CROPS_TOMATO)
            .unlockedByAnyIngredient(
                HAItems.RAW_FISH_MEAT.get()
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.EEL_NOODLES.get(), 1, 400, 1.0f, Items.BOWL
        )
            .addIngredient(HAItems.MORAY_EEL.get())
            .addIngredient(ModItems.RAW_PASTA.get())
            .addIngredient(Items.SUGAR)
            .unlockedByAnyIngredient(
                HAItems.MORAY_EEL.get()
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.FISH_KEBAB.get(), 1, 200, 1.0f, Items.STICK
        )
            .addIngredient(HAItems.RAW_FISH_MEAT.get())
            .addIngredient(ModItems.COD_SLICE.get())
            .addIngredient(ModItems.SALMON_SLICE.get())
            .unlockedByAnyIngredient(
                HAItems.RAW_FISH_MEAT.get()
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.FISH_N_CHIPS.get(), 1, 200, 1.0f, Items.STICK
        )
            .addIngredient(HAItems.RAW_FISH_MEAT.get())
            .addIngredient(Tags.Items.CROPS_POTATO)
            .unlockedByAnyIngredient(
                HAItems.RAW_FISH_MEAT.get()
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.SHRIMP_FRIED_RICE.get(), 1, 200, 1.0f, Items.BOWL
        )
            .addIngredient(HAItems.RAW_SHRIMP.get())
            .addIngredient(CommonTags.Items.CROPS_ONION)
            .addIngredient(Tags.Items.EGGS)
            .addIngredient(CommonTags.Items.CROPS_RICE)
            .addIngredient(Tags.Items.CROPS_CARROT)
            .unlockedByAnyIngredient(
                HAItems.RAW_SHRIMP.get()
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)
    }

    private fun cuttingRecipes(exporter: RecipeOutput) {
        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HAItems.ANGLERFISH.get()),
            CuttingRecipes.KNIVES,
            HAItems.RAW_FISH_MEAT.get(), 2
        )
            .addResultWithChance(HAItems.GLOWSLIME.get(), 0.75f)
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HAItems.DRAGONFISH.get()),
            CuttingRecipes.KNIVES,
            HAItems.RAW_FISH_MEAT.get(), 2
        )
            .addResultWithChance(HAItems.GLOWSLIME.get(), 0.75f)
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HAItems.FLASHLIGHT_FISH.get()),
            CuttingRecipes.KNIVES,
            HAItems.RAW_FISH_MEAT.get(), 2
        )
            .addResultWithChance(HAItems.GLOWSLIME.get(), 0.75f)
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HAItems.BARRELEYE.get()),
            CuttingRecipes.KNIVES,
            HAItems.RAW_FISH_MEAT.get(), 2
        )
            .addResultWithChance(HAItems.GLOWSLIME.get(), 0.75f)
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HAItems.HAGFISH.get()),
            CuttingRecipes.KNIVES,
            HAItems.RAW_FISH_MEAT.get(), 2
        )
            .addResultWithChance(HAItems.HAGSLIME.get(), 1.0f)
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HAItems.CARP.get()),
            CuttingRecipes.KNIVES,
            HAItems.RAW_FISH_MEAT.get(), 2
        )
            .addResultWithChance(HDItems.CARP_ROE.get(), 0.5f)
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HAItems.TUNA.get()),
            CuttingRecipes.KNIVES,
            HAItems.RAW_FISH_STEAK.get(), 2
        )
            .addResultWithChance(HDItems.FISH_GELATIN.get(), 0.66f)
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HAItems.STINGRAY.get()),
            CuttingRecipes.KNIVES,
            HDItems.RAY_WING.get(), 2
        )
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(Items.COD),
            CuttingRecipes.KNIVES,
            ModItems.COD_SLICE.get(), 2
        )
            .addResult(Items.BONE_MEAL)
            .addResultWithChance(HDItems.COD_ROE.get(), 0.5f)
            .save(
                exporter,
                ResourceLocation.fromNamespaceAndPath(
                    "farmersdelight",
                    "cutting/cod"
                )
            )

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(Items.SALMON),
            CuttingRecipes.KNIVES,
            ModItems.SALMON_SLICE.get(), 2
        )
            .addResult(Items.BONE_MEAL)
            .addResultWithChance(HDItems.SALMON_ROE.get(), 0.5f)
            .save(
                exporter,
                ResourceLocation.fromNamespaceAndPath(
                    "farmersdelight",
                    "cutting/salmon"
                )
            )

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(Items.TROPICAL_FISH),
            CuttingRecipes.KNIVES,
            HAItems.RAW_FISH_MEAT.get(), 2
        )
            .addResult(Items.BONE_MEAL)
            .addResultWithChance(HDItems.TROPICAL_FISH_ROE.get(), 0.5f)
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(Items.PUFFERFISH),
            CuttingRecipes.KNIVES,
            HDItems.PUFFERFISH_SLICE.get(), 2
        )
            .addResult(Items.BONE_MEAL)
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HAItems.BLOWFISH.get()),
            CuttingRecipes.KNIVES,
            HDItems.PUFFERFISH_SLICE.get(), 2
        )
            .addResult(Items.BONE_MEAL)
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HDItems.SALTED_COD.get()),
            CuttingRecipes.KNIVES,
            HDItems.SALTED_COD_SLICE.get(), 2
        )
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HDItems.SALTED_SALMON.get()),
            CuttingRecipes.KNIVES,
            HDItems.SALTED_SALMON_SLICE.get(), 2
        )
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HAItems.RAW_FISH_STEAK.get()),
            CuttingRecipes.KNIVES,
            HAItems.RAW_FISH_MEAT.get(), 2
        )
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(Items.SPONGE),
            CuttingRecipes.KNIVES,
            HAItems.TUBE_SPONGE.get(), 4
        )
            .save(exporter)
    }

    private fun knifeRecipes(exporter: RecipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, HDItems.CORAL_KNIFE.get())
            .pattern("C")
            .pattern("S")
            .define('C', HAItems.CORAL_CHUNK.get())
            .define('S', Items.STICK)
            .unlockedBy(
                "coral_chunk",
                has(HAItems.CORAL_CHUNK.get())
            )
            .save(exporter)

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, HDItems.SHARK_TOOTH_KNIFE.get())
            .pattern("C")
            .pattern("S")
            .define('C', HAItems.SHARK_TOOTH.get())
            .define('S', Items.STICK)
            .unlockedBy(
                "shark_tooth",
                has(HAItems.SHARK_TOOTH.get())
            )
            .save(exporter)
    }

    private fun craftingRecipes(exporter: RecipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, HDItems.FISHERMANS_PIE.get())
            .pattern(" C ")
            .pattern("FEF")
            .pattern(" P ")
            .define('P', ModItems.PIE_CRUST.get())
            .define('F', HAItems.COOKED_FISH_STEAK.get())
            .define('C', HAItems.COOKED_CRAB.get())
            .define('E', Tags.Items.EGGS)
            .unlockedBy(
                "has_cooked_fish_steak",
                has(HAItems.COOKED_FISH_STEAK.get())
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(
            RecipeCategory.MISC, HDItems.BRINE_BOTTLE.get(), 4
        )
            .requires(HAPlatformItems.BRINE_BUCKET.get())
            .requires(Items.GLASS_BOTTLE, 4)
            .unlockedBy(
                "has_brine_bucket",
                has(HAPlatformItems.BRINE_BUCKET.get())
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(
            RecipeCategory.MISC,
            HDItems.TUNA_ROLL.get(),
            2
        )
            .requires(HAItems.TUNA.get())
            .requires(ModItems.COOKED_RICE.get())
            .unlockedBy(
                "has_tuna",
                has(HAItems.TUNA.get())
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(
            RecipeCategory.MISC,
            HDItems.CAVIAR_TOAST.get(),
            2
        )
            .requires(HDItemTags.FOODS_ROE_CURED)
            .requires(Tags.Items.FOODS_BREAD)
            .unlockedBy(
                "has_roe",
                has(HDItemTags.FOODS_ROE_CURED)
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(
            RecipeCategory.MISC,
            HDItems.TUNA_SALAD.get()
        )
            .requires(HAItems.TUNA.get())
            .requires(Items.BOWL)
            .requires(CommonTags.Items.CROPS_TOMATO)
            .requires(CommonTags.Items.FOODS_LEAFY_GREEN)
            .requires(Tags.Items.EGGS)
            .unlockedBy(
                "has_tuna",
                has(HAItems.TUNA.get())
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(
            RecipeCategory.MISC,
            HDItems.TUNA_NACHOS.get()
        )
            .requires(HAItems.TUNA.get())
            .requires(Items.BOWL)
            .requires(CommonTags.Items.CROPS_TOMATO)
            .requires(CommonTags.Items.CROPS_CABBAGE)
            .requires(Tags.Items.FOODS_BREAD)
            .unlockedBy(
                "has_tuna",
                has(HAItems.TUNA.get())
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(
            RecipeCategory.MISC,
            HDItems.JELLIED_CARP.get()
        )
            .requires(HAItems.CARP.get())
            .requires(HDItems.FISH_GELATIN.get(), 2)
            .requires(Tags.Items.CROPS_CARROT)
            .unlockedBy(
                "has_carp",
                has(HAItems.CARP.get())
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, HDItems.TUNA_SANDWICH.get())
            .requires(HAItems.TUNA.get())
            .requires(Tags.Items.FOODS_BREAD)
            .requires(CommonTags.Items.CROPS_TOMATO)
            .requires(CommonTags.Items.FOODS_LEAFY_GREEN)
            .unlockedBy(
                "has_tuna",
                has(HAItems.TUNA.get())
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, HDItems.PICKLED_HERRING.get())
            .requires(HAItems.HERRING.get())
            .requires(HDItems.BRINE_BOTTLE.get())
            .unlockedBy(
                "has_herring",
                has(HAItems.HERRING.get())
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, HDItems.PICKLED_BULL_KELP.get())
            .requires(HAItems.BULL_KELP.get())
            .requires(HDItems.BRINE_BOTTLE.get())
            .unlockedBy(
                "has_bull_kelp",
                has(HAItems.BULL_KELP.get())
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, HDItems.SALTED_COD.get())
            .requires(Items.COD)
            .requires(HDItems.SALT.get(), 2)
            .unlockedBy(
                "has_salt",
                has(HDItems.SALT.get())
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, HDItems.SALTED_COD_SLICE.get())
            .requires(ModItems.COD_SLICE.get())
            .requires(HDItems.SALT.get(), 2)
            .unlockedBy(
                "has_salt",
                has(HDItems.SALT.get())
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, HDItems.SALTED_SALMON.get())
            .requires(Items.SALMON)
            .requires(HDItems.SALT.get(), 2)
            .unlockedBy(
                "has_salt",
                has(HDItems.SALT.get())
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, HDItems.SALTED_SALMON_SLICE.get())
            .requires(ModItems.SALMON_SLICE.get())
            .requires(HDItems.SALT.get(), 2)
            .unlockedBy(
                "has_salt",
                has(HDItems.SALT.get())
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, HDItems.SALTED_PUFFERFISH_SLICE.get())
            .requires(HDItems.PUFFERFISH_SLICE.get())
            .requires(HDItems.SALT.get(), 2)
            .unlockedBy(
                "has_salt",
                has(HDItems.SALT.get())
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, HDItems.SALTED_RAY_WING.get())
            .requires(HDItems.RAY_WING.get())
            .requires(HDItems.SALT.get(), 2)
            .unlockedBy(
                "has_salt",
                has(HDItems.SALT.get())
            )
            .save(exporter)
    }

    private fun smeltingRecipes(exporter: RecipeOutput) {
        offerSmeltingRecipes(
            exporter,
            HDItems.RAY_WING.get(),
            HDItems.COOKED_RAY_WING.get(),
            0.35f
        )
        offerSmeltingRecipes(
            exporter,
            HDItems.PUFFERFISH_SLICE.get(),
            HDItems.COOKED_PUFFERFISH_SLICE.get(),
            0.35f
        )
    }

    private fun offerSmeltingRecipes(exporter: RecipeOutput, input: Item, output: Item, experience: Float) {
        simpleCookingRecipe(
            exporter,
            "smelting",
            RecipeSerializer.SMELTING_RECIPE,
            ::SmeltingRecipe,
            200,
            input,
            output,
            experience
        )
        simpleCookingRecipe(
            exporter,
            "smoking",
            RecipeSerializer.SMOKING_RECIPE,
            ::SmokingRecipe,
            100,
            input,
            output,
            experience
        )
        simpleCookingRecipe(
            exporter,
            "campfire_cooking",
            RecipeSerializer.CAMPFIRE_COOKING_RECIPE,
            ::CampfireCookingRecipe,
            600,
            input,
            output,
            experience
        )
    }
}
