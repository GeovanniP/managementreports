package com.cs673.practicemanagementreports.newpatientlistservice.service;

import com.cs673.practicemanagementreports.newpatientlistservice.beans.NewPatientBean;
import com.cs673.practicemanagementreports.newpatientlistservice.beans.NewPatientList;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.sql.Date;
import java.sql.Time;
import java.util.Arrays;

@Service
public class NewPatientListService {

    public NewPatientListService() {
    }

    public NewPatientList generateNewPatientList(String date){
        String appointmentSchedulingURI = "https://api-response-service.herokuapp.com/practice-management-reports/new-patient-list-sample-data";
        RestTemplate restTemplate = new RestTemplate();
        //Calling Appointment Scheduling Team's API to retrieve appointment details on the given date.
        NewPatientList newPatientList =  restTemplate.getForObject(appointmentSchedulingURI, NewPatientList.class);
        return newPatientList;
    }
}
