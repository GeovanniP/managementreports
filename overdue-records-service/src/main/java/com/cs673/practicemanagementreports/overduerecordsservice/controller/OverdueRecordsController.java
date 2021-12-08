package com.cs673.practicemanagementreports.overduerecordsservice.controller;

import com.cs673.practicemanagementreports.overduerecordsservice.beans.OverdueRecordsList;
import com.cs673.practicemanagementreports.overduerecordsservice.service.OverdueRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/practice-management-reports/overdue-records")
public class OverdueRecordsController {

    @Autowired
    private OverdueRecordsService service;

    @GetMapping("")
    public ResponseEntity<OverdueRecordsList> generateOverdueRecordsReport(){
        OverdueRecordsList recordsList = service.generateOverdueRecordsReport();
        return new ResponseEntity<OverdueRecordsList>(recordsList, HttpStatus.OK);
    }
}
