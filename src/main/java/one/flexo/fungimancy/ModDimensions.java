/*******************************************************************************
 * Copyright (C) 2017 Jeremy Grozavescu <oneandonlyflexo>
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 * 
 * This file is part of Fungimancy, which is open source:
 * https://github.com/oneandonlyflexo/fungimancy
 ******************************************************************************/
package one.flexo.fungimancy;

public class ModDimensions {

//	public static DimensionType blankDimensionType;

	public static void init() {
		registerDimensionTypes();
		registerDimensions();
	}

	private static void registerDimensionTypes() {
//		pastDimensionType = DimensionType.register(BlankProject.MODID, ModIdType.DIMENSION.getSuffix("blank"), Config.pastDimensionId, WorldProviderSurface.class, false);
	}

	private static void registerDimensions() {
//		DimensionManager.registerDimension(Config.pastDimensionId, pastDimensionType);
	}
}
