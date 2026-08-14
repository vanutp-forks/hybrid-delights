package dev.hybridlabs.delights.data.server

import dev.hybridlabs.delights.HybridDelights.MOD_ID
import dev.hybridlabs.delights.items.HDItems
import dev.hybridlabs.delights.tags.HDItemTags
import net.minecraft.core.HolderLookup
import net.minecraft.data.PackOutput
import net.minecraft.data.tags.ItemTagsProvider
import net.minecraft.tags.ItemTags
import net.minecraft.world.level.block.Block
import net.neoforged.neoforge.common.Tags
import net.neoforged.neoforge.common.data.ExistingFileHelper
import java.util.concurrent.CompletableFuture

class HDItemTagsProvider(
    output: PackOutput,
    lookupProvider: CompletableFuture<HolderLookup.Provider>,
    blockTags: CompletableFuture<TagLookup<Block>>,
    existingFileHelper: ExistingFileHelper?,
) :
    ItemTagsProvider(output, lookupProvider, blockTags, MOD_ID, existingFileHelper) {

    override fun addTags(arg: HolderLookup.Provider) {
        tag(HDItemTags.FOODS_ROE)
            .addTag(HDItemTags.FOODS_ROE_RAW)
            .addTag(HDItemTags.FOODS_ROE_CURED)
        tag(Tags.Items.FOODS)
            .addTag(HDItemTags.FOODS_ROE)

        tag(HDItemTags.KNIFE).add(
            HDItems.CORAL_KNIFE.get(),
            HDItems.SHARK_TOOTH_KNIFE.get(),
        )
        tag(HDItemTags.FOODS_ROE_RAW).add(
            HDItems.COD_ROE.get(),
            HDItems.SALMON_ROE.get(),
            HDItems.TROPICAL_FISH_ROE.get(),
            HDItems.CARP_ROE.get(),
        )
        tag(HDItemTags.FOODS_ROE_CURED).add(
            HDItems.CURED_COD_ROE.get(),
            HDItems.CURED_SALMON_ROE.get(),
            HDItems.CURED_TROPICAL_FISH_ROE.get(),
            HDItems.CURED_CARP_ROE.get(),
        )
        tag(ItemTags.CAT_FOOD).add(
            HDItems.RAY_WING.get()
        )
        tag(Tags.Items.FOODS_RAW_FISH).add(
            HDItems.RAY_WING.get(),
            HDItems.PUFFERFISH_SLICE.get(),
        )
        tag(Tags.Items.FOODS_COOKED_FISH).add(
            HDItems.COOKED_RAY_WING.get(),
            HDItems.COOKED_PUFFERFISH_SLICE.get(),
        )
    }
}
