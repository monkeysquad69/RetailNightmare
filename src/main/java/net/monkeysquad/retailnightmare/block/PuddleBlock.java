
package net.monkeysquad.retailnightmare.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class PuddleBlock extends Block {
	public PuddleBlock() {
		super(BlockBehaviour.Properties.of()
				.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.pointed_dripstone.drip_water")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.pointed_dripstone.drip_water")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.pointed_dripstone.drip_water")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.pointed_dripstone.drip_water")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.pointed_dripstone.drip_water"))))
				.strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return box(0, 0, 0, 16, 0.1, 16);
	}
}
