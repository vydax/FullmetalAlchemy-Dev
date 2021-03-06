package mods.fullmetalalchemy.crafting;

import mods.fullmetalalchemy.core.FullmetalAlchemy;
import mods.fullmetalalchemy.item.FMAItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;

public class FMACraftingHandler implements ICraftingHandler {

	@Override
	public void onCrafting(EntityPlayer player, ItemStack item,
			IInventory craftMatrix) {
		for(int i = 0; i < craftMatrix.getSizeInventory(); i++) {
			
			if(craftMatrix.getStackInSlot(i) != null) {
				ItemStack j = craftMatrix.getStackInSlot(i);
				
				if(j.getItem() != null && j.getItem() == mods.fullmetalalchemy.item.FMAItems.ReconstructionCircle) {
					ItemStack k = new ItemStack(FMAItems.ReconstructionCircle, 2);
					player.inventory.setInventorySlotContents(0, k);
				}
			}
		}

	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {
		// TODO Auto-generated method stub

	}

}
