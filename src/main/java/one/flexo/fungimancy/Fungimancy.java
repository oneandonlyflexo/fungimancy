/*******************************************************************************
 * Copyright (C) 2017 Jeremy Grozavescu <oneandonlyflexo>
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 * 
 * This file is part of Fungimancy, which is open source:
 * https://github.com/oneandonlyflexo/fungimancy
 ******************************************************************************/
package one.flexo.fungimancy;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import one.flexo.fungimancy.proxy.CommonProxy;


/**
 * Fungimancy! This is an ambitious mod for someone as woefully ignorant as I.  Yet here we are.
 *
 * @author "oneandonlyflexo"
 */

@Mod(modid = ModInfo.modid,
name = ModInfo.name,
version = ModInfo.version,
useMetadata = true,
acceptedMinecraftVersions = "[1.12,1.12.2]",
acceptableRemoteVersions = "[0.1]")
public class  Fungimancy
{

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
