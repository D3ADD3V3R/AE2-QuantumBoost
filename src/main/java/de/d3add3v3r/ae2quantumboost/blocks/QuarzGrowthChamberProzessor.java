package de.d3add3v3r.ae2quantumboost.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;


public class QuarzGrowthChamberProzessor extends Block {

    public static final BooleanProperty CRAFTING = BlockStateProperties.CRAFTING;

    public QuarzGrowthChamberProzessor(ResourceLocation registryName) {
        this(Properties.of()
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.GRAVEL)
                .lightLevel(state -> 7));
    }

    public QuarzGrowthChamberProzessor(Properties properties) {
        super(properties);

        this.registerDefaultState(stateDefinition.any()
                .setValue(CRAFTING, false)
        );
    }

    @Override
    protected @NotNull InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (!level.isClientSide) {
            // Server-Seite: z. B. Zustand ändern oder GUI öffnen
            player.sendSystemMessage(Component.literal("Block wurde rechtsgeklickt!"));

            // Beispiel: Blockzustand ändern (wenn du ein Property wie CRAFTING hast)
            level.setBlock(pos, state.cycle(CRAFTING), 3);
        }

        return InteractionResult.SUCCESS; // Rückgabe wichtig!
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        // this is where the properties are actually added to the state
        pBuilder.add(CRAFTING);
    }

}
