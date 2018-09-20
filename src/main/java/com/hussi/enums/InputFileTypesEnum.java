package com.hussi.enums;

public enum InputFileTypesEnum {
	TXT("txt"),
	JSON("json"),
	CSV("csv"),
	EXCEL("xlsx"),
	XML("xml");

	private String value;

	public String getValue() {
		return value;
	}

	private InputFileTypesEnum(String value) {
		this.value = value;
	}
}
