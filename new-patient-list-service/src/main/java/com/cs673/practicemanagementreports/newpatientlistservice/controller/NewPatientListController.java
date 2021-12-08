package com.cs673.practicemanagementreports.newpatientlistservice.controller;

import com.cs673.practicemanagementreports.newpatientlistservice.beans.NewPatientList;
import com.cs673.practicemanagementreports.newpatientlistservice.service.NewPatientListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/practice-management-reports/new-patient-list")
public class NewPatientListController {

    @Autowired
    private NewPatientListService service;

    @GetMapping("/{date}")
    public ResponseEntity<NewPatientList> generateNewPatientsList(@PathVariable("date") String date){
        if(null!=date && !date.isEmpty())
            return new ResponseEntity<NewPatientList>(service.generateNewPatientList(date), HttpStatus.OK);
        else
            return new ResponseEntity<NewPatientList>(HttpStatus.BAD_REQUEST);
    }
}
