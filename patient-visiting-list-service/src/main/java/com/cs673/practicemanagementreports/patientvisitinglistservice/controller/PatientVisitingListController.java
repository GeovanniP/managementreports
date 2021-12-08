package com.cs673.practicemanagementreports.patientvisitinglistservice.controller;

import com.cs673.practicemanagementreports.patientvisitinglistservice.beans.PatientVisitingList;
import com.cs673.practicemanagementreports.patientvisitinglistservice.service.PatientVisitingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/practice-management-reports/patient-visiting-list")
public class PatientVisitingListController {

    @Autowired
    private PatientVisitingListService service;

    @GetMapping("/{date}")
    public ResponseEntity<PatientVisitingList> generatePatientVisitingListReport(@PathVariable("date") String date){
        if(null!=date && !date.isEmpty())
            return new ResponseEntity<PatientVisitingList>(service.generatePatientVisitingList(date), HttpStatus.OK);
        else
            return new ResponseEntity<PatientVisitingList>(HttpStatus.BAD_REQUEST);
    }
}
