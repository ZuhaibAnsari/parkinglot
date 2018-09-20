package com.hussi.enums;

public enum CarColorsEnum
{

    BLACK("black"),
    WHITE("white"),
    RED("red");

    //More logical name like color and getColor
    private String value;

    public String getValue() {
        return value;
    }

    private CarColorsEnum(String value) {
        this.value = value;
    }
}
