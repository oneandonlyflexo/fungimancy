package one.flexo.fungimancy;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import one.flexo.fungimancy.proxy.CommonProxy;

@Mod(modid = Fungimancy.MODID, name = Fungimancy.MODNAME, version = Fungimancy.VERSION, useMetadata = true)
public class Fungimancy
{
    public static final String MODID = "fungimancy";
    public static final String MODNAME = "Fungimancy";
    public static final String VERSION = "0.0";
    
 // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="one.flexo.fungimancy.proxy.ClientProxy", serverSide="one.flexo.fungimancy.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static Fungimancy instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
