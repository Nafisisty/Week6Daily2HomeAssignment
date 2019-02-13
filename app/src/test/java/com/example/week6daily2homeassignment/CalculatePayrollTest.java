package com.example.week6daily2homeassignment;

import com.example.week6daily2homeassignment.model.Address;
import com.example.week6daily2homeassignment.model.CalculatePayroll;
import com.example.week6daily2homeassignment.model.Employee;
import com.example.week6daily2homeassignment.model.Name;
import com.example.week6daily2homeassignment.model.TimeSheet;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class CalculatePayrollTest {

    CalculatePayroll calculatePayroll;

    @Mock
    Employee employee;
    Name name;
    Address address;
    TimeSheet timeSheet;


    @Before
    public void setup() {
        name = new Name("Kazi Nafis", "", "Ishtiaque", "");
        address = new Address("2824 PLENNIE LN", "LAWRENCEVILLE", "GA", "30044", "USA");
        timeSheet = new TimeSheet(27, true, 80);
        employee = new Employee(name, address, timeSheet);
        calculatePayroll = new CalculatePayroll(employee);
    }


    @Test
    public void testCalculatePayroll(){

        assertEquals("Kazi Nafis Ishtiaque", calculatePayroll.getCalculatedPayroll().get("name"));
        assertEquals("2824 PLENNIE LN, LAWRENCEVILLE, GA - 30044, USA", calculatePayroll.getCalculatedPayroll().get("address"));
        assertEquals("2160", calculatePayroll.getCalculatedPayroll().get("pay"));

    }
}
