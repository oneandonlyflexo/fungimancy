/*******************************************************************************
 * Copyright (C) 2017 Jeremy Grozavescu <oneandonlyflexo>
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 * 
 * This file is part of Fungimancy, which is open source:
 * https://github.com/oneandonlyflexo/fungimancy
 ******************************************************************************/
package one.flexo.fungimancy;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

//	@GameRegistry.ObjectHolder("blankproject:blankblock")
//	public static BlankBlock blankBlock;

	@SideOnly(Side.CLIENT)
	public static void initModels() {
//		blankBlock.initModel();
	}

	@SideOnly(Side.CLIENT)
	public static void initItemModels() {

	}
}
