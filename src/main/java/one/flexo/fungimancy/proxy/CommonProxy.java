/*******************************************************************************
 * Copyright (C) 2017 Jeremy Grozavescu <oneandonlyflexo>
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 * 
 * This file is part of Fungimancy, which is open source:
 * https://github.com/oneandonlyflexo/fungimancy
 ******************************************************************************/
package one.flexo.fungimancy.proxy;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import one.flexo.fungimancy.ModDimensions;
import one.flexo.fungimancy.config.Config;

@Mod.EventBusSubscriber
public abstract class CommonProxy {

//	public static BlankBlock blankBlock;
//	public static BlankItem blankItem;
	public static Configuration config;

	/**
	 * Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry
	 * @param event 
	 */
	public void preInit(FMLPreInitializationEvent e) {
		File directory = e.getModConfigurationDirectory();
		config = new Configuration(new File(directory.getPath(), "modtut.cfg"));
		Config.readConfig();

		ModDimensions.init();
	}

	/**
	 * Do your mod setup. Build whatever data structures you care about. Register recipes,
	 * send FMLInterModComms messages to other mods.
	 * @param e 
	 */
	public void init(FMLInitializationEvent e) {

	}

	/**
	 * Handle interaction with other mods, complete your setup based on this.
	 * @param e 
	 */
	public void postInit(FMLPostInitializationEvent e) {

	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
//		event.getRegistry().register(new BlankBlock());
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
//		event.getRegistry().register(new BlankItem());

//		registerSimpleItemBlock(event.getRegistry(), ModBlocks.blankBlock);
	}

	private static void registerSimpleItemBlock(IForgeRegistry<Item> registry, Block block) {
		registry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));	
	}

	// helper to determine whether the given player is in creative mode
	//  not necessary for most examples
	abstract public boolean playerIsInCreativeMode(EntityPlayer player);

	/**
	 * is this a dedicated server?
	 * @return true if this is a dedicated server, false otherwise
	 */
	abstract public boolean isDedicatedServer();
}
