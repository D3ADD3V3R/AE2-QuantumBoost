package de.d3add3v3r.ae2quantumboost.items;

import de.d3add3v3r.ae2quantumboost.Constants;
import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static de.d3add3v3r.ae2quantumboost.blocks.Blocks.QUARZ_GROWTH_CHAMBER_PROZESSOR_BLOCK;

public class Items {
    public static final DeferredRegister.Items ITEMS_REGISTER = DeferredRegister.createItems(Constants.MOD_ID);

    // BlockItems
    public static final DeferredItem<BlockItem> QUARZ_GROWTH_CHAMBER_PROZESSOR_BLOCK_ITEM = ITEMS_REGISTER.registerSimpleBlockItem("quarz_growth_chamber_prozessor_block", QUARZ_GROWTH_CHAMBER_PROZESSOR_BLOCK);

}
