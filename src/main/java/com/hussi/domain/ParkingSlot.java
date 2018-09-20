package com.hussi.domain;

public class ParkingSlot
{
    private long id;
    private int slot_index;
    private boolean isFree;
    private boolean isOccupied;
    private Car car;

    @Override
    public String toString() {
        String result = "";
        result += "id==>>" + id;
        result += " : slot_index==>>" + slot_index;
        result += " : isFree==>>" + isFree;
        result += " : isOccupied==>>" + isOccupied;
        return result;
    }

    public ParkingSlot(long id, int slot_index)
    {
        this.setId(id);
        this.setSlot_index(slot_index);
        this.isFree = true;
        this.isOccupied = false;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSlot_index() {
        return slot_index;
    }

    public void setSlot_index(int slot_index) {
        this.slot_index = slot_index;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
