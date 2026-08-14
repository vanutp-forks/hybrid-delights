package dev.hybridlabs.delights.data

import dev.hybridlabs.delights.data.client.HDLanguageProvider
import dev.hybridlabs.delights.data.client.HDModelProvider
import dev.hybridlabs.delights.data.server.HDBlockTagsProvider
import dev.hybridlabs.delights.data.server.HDItemTagsProvider
import dev.hybridlabs.delights.data.server.HDRecipeProvider
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.common.EventBusSubscriber
import net.neoforged.neoforge.data.event.GatherDataEvent

@EventBusSubscriber
object HDDatagen {
    @SubscribeEvent
    fun gatherData(event: GatherDataEvent) {
        val generator = event.generator
        val output = generator.packOutput
        val lookupProvider = event.lookupProvider
        val existingFileHelper = event.existingFileHelper

        val blockTagsProvider = generator.addProvider(
            event.includeServer(),
            HDBlockTagsProvider(output, lookupProvider, existingFileHelper),
        )
        generator.addProvider(
            event.includeServer(),
            HDItemTagsProvider(output, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper),
        )
        generator.addProvider(
            event.includeServer(),
            HDRecipeProvider(output, lookupProvider),
        )

        generator.addProvider(
            event.includeClient(),
            HDModelProvider(output, existingFileHelper),
        )
        generator.addProvider(
            event.includeClient(),
            HDLanguageProvider(output),
        )
    }
}
