package com.hussi.enums;

public enum CarColorsEnum
{

    BLACK("black"),
    WHITE("white"),
    RED("red");

    private String value;

    public String getValue() {
        return value;
    }

    private CarColorsEnum(String value) {
        this.value = value;
    }
}
