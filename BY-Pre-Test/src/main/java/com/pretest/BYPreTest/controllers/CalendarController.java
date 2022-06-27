package com.pretest.BYPreTest.controllers;

import com.pretest.BYPreTest.models.Calendar;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CalendarController {
    @RequestMapping(value = "findStoreAviability")
    public List<Calendar> compareCalendar(){

    }
}
