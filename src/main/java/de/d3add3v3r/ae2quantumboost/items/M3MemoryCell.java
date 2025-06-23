package de.d3add3v3r.ae2quantumboost.items;

import appeng.api.config.Actionable;
import appeng.api.networking.security.IActionSource;
import appeng.api.stacks.AEKey;
import appeng.api.stacks.KeyCounter;
import appeng.api.storage.cells.CellState;
import appeng.api.storage.cells.ICellHandler;
import appeng.api.storage.cells.ISaveProvider;
import appeng.api.storage.cells.StorageCell;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class M3MemoryCell extends Item implements ICellHandler, StorageCell {
    private static final List<DeferredItem<Item>> registeredItemVariants = new ArrayList<DeferredItem<Item>>();
    private final int capacity;
    private final int maxItemTypes;

    public M3MemoryCell(Item.Properties properties, int capacity, int maxItemTypes) {
        super(properties.stacksTo(1));
        this.capacity = capacity;
        this.maxItemTypes = maxItemTypes;
    }

    public static int registerM3MemoryDriveVariants(DeferredRegister.Items itemRegister) {
        registeredItemVariants.add(itemRegister.register("m3_memory_drive_1_1", () -> new M3MemoryCell(new Item.Properties(), 512, 63)));

        return registeredItemVariants.size();
    }

    public static void registerM3MemoryDriveVariantsToTab(CreativeModeTab.Output tabOutput) {

        for (DeferredItem<Item> variant : registeredItemVariants) {
            tabOutput.accept(variant);
        }

    }

    @Override
    public boolean isCell(ItemStack is) {
        return true;
    }

    @Override
    public @Nullable StorageCell getCellInventory(ItemStack is, @Nullable ISaveProvider host) {
        return null;
    }

    @Override
    public CellState getStatus() {
        return CellState.EMPTY;
    }

    @Override
    public double getIdleDrain() {
        return 10;
    }

    @Override
    public boolean canFitInsideCell() {
        return false;
    }

    @Override
    public void persist() {

    }

    @Override
    public boolean isPreferredStorageFor(AEKey what, IActionSource source) {
        return StorageCell.super.isPreferredStorageFor(what, source);
    }

    @Override
    public long insert(AEKey what, long amount, Actionable mode, IActionSource source) {
        return StorageCell.super.insert(what, amount, mode, source);
    }

    @Override
    public long extract(AEKey what, long amount, Actionable mode, IActionSource source) {
        return StorageCell.super.extract(what, amount, mode, source);
    }

    @Override
    public void getAvailableStacks(KeyCounter out) {
        StorageCell.super.getAvailableStacks(out);
    }

    @Override
    public Component getDescription() {
        return null;
    }

    @Override
    public KeyCounter getAvailableStacks() {
        return StorageCell.super.getAvailableStacks();
    }
}
