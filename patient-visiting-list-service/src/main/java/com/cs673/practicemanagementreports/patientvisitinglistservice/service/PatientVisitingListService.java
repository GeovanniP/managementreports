package com.cs673.practicemanagementreports.patientvisitinglistservice.service;

import com.cs673.practicemanagementreports.patientvisitinglistservice.beans.PatientVisitingBean;
import com.cs673.practicemanagementreports.patientvisitinglistservice.beans.PatientVisitingList;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.sql.Date;
import java.sql.Time;
import java.util.Arrays;

@Service
public class PatientVisitingListService {

    public PatientVisitingListService() {
    }

    public PatientVisitingList generatePatientVisitingList(String date){
        String appointmentSchedulingURI = "https://api-response-service.herokuapp.com/practice-management-reports/patient-visiting-list-sample-data";
        RestTemplate restTemplate = new RestTemplate();
        //Calling Appointment Scheduling Team's API to retrieve appointment details on the given date.
        PatientVisitingList appointments =  restTemplate.getForObject(appointmentSchedulingURI, PatientVisitingList.class);
        return appointments;
    }
}
