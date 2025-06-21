package de.d3add3v3r.ae2quantumboost.blocks;

import de.d3add3v3r.ae2quantumboost.Constants;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Blocks {
    public static final DeferredRegister.Blocks BLOCKS_REGISTER = DeferredRegister.createBlocks(Constants.MOD_ID);

    public static final DeferredBlock<QuartzGrowthChamberProzessor> QUARTZ_GROWTH_CHAMBER_PROZESSOR_BLOCK = BLOCKS_REGISTER.register("quartz_growth_chamber_prozessor_block", QuartzGrowthChamberProzessor::new);

}
