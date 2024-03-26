package de.d3add3v3r.ae2quantumboost;

import com.mojang.logging.LogUtils;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Ae2QuantumBoostMain.MODID)
public class Ae2QuantumBoostMain
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "ae2quantumboost";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace


    public Ae2QuantumBoostMain()
    {

    }

}

