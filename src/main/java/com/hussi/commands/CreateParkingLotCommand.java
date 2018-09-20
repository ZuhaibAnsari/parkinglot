package com.hussi.commands;

import com.hussi.domain.ParkingLot;
import com.hussi.enums.CommandsEnum;
import org.springframework.stereotype.Component;

@Component
public class CreateParkingLotCommand implements CommandStrategy
{
    @Override
    public void execute(String[] parameters)
    {
        int parkingLotCapacity = Integer.parseInt(parameters[1]);
        System.out.println("executing "+ CommandsEnum.CREATE_PARKING_LOT.getValue()+" Command");
        System.out.println("Creating Parking Lot");
        ParkingLot.getParkingLotInstance(parkingLotCapacity);
        System.out.println("Parking Lot Created");
    }
}
