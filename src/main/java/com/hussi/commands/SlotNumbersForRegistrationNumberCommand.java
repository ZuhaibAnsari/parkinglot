package com.hussi.commands;

import com.hussi.domain.ParkingLot;
import com.hussi.enums.CommandsEnum;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class SlotNumbersForRegistrationNumberCommand implements CommandStrategy
{
    @Override
    public void execute(String[] parameters)
    {
        System.out.println("execute "+CommandsEnum.SLOT_NUMBER_FOR_REGISTRATION_NUMBER.getValue()+" command");

        String registrationNumber = parameters[1];
        System.out.println("Searching Slot for car with registration number :"+registrationNumber);

        ParkingLot parkingLot = ParkingLot.getParkingLotInstance();

        System.out.print("Slot index for car with registration number "+registrationNumber + " is =>");
        if(Arrays.stream(parkingLot.getParkingSlots())
                .filter(parkingSlot -> parkingSlot.isOccupied())
                .filter(parkingSlot -> parkingSlot.getCar().getRegistrationNumber().equalsIgnoreCase(registrationNumber))
                .count() > 0)
        {
            Arrays.stream(parkingLot.getParkingSlots())
                    .filter(parkingSlot -> parkingSlot.isOccupied())
                    .filter(parkingSlot -> parkingSlot.getCar().getRegistrationNumber().equalsIgnoreCase(registrationNumber))
                    .forEach(parkingSlot ->
                    {
                        System.out.println(parkingSlot.getSlot_index()+" ,\t");
                    });
            System.out.println();
        }
        else
        {
            System.out.println("No Car parked with registration number =>"+registrationNumber);
        }
    }
}
