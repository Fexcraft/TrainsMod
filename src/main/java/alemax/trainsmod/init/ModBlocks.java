package alemax.trainsmod.init;

import java.util.ArrayList;
import java.util.List;

import alemax.trainsmod.blocks.BlockAMRail;
import alemax.trainsmod.blocks.BlockAMRailCurved;
import alemax.trainsmod.blocks.BlockTrack;
import alemax.trainsmod.blocks.BlockTrackMarker;
import alemax.trainsmod.util.Reference;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

	
	@ObjectHolder("trainsmod:am_rail")
	public static final BlockAMRail am_rail = null;
	@ObjectHolder("trainsmod:am_rail_curved")
	public static final BlockAMRailCurved am_rail_curved = null;
	@ObjectHolder("trainsmod:track_marker")
	public static final BlockTrackMarker track_marker = null;
	//@ObjectHolder("trainsmod:track")
	//public static final BlockTrack track = null;
	@ObjectHolder("trainsmod:track_super")
	public static final BlockTrack track_super = null;
	@ObjectHolder("trainsmod:track_basic")
	public static final BlockTrack track_basic = null;
	
}
