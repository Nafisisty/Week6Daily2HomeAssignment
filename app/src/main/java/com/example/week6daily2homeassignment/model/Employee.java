package com.example.week6daily2homeassignment.model;

public class Employee {
    private Name name;
    private Address address;
    private TimeSheet timeSheet;

    public Employee(Name name, Address address, TimeSheet timeSheet) {
        this.name = name;
        this.address = address;
        this.timeSheet = timeSheet;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public TimeSheet getTimeSheet() {
        return timeSheet;
    }

    public void setTimeSheet(TimeSheet timeSheet) {
        this.timeSheet = timeSheet;
    }
}
