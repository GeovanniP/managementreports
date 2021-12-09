package com.cs673.practicemanagementreports.missedappointmentsservice.controller;

import com.cs673.practicemanagementreports.missedappointmentsservice.beans.AppointmentList;
import com.cs673.practicemanagementreports.missedappointmentsservice.service.MissedAppointmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/practice-management-reports/missed-appointments")
public class MissedAppointmentsController {

    @Autowired
    private MissedAppointmentsService service;

    @GetMapping("/{date}")
    public ResponseEntity<AppointmentList> generateMissedAppointmentsReport(@PathVariable("date") String date){
        if(null!=date && !date.isEmpty())
            return new ResponseEntity<>(service.generateMissedAppointments(date), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
