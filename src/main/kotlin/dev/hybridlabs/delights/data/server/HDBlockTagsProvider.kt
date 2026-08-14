package dev.hybridlabs.delights.data.server

import dev.hybridlabs.delights.HybridDelights.MOD_ID
import net.minecraft.core.HolderLookup
import net.minecraft.data.PackOutput
import net.neoforged.neoforge.common.data.BlockTagsProvider
import net.neoforged.neoforge.common.data.ExistingFileHelper
import java.util.concurrent.CompletableFuture

class HDBlockTagsProvider(
    output: PackOutput,
    lookupProvider: CompletableFuture<HolderLookup.Provider>,
    existingFileHelper: ExistingFileHelper?,
) :
    BlockTagsProvider(output, lookupProvider, MOD_ID, existingFileHelper) {

    override fun addTags(arg: HolderLookup.Provider) {
    }
}
