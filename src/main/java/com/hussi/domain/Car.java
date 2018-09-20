package com.hussi.domain;

public class Car {
    private long id;
    private Customer Customer;
    private String registrationNumber;
    private String color;

    public Car(String registrationNumber, String color) {
        this.registrationNumber = registrationNumber;
        this.color = color;
    }

    @Override
    public String toString()
    {
        String toString = "";
        //Value can be null?? may be use terniary to return blank when null
        toString += "car registrationNumber =>"+registrationNumber;
        toString += " : car color =>"+color;
        return toString;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public com.hussi.domain.Customer getCustomer() {
        return Customer;
    }

    public void setCustomer(com.hussi.domain.Customer customer) {
        Customer = customer;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
