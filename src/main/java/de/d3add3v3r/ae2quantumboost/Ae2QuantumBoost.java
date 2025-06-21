package de.d3add3v3r.ae2quantumboost;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

import static de.d3add3v3r.ae2quantumboost.Ae2QuantumBoostTabs.CREATIVE_MODE_TABS;
import static de.d3add3v3r.ae2quantumboost.blocks.Blocks.BLOCKS_REGISTER;
import static de.d3add3v3r.ae2quantumboost.items.Items.ITEMS_REGISTER;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Constants.MOD_ID)
public class Ae2QuantumBoost {
    // Define mod id in a common place for everything to reference

    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace


    public Ae2QuantumBoost(IEventBus modEventBus, ModContainer modContainer) {
        BLOCKS_REGISTER.register(modEventBus);
        ITEMS_REGISTER.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
    }

}

