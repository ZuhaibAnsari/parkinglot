package com.hussi.domain;

import java.math.BigDecimal;

public class ParkingTicket
{
    private long id;
    private Car car;
    private Customer customer;
    private long start_time;
    private long end_time;
    private BigDecimal parkingFare;

    public ParkingTicket(long parkingFare, String entry_time, String exit_time) {

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public long getStart_time() {
        return start_time;
    }

    public void setStart_time(long start_time) {
        this.start_time = start_time;
    }

    public long getEnd_time() {
        return end_time;
    }

    public void setEnd_time(long end_time) {
        this.end_time = end_time;
    }

    public BigDecimal getParkingFare() {
        return parkingFare;
    }

    public void setParkingFare(BigDecimal parkingFare) {
        this.parkingFare = parkingFare;
    }
}
