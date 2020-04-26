package volsraphel.mod.util.handlers;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import volsraphel.mod.Main;
import volsraphel.mod.init.ModItems;

@Mod.EventBusSubscriber
public class RegistryHandler {
	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> e)
	{
		for (Item item : ModItems.ITEMS) {
			e.getRegistry().register(item);
		}
	}
	
	@SubscribeEvent
	public void registerModels(ModelRegistryEvent e)
	{
		for(Item item : ModItems.ITEMS)	
		{
			Main.proxy.registerModel(item, 0);
		}
	}
}
