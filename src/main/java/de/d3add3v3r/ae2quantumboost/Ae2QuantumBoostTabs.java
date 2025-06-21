package de.d3add3v3r.ae2quantumboost;

import de.d3add3v3r.ae2quantumboost.blocks.Blocks;
import de.d3add3v3r.ae2quantumboost.items.Items;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static net.minecraft.core.registries.Registries.CREATIVE_MODE_TAB;

public class Ae2QuantumBoostTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(CREATIVE_MODE_TAB, Constants.MOD_ID);

    //CREATIVE_MODE_TABS is a DeferredRegister<CreativeModeTab>
    public static final Supplier<CreativeModeTab> CREATIVE_TAB = CREATIVE_MODE_TABS.register("example", () -> CreativeModeTab.builder()
            //Set the title of the tab. Don't forget to add a translation!
            .title(Component.translatable("itemGroup." + Constants.MOD_ID))
            //Set the icon of the tab.
            .icon(() -> new ItemStack(Blocks.QUARTZ_GROWTH_CHAMBER_PROZESSOR_BLOCK))
            //Add your items to the tab.
            .displayItems((params, output) -> {
                output.accept(Blocks.QUARTZ_GROWTH_CHAMBER_PROZESSOR_BLOCK.get());
                output.accept(Items.QUARTZ_GROWTH_CORE_ITEM.get());
            })
            .build()
    );
}
