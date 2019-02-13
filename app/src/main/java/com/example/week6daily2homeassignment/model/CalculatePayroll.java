package com.example.week6daily2homeassignment.model;

import java.util.HashMap;

public class CalculatePayroll {
    private int totalPay;
    private Employee employee;
    private String employeeName;
    private String employeeAddress;
    public HashMap<String, String> calculatedPayroll = new HashMap<>();

    public CalculatePayroll(Employee employee) {
        this.employee = employee;
        setTotalPay();
        setEmployeeName();
        setEmployeeAddress();
    }

    public void setTotalPay() {
        if(employee.getTimeSheet().isHourly()) {
            this.totalPay = employee.getTimeSheet().getPayRate() * employee.getTimeSheet().getWorkedHours();
        } else {
            this.totalPay = employee.getTimeSheet().getPayRate() * 40;
        }
        calculatedPayroll.put("pay", "" + totalPay);
    }

    public void setEmployeeName() {
        this.employeeName = employee.getName().getFirstName() + " " + employee.getName().getLastName();
        calculatedPayroll.put("name", employeeName);
    }


    public void setEmployeeAddress() {
        this.employeeAddress = employee.getAddress().getStreetAddress() + ", " +employee.getAddress().getCity()
                + ", " + employee.getAddress().getState() + " - " + employee.getAddress().getPostalCode()
                + ", " + employee.getAddress().getCountry();
        calculatedPayroll.put("address", employeeAddress);
    }

    public HashMap<String, String> getCalculatedPayroll() {
        return calculatedPayroll;
    }
}
