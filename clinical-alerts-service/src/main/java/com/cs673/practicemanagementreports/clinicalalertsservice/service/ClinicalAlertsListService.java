package com.cs673.practicemanagementreports.clinicalalertsservice.service;

import com.cs673.practicemanagementreports.clinicalalertsservice.beans.ClinicalAlertsBean;
import com.cs673.practicemanagementreports.clinicalalertsservice.beans.ClinicalAlertsList;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class ClinicalAlertsListService {

    public ClinicalAlertsListService() {
    }

    public ClinicalAlertsList generateClinicalAlertsList(String date){

        String clinicalAlertsURI = "https://api-response-service.herokuapp.com/practice-management-reports/clinical-alerts-sample-data";
        RestTemplate restTemplate = new RestTemplate();
        //Calling Patient Team's API to retrieve clinical alert details on the given date.
        ClinicalAlertsList alerts =  restTemplate.getForObject(clinicalAlertsURI, ClinicalAlertsList.class);

/*        return new ClinicalAlertsList(Arrays.asList(new ClinicalAlertsBean("Patient A", "P101", "Alert", "Desc"),
                new ClinicalAlertsBean("Patient B", "P102", "Alert", "Desc"),
                new ClinicalAlertsBean("Patient C", "P103", "Alert", "Desc"),
                new ClinicalAlertsBean("Patient D", "P104", "Alert", "Desc"),
                new ClinicalAlertsBean("Patient E", "P105", "Alert", "Desc")));*/
        return alerts;
    }
}
