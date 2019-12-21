package alemax.trainsmod.items;

import alemax.trainsmod.init.ModItems;
import alemax.trainsmod.proxy.CommonProxy;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemTankWagonGreen extends Item {
	
	public ItemTankWagonGreen() {
		setRegistryName("item_tank_wagon_green");
		setUnlocalizedName("item_tank_wagon_green");
		setCreativeTab(CommonProxy.tab_trainsmod);
		
		ModItems.ITEMS.add(this);
	}
		
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand,
			EnumFacing facing, float hitX, float hitY, float hitZ) {
		if(!worldIn.isRemote) {
//			if((worldIn.getBlockState(pos).getBlock() instanceof ITrackBlock || worldIn.getTileEntity(pos) instanceof ITrack) && !(worldIn.getBlockState(pos).getBlock().getRegistryName().equals(ModBlocks.am_rail_curved.getRegistryName()))) {
//				EntityTankWagonGreen railcar = new EntityTankWagonGreen(worldIn, pos);
//				AxisAlignedBB railcarBox = railcar.getBoundBox().offset(railcar.posX, railcar.posY, railcar.posZ);
//				List<EntityRailcar> trains = worldIn.getEntitiesWithinAABB(EntityRailcar.class, new AxisAlignedBB(-30 + railcarBox.minX, -10 + railcarBox.minY, -30 + railcarBox.minZ, 30 + railcarBox.maxX, 10 + railcarBox.maxY, 30 + railcarBox.maxZ)); 
//				boolean intersect = false;
//				for(EntityRailcar e : trains) {
//					if(e.getEntityBoundingBox().intersects(railcarBox)) {
//						intersect = true;
//						break;
//					}
//				}
//				if(!intersect) {
//					worldIn.spawnEntity(railcar);
//				}
//			}
		}
			
		
		return EnumActionResult.SUCCESS;
	}
	
}
