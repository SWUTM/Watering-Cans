package net.swutm.wateringcans.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.core.BlockPos;

public class IronWateringCansRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Player player) {
		if ((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == Blocks.FARMLAND
				|| (world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == Blocks.FARMLAND
				|| (world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.FARMLAND
				|| (world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == Blocks.FARMLAND
				|| (world.getBlockState(new BlockPos(x + 1, y - 1, z + 1))).getBlock() == Blocks.FARMLAND
				|| (world.getBlockState(new BlockPos(x + 1, y - 1, z - 1))).getBlock() == Blocks.FARMLAND
				|| (world.getBlockState(new BlockPos(x - 1, y - 1, z + 1))).getBlock() == Blocks.FARMLAND
				|| (world.getBlockState(new BlockPos(x - 1, y - 1, z - 1))).getBlock() == Blocks.FARMLAND
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.FARMLAND) {
			if (world instanceof Level _level) {
				BlockPos _bp = new BlockPos(x + 1, y, z);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp)
						|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof Level _level) {
				BlockPos _bp = new BlockPos(x - 1, y, z);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp)
						|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof Level _level) {
				BlockPos _bp = new BlockPos(x, y, z + 1);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp)
						|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof Level _level) {
				BlockPos _bp = new BlockPos(x, y, z - 1);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp)
						|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof Level _level) {
				BlockPos _bp = new BlockPos(x + 1, y, z + 1);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp)
						|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof Level _level) {
				BlockPos _bp = new BlockPos(x + 1, y, z - 1);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp)
						|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof Level _level) {
				BlockPos _bp = new BlockPos(x - 1, y, z + 1);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp)
						|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof Level _level) {
				BlockPos _bp = new BlockPos(x - 1, y, z - 1);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp)
						|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof Level _level) {
				BlockPos _bp = new BlockPos(x, y, z);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp)
						|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
		}
	}
}
