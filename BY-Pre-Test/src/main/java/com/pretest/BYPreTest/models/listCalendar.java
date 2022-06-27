package com.pretest.BYPreTest.models;

import java.util.ArrayList;
import java.util.List;

public class listCalendar {
    public List<Calendar> listCalendars(){
        List<Calendar> calendars = new ArrayList<>();

        Calendar calendars1 = new Calendar();
        calendars1.setLocationID("STORE001");
        calendars1.setDay("ALL");
        calendars1.setCutOffTime("13:30");

        Calendar calendars2 = new Calendar();
        calendars2.setLocationID("STORE001");
        calendars2.setDay("ALL");
        calendars2.setCutOffTime("13:30");

        Calendar calendars3 = new Calendar();
        calendars3.setLocationID("STORE001");
        calendars3.setDay("ALL");
        calendars3.setCutOffTime("13:30");

        calendars.add(calendars1);
        calendars.add(calendars2);
        calendars.add(calendars3);

        return calendars;
    }

}
