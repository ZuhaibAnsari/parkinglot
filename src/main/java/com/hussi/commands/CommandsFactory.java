package com.hussi.commands;

import com.hussi.enums.CommandsEnum;

public class CommandsFactory {
    private static final CommandStrategy CREATE_PARKING_LOT_COMMAND = new CreateParkingLotCommand();
    private static final CommandStrategy PARK_COMMAND = new ParkCommand();
    private static final CommandStrategy LEAVE_COMMAND = new LeaveCommand();
    private static final CommandStrategy STATUS_COMMAND = new StatusCommand();
    private static final CommandStrategy REGISTRATION_NUMBERS_FOR_CARS_WITH_COLOR_COMMAND = new RegistrationNumbersForCarsWithColorCommand();
    private static final CommandStrategy SLOT_NUMBERS_FOR_CARS_WITH_COLOUR_COMMAND = new SlotNumbersForCarsWithColorCommand();
    private static final CommandStrategy SLOT_NUMBER_FOR_REGISTRATION_NUMBER_COMMAND = new SlotNumbersForRegistrationNumberCommand();

    public static CommandStrategy getCommandExecutor(CommandsEnum commandsEnum) {
        switch (commandsEnum) {
            case CREATE_PARKING_LOT:
                return CREATE_PARKING_LOT_COMMAND;
            case PARK:
                return PARK_COMMAND;
            case LEAVE:
                return LEAVE_COMMAND;
            case STATUS:
                return STATUS_COMMAND;
            case REGISTRATION_NUMBERS_FOR_CARS_WITH_COLOUR:
                return REGISTRATION_NUMBERS_FOR_CARS_WITH_COLOR_COMMAND;
            case SLOT_NUMBERS_FOR_CARS_WITH_COLOUR:
                return SLOT_NUMBERS_FOR_CARS_WITH_COLOUR_COMMAND;
            case SLOT_NUMBER_FOR_REGISTRATION_NUMBER:
                return SLOT_NUMBER_FOR_REGISTRATION_NUMBER_COMMAND;
            default:
                return null;
        }
    }
}
