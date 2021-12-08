package com.cs673.practicemanagementreports.revenueagingreportservice.service;

import com.cs673.practicemanagementreports.revenueagingreportservice.beans.RevenueAgingReportBean;
import com.cs673.practicemanagementreports.revenueagingreportservice.beans.RevenueAgingReportList;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.sql.Date;
import java.sql.Time;
import java.util.Arrays;

@Service
public class RevenueAgingReportService {

    public RevenueAgingReportService() {
    }

    public RevenueAgingReportList generateRevenueAgingReport(String startDate, String endDate){

        String billingURI = "http://localhost:8089/practice-management-reports/revenue-aging-report-sample-data";
        RestTemplate restTemplate = new RestTemplate();
        //Calling Billing Team's API to retrieve revenue aging report details on the given dates.
        RevenueAgingReportList revenueAgingReportList =  restTemplate.getForObject(billingURI, RevenueAgingReportList.class);

        /*return new RevenueAgingReportList(Arrays.asList(new RevenueAgingReportBean("Patient A", "P101", "0", new Date(0)),
                new RevenueAgingReportBean("Patient B", "P102", "0", new Date(0)),
                new RevenueAgingReportBean("Patient C", "P103", "0", new Date(0)),
                new RevenueAgingReportBean("Patient D", "P104", "0", new Date(0)),
                new RevenueAgingReportBean("Patient E", "P105", "0", new Date(0))));*/
        return revenueAgingReportList;
    }
}
