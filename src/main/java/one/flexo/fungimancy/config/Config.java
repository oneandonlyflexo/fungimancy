package one.flexo.fungimancy.config;

import org.apache.logging.log4j.Level;

import net.minecraftforge.common.config.Configuration;
import one.flexo.fungimancy.Fungimancy;
import one.flexo.fungimancy.proxy.CommonProxy;

public class Config {

	private static final String CATEGORY_GENERAL = "general";
	private static final String CATEGORY_DIMENSION = "dimensions"; 

	//public static String property = "defaultValue";

//	public static int blankDimensionId = -4000;

	public static void readConfig() {
		Configuration cfg = CommonProxy.config;
		try {
			cfg.load();
			initGeneralConfig(cfg);
		} catch (Exception e1) {
			Fungimancy.logger.log(Level.ERROR, "Problem loading config file!", e1);
		} finally {
			if (cfg.hasChanged()) {
				cfg.save();
			}
		}
	}

	private static void initGeneralConfig(Configuration cfg) {
		cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration");
		//property = cfg.getString("property", CATEGORY_GENERAL, property, "Set to value to set the config property");

		String category = CATEGORY_DIMENSION;
		cfg.addCustomCategoryComment(category, "Dimensions configuration");
//		pastDimensionId = cfg.getInt("pastDimensionId", category, pastDimensionId, -9000, 9000, "The id for the dimension used when visiting the past");
	}

}
