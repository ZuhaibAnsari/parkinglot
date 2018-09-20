package com.hussi.commands;

import com.hussi.domain.ParkingLot;
import com.hussi.enums.CommandsEnum;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class SlotNumbersForCarsWithColorCommand implements CommandStrategy
{
    @Override
    public void execute(String[] parameters) {
        System.out.println("execute "+CommandsEnum.SLOT_NUMBERS_FOR_CARS_WITH_COLOUR.getValue()+ " command");

        String color = parameters[1];
        System.out.println("Searching for slot number of cars with color "+color);

        ParkingLot parkingLot = ParkingLot.getParkingLotInstance();

        System.out.print("Slot numbers for cars with color "+color+" are =>");

        if(Arrays.stream(parkingLot.getParkingSlots())
                .filter(parkingSlot -> parkingSlot.isOccupied())
                .filter(parkingSlot -> parkingSlot.getCar().getColor().equalsIgnoreCase(color))
                .count() > 0)
        {
            Arrays.stream(parkingLot.getParkingSlots())
                    .filter(parkingSlot -> parkingSlot.isOccupied())
                    .filter(parkingSlot -> parkingSlot.getCar().getColor().equalsIgnoreCase(color))
                    .forEach(parkingSlot ->
                    {
                        System.out.print(parkingSlot.getSlot_index() + " , ");
                    });
            System.out.println();
        }
        else
        {
            System.out.println("No Cars parked with color =>"+color);
        }
    }
}
