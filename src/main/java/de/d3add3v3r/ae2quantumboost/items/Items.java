package de.d3add3v3r.ae2quantumboost.items;

import de.d3add3v3r.ae2quantumboost.Constants;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static de.d3add3v3r.ae2quantumboost.blocks.Blocks.QUARTZ_GROWTH_CHAMBER_PROZESSOR_BLOCK;
import static de.d3add3v3r.ae2quantumboost.blocks.Blocks.QUARTZ_LIQUIFIER_BLOCK;

public class Items {
    public static final DeferredRegister.Items ITEMS_REGISTER = DeferredRegister.createItems(Constants.MOD_ID);

    // BlockItems
    public static final DeferredItem<BlockItem> QUARZ_GROWTH_CHAMBER_PROZESSOR_BLOCK_ITEM = ITEMS_REGISTER.registerSimpleBlockItem("blockitem.quartz_growth_chamber_prozessor_block", QUARTZ_GROWTH_CHAMBER_PROZESSOR_BLOCK);
    public static final DeferredItem<BlockItem> QUARTZ_LIQUIFIER_BLOCK_ITEM = ITEMS_REGISTER.registerSimpleBlockItem("blockitem.quartz_liquifier_block", QUARTZ_LIQUIFIER_BLOCK);

    // Empty Items
    public static final DeferredItem<Item> QUARTZ_GROWTH_CORE_ITEM = ITEMS_REGISTER.registerSimpleItem("quartz_growth_core_item");

    public static final int M3_MEMORY_CELL_VARIANT_COUNT = M3MemoryCell.registerM3MemoryDriveVariants(ITEMS_REGISTER);
}
