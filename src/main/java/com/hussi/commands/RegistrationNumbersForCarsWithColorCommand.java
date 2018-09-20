package com.hussi.commands;

import com.hussi.domain.ParkingLot;
import com.hussi.enums.CommandsEnum;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class RegistrationNumbersForCarsWithColorCommand implements CommandStrategy {
    @Override
    public void execute(String[] parameters) {
        System.out.println("execute " + CommandsEnum.REGISTRATION_NUMBERS_FOR_CARS_WITH_COLOUR.getValue() + " command");

        String color = parameters[1];
        System.out.println("Searching for Registration Numbers of Cars with color =>" + color);

        ParkingLot parkingLot = ParkingLot.getParkingLotInstance();

        System.out.print("RegistrationNumbers for cars with color =>" + color + " are =>");
        int carCounter = 0;
        if (Arrays.stream(parkingLot.getParkingSlots())
                .filter(parkingSlot -> parkingSlot.isOccupied())
                .filter(parkingSlot -> parkingSlot.getCar().getColor().equalsIgnoreCase(color))
                .count() > 0) {
            Arrays.stream(parkingLot.getParkingSlots())
                    .filter(parkingSlot -> parkingSlot.isOccupied())
                    .filter(parkingSlot -> parkingSlot.getCar().getColor().equalsIgnoreCase(color))
                    .forEach(parkingSlot ->
                    {
                        System.out.print(parkingSlot.getCar().getRegistrationNumber() + " ,\t");
                    });
            System.out.println();
        } else {
            System.out.println("no cars parked with color =>" + color);
        }

    }
}
