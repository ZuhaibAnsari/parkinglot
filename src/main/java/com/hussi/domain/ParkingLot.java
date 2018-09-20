package com.hussi.domain;

import java.util.Arrays;

public class ParkingLot {
    private static ParkingLot parkingLot;
    private final int parkingLotCapacity;
    private int parkingLotFreeCapacity;
    private int parkingLotEngagedCapacity;
    private ParkingSlot[] parkingSlots;


    /*public static void main(String[] args)
    {
        printAll();
    }

    private static void printAll()
    {
        Arrays.stream(getParkingLotInstance(5).parkingSlots).forEach(parkingSlot ->
        {
            System.out.println("===>>>"+parkingSlot);
        });
    }*/
    public static ParkingLot getParkingLotInstance(int parkingLotCapacity) {
        if (parkingLot == null) {
            parkingLot = new ParkingLot(parkingLotCapacity);
        }
        return parkingLot;
    }

    public static ParkingLot getParkingLotInstance() {
        return parkingLot;
    }

    private ParkingLot(int parkingLotCapacity) {
        this.parkingLotCapacity = parkingLotCapacity;
        this.parkingLotFreeCapacity = parkingLotCapacity;
        this.parkingLotEngagedCapacity = 0;
        this.parkingSlots = new ParkingSlot[this.parkingLotCapacity];
        for (int i = 0; i < this.parkingLotCapacity; i++) {
            this.parkingSlots[i] = new ParkingSlot(i, i+1);
        }
    }

    public ParkingSlot[] getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(ParkingSlot[] parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public int getParkingLotFreeCapacity() {
        return parkingLotFreeCapacity;
    }

    public void setParkingLotFreeCapacity(int parkingLotFreeCapacity) {
        this.parkingLotFreeCapacity = parkingLotFreeCapacity;
    }

    public int getParkingLotEngagedCapacity() {
        return parkingLotEngagedCapacity;
    }

    public void setParkingLotEngagedCapacity(int parkingLotEngagedCapacity) {
        this.parkingLotEngagedCapacity = parkingLotEngagedCapacity;
    }

    public void parkVehicle()
    {
        this.parkingLotFreeCapacity--;
        this.parkingLotEngagedCapacity++;
    }

    public void moveVehicle()
    {
        this.parkingLotFreeCapacity++;
        this.parkingLotEngagedCapacity--;
    }

    public boolean isMoreParkingAvailable()
    {
        return parkingLotEngagedCapacity<parkingLotCapacity;
    }

    public boolean isParkingLotEmpty()
    {
        return parkingLotFreeCapacity==parkingLotCapacity;
    }

    public boolean isParkingLotFull()
    {
        return parkingLotEngagedCapacity==parkingLotCapacity;
    }
}
