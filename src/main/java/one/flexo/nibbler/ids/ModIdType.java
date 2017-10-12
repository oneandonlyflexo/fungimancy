package one.flexo.nibbler.ids;

import one.flexo.fungimancy.Fungimancy;

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
		return Fungimancy.MODID + getSuffix(name);
	}

	public String getSuffix(String name) {
		return this.delimiter + name;
	}
}
