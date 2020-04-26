package volsraphel.mod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import volsraphel.mod.util.Ref;
import volsraphel.proxy.ClientProxy;

@Mod(modid = Ref.MODID, name = Ref.NAME, version = Ref.VERSION)
public class Main {
	
	//Who knows what this does
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Ref.CLIENT, serverSide = Ref.COMMON)
	public static ClientProxy proxy;
	
	
	//EventHandlers
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}
	
	
}
