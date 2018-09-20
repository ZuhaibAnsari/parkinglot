package com.hussi.commands;

import com.hussi.domain.Car;
import com.hussi.domain.ParkingLot;
import com.hussi.domain.ParkingSlot;
import com.hussi.enums.CommandsEnum;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Optional;

@Component
public class ParkCommand implements CommandStrategy
{
    @Override
    public void execute(String[] parameters)
    {
        System.out.println("execute "+ CommandsEnum.PARK.getValue() +" command");

        String registrationNumber = parameters[1];
        String color = parameters[2];

        Car car = new Car(registrationNumber,color);

        ParkingLot parkingLot = ParkingLot.getParkingLotInstance();

        if(parkingLot.isMoreParkingAvailable())
        {
            ParkingSlot firstEmptyParkingSlot = Arrays.stream(parkingLot.getParkingSlots())
                    .filter(parkingSlot -> parkingSlot.isFree())
                    .findFirst()
                    .get();
            System.out.println("parking car =>"+car +" at index "+firstEmptyParkingSlot.getSlot_index());
            firstEmptyParkingSlot.setFree(false);
            firstEmptyParkingSlot.setOccupied(true);
            firstEmptyParkingSlot.setCar(car);
            parkingLot.parkVehicle();
            System.out.println("parked car =>"+car +" at index "+firstEmptyParkingSlot.getSlot_index());
        }
        else
        {
            System.out.println("parking full");
        }
    }
}
