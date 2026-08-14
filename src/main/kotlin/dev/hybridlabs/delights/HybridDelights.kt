package dev.hybridlabs.delights

import com.mojang.logging.LogUtils
import dev.hybridlabs.delights.items.HDItemGroups
import dev.hybridlabs.delights.items.HDItems
import net.neoforged.fml.common.Mod
import org.slf4j.Logger
import thedarkcolour.kotlinforforge.neoforge.forge.MOD_BUS

@Mod(HybridDelights.MOD_ID)
object HybridDelights {
    const val MOD_ID: String = "hybrid_delights"
    const val MOD_NAME: String = "Hybrid Delights"
    val LOGGER: Logger = LogUtils.getLogger()

    init {
        HDItems.ITEMS.register(MOD_BUS)
        HDItemGroups.CREATIVE_MODE_TABS.register(MOD_BUS)
    }
}
