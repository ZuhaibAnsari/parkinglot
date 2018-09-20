package com.hussi.enums;

public enum CommandsEnum
{

    CREATE_PARKING_LOT("create_parking_lot"),
    PARK("park"),
    LEAVE("leave"),
    STATUS("status"),
    REGISTRATION_NUMBERS_FOR_CARS_WITH_COLOUR(  "registration_numbers_for_cars_with_colour"),
    SLOT_NUMBERS_FOR_CARS_WITH_COLOUR("slot_numbers_for_cars_with_colour"),
    SLOT_NUMBER_FOR_REGISTRATION_NUMBER("slot_number_for_registration_number");
//Same here more logical name like command and getCommand
    private String value;

    public String getValue() {
        return value;
    }

    private CommandsEnum(String value) {
        this.value = value;
    }
}
