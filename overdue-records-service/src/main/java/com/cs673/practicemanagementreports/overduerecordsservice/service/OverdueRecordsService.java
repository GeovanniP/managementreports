package com.cs673.practicemanagementreports.overduerecordsservice.service;

import com.cs673.practicemanagementreports.overduerecordsservice.beans.OverdueRecordsBean;
import com.cs673.practicemanagementreports.overduerecordsservice.beans.OverdueRecordsList;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class OverdueRecordsService {

    public OverdueRecordsService() {
    }

    public OverdueRecordsList generateOverdueRecordsReport(){

        String billingURI = "https://api-response-service.herokuapp.com/practice-management-reports/overdue-records-sample-data";
        RestTemplate restTemplate = new RestTemplate();
        //Calling Billing Team's API to retrieve billing details on the given date.
        OverdueRecordsList overdueRecordsList =  restTemplate.getForObject(billingURI, OverdueRecordsList.class);
        return overdueRecordsList;
    }
}
