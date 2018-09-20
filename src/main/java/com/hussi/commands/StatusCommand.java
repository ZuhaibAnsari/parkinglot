package com.hussi.commands;

import com.hussi.domain.ParkingLot;
import com.hussi.enums.CommandsEnum;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class StatusCommand implements CommandStrategy
{
    @Override
    public void execute(String[] parameters)
    {
        System.out.println("execute "+ CommandsEnum.STATUS.getValue() +" command");

        ParkingLot parkingLot = ParkingLot.getParkingLotInstance();

        System.out.println("Free Parking Slots are =>");
        if(parkingLot.isParkingLotFull())
        {
            System.out.println("parking lot full , no free slot available");
        }
        else
        {
            // double condition , one dependency to be removed after requirement enhancements
            if(Arrays.stream(parkingLot.getParkingSlots())
                    .filter(parkingSlot -> parkingSlot.isFree())
                    .count() > 0 )
            {
                Arrays.stream(parkingLot.getParkingSlots())
                        .filter(parkingSlot -> parkingSlot.isFree())
                        .forEach(parkingSlot ->
                        {
                            System.out.print(parkingSlot.getSlot_index()+ " \t");
                        });
                System.out.println();
            }
            else
            {
                System.out.println("No Free Slots Available");
            }
        }
    }
}
