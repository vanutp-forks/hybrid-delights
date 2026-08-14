package dev.hybridlabs.delights.tags

import dev.hybridlabs.delights.HybridDelights.MOD_ID
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.TagKey
import net.minecraft.world.item.Item

object HDItemTags {
    val KNIFE = createConventional("tools/knife")

    val FOODS_ROE = create("foods/roe")
    val FOODS_ROE_RAW = create("foods/roe/raw")
    val FOODS_ROE_CURED = create("foods/roe/cured")

    private fun create(id: String): TagKey<Item?> {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, id))
    }

    private fun createConventional(id: String): TagKey<Item?> {
		return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", id))
    }
}
