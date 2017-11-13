/*******************************************************************************
 * Copyright (C) 2017 Jeremy Grozavescu <oneandonlyflexo>
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 * 
 * This file is part of Fungimancy, which is open source:
 * https://github.com/oneandonlyflexo/fungimancy
 ******************************************************************************/
package one.flexo.fungimancy.util;

import one.flexo.fungimancy.ModInfo;

public enum ModIdType {

	DEFAULT(":"),
	UNLOCALIZED_NAME("."),
	DIMENSION("_"),

	;

	ModIdType(String delimiter) {
		this.delimiter = delimiter;
	}

	private String delimiter;

	public String getId(String name) {
		return ModInfo.modid + getSuffix(name);
	}

	public String getSuffix(String name) {
		return this.delimiter + name;
	}
}
