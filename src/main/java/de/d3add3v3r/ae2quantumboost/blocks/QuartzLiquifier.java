package de.d3add3v3r.ae2quantumboost.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

public class QuartzLiquifier extends Block {
    public static final BooleanProperty IS_CRAFTING = BlockStateProperties.CRAFTING;

    public QuartzLiquifier() {
        super(Properties.of()
                .destroyTime(2.0f)
                .explosionResistance(10.0f)
                .sound(SoundType.GRAVEL)
                .lightLevel(state -> 7));

        this.registerDefaultState(stateDefinition.any()
                .setValue(IS_CRAFTING, false)
        );
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        // this is where the properties are actually added to the state
        pBuilder.add(IS_CRAFTING);
    }
}
