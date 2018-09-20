package com.hussi.commands;

import com.hussi.domain.Car;
import com.hussi.domain.ParkingLot;
import com.hussi.domain.ParkingSlot;
import com.hussi.enums.CommandsEnum;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class LeaveCommand implements CommandStrategy
{
    @Override
    public void execute(String[] parameters)
    {
        System.out.println("execute "+ CommandsEnum.LEAVE.getValue() +" command");

        int indexToBeFree = Integer.parseInt(parameters[1])-1;

        ParkingLot parkingLot = ParkingLot.getParkingLotInstance();

        if(!parkingLot.isParkingLotEmpty())
        {
            System.out.println("Car Leaving from Parking slot "+(indexToBeFree+1));
            parkingLot.getParkingSlots()[indexToBeFree].setOccupied(false);
            parkingLot.getParkingSlots()[indexToBeFree].setFree(true);
            parkingLot.getParkingSlots()[indexToBeFree].setCar(null);
            parkingLot.moveVehicle();
            System.out.println("Parking slot "+(indexToBeFree+1)+ " is free now");
        }
        else
        {
            System.out.println("parking is totally empty already");
        }
    }
}
