package com.cs673.practicemanagementreports.payerbasedreportservice.controller;

import com.cs673.practicemanagementreports.payerbasedreportservice.beans.PayerBasedReportList;
import com.cs673.practicemanagementreports.payerbasedreportservice.service.PayerBasedReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/practice-management-reports/payer-based-report")
public class PayerBasedReportController {

    @Autowired
    private PayerBasedReportService service;

    @GetMapping("/{date}")
    public ResponseEntity<PayerBasedReportList> generatePayerBasedReport(@PathVariable("date") String date){
        if(null!=date && !date.isEmpty())
            return new ResponseEntity<PayerBasedReportList>(service.generatePayerBasedReport(date), HttpStatus.OK);
        else
            return new ResponseEntity<PayerBasedReportList>(HttpStatus.BAD_REQUEST);
    }
}
