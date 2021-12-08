package com.cs673.practicemanagementreports.revenueagingreportservice.controller;

import com.cs673.practicemanagementreports.revenueagingreportservice.beans.RevenueAgingReportList;
import com.cs673.practicemanagementreports.revenueagingreportservice.service.RevenueAgingReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/practice-management-reports/revenue-aging-report")
public class RevenueAgingReportController {

    @Autowired
    private RevenueAgingReportService service;

    @GetMapping("/{start-date}/{end-date}")
    public RevenueAgingReportList generateRevenueAgingReport(@PathVariable("start-date") String startDate, @PathVariable("end-date") String endDate){
        if(null!=startDate && !startDate.isEmpty() && null!=endDate && !endDate.isEmpty())
            return service.generateRevenueAgingReport(startDate, endDate);
        else
            throw new IllegalArgumentException("Invalid date.");
    }
}
