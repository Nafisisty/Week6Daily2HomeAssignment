package com.example.week6daily2homeassignment.model;

public class TimeSheet {
    private int payRate;
    private boolean isHourly;
    private int workedHours;

    public TimeSheet(int payRate, boolean isHourly, int workedHours) {
        this.payRate = payRate;
        this.isHourly = isHourly;
        this.workedHours = workedHours;
    }

    public int getPayRate() {
        return payRate;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }

    public boolean isHourly() {
        return isHourly;
    }

    public void setHourly(boolean hourly) {
        isHourly = hourly;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }
}
