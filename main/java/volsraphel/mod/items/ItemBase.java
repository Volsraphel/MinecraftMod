package volsraphel.mod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import volsraphel.mod.init.ModItems;

public class ItemBase extends Item{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.REDSTONE);
		
		ModItems.ITEMS.add(this);
	}

}
