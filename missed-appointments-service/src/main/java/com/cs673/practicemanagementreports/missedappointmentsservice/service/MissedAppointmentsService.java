package com.cs673.practicemanagementreports.missedappointmentsservice.service;

import com.cs673.practicemanagementreports.missedappointmentsservice.beans.AppointmentList;
import com.cs673.practicemanagementreports.missedappointmentsservice.beans.MissedAppointmentBean;
import com.cs673.practicemanagementreports.missedappointmentsservice.beans.MissedAppointmentsList;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.sql.Date;
import java.sql.Time;
import java.util.Arrays;

@Service
public class MissedAppointmentsService {

    public MissedAppointmentsService() {
    }

    public AppointmentList generateMissedAppointments(String date){

        String appointmentSchedulingURI = "https://api-response-service.herokuapp.com/practice-management-reports/missed-appointments-sample-data";
        RestTemplate restTemplate = new RestTemplate();
        //Calling Appointment Scheduling Team's API to retrieve appointment details on the given date.
        AppointmentList appointments =  restTemplate.getForObject(appointmentSchedulingURI, AppointmentList.class);

        /*return new MissedAppointmentsList(Arrays.asList(new MissedAppointmentBean("Patient A", "P101", new Date(0), new Time(0)),
                new MissedAppointmentBean("Patient B", "P102", new Date(0), new Time(0)),
                new MissedAppointmentBean("Patient C", "P103", new Date(0), new Time(0)),
                new MissedAppointmentBean("Patient D", "P104", new Date(0), new Time(0)),
                new MissedAppointmentBean("Patient E", "P105", new Date(0), new Time(0))));*/
        return appointments;
    }
}
