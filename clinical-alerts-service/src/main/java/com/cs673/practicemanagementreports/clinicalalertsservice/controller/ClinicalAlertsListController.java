package com.cs673.practicemanagementreports.clinicalalertsservice.controller;

import com.cs673.practicemanagementreports.clinicalalertsservice.beans.ClinicalAlertsList;
import com.cs673.practicemanagementreports.clinicalalertsservice.service.ClinicalAlertsListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/practice-management-reports/clinical-alerts")
public class ClinicalAlertsListController {

    @Autowired
    private ClinicalAlertsListService service;

    @GetMapping("/{date}")
    public ResponseEntity<ClinicalAlertsList> generateClinicalAlertsList(@PathVariable("date") String date){
        if(null!=date && !date.isEmpty())
            return new ResponseEntity<ClinicalAlertsList>(service.generateClinicalAlertsList(date), HttpStatus.OK);
        else
            return new ResponseEntity<ClinicalAlertsList>(HttpStatus.BAD_REQUEST);
    }
}
