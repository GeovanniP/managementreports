package com.cs673.practicemanagementreports.payerbasedreportservice.service;

import com.cs673.practicemanagementreports.payerbasedreportservice.beans.PayerBasedReportList;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class PayerBasedReportService {

    public PayerBasedReportService() {
    }

    public PayerBasedReportList generatePayerBasedReport(String date){
        String billingURI = "https://api-response-service.herokuapp.com/practice-management-reports/payer-based-report-sample-data";
        RestTemplate restTemplate = new RestTemplate();
        //Calling Billing Team's API to retrieve payer based details on the given date.
        PayerBasedReportList payerBasedReportList =  restTemplate.getForObject(billingURI, PayerBasedReportList.class);
        return payerBasedReportList;
    }
}
