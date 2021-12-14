package com.cs673.practicemanagementreports.apiresponseservice.service;

import com.cs673.practicemanagementreports.apiresponseservice.beans.*;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Time;
import java.util.Arrays;

@Service
public class ApiResponseService {

    public ApiResponseService() {
    }

    public AppointmentList getAppointments(){
        return new AppointmentList(Arrays.asList(new AppointmentBean("Patient A", "1", new Date(20001012), new Date(0), new Time(0), "checked-in", "D101", "Speciality 1"),
                new AppointmentBean("Patient B", "2", new Date(20040902), new Date(0), new Time(0), "checked-in", "D102", "Speciality 2"),
                new AppointmentBean("Patient C", "3", new Date(19920211), new Date(0), new Time(0), "missed", "D102", "Speciality 2"),
                new AppointmentBean("Patient D", "4", new Date(19981110), new Date(0), new Time(0), "checked-in", "D104", "Speciality 4"),
                new AppointmentBean("Patient E", "5", new Date(20101210), new Date(0), new Time(0), "new-patient", "D103", "Speciality 3")));
    }

    public BillingBean getBillingDetails() {
        return new BillingBean("0", "0", "0", "0");
    }

    public AppointmentList getMissedAppointments() {
        return new AppointmentList(Arrays.asList(new AppointmentBean("Patient A", "1", new Date(20001012), new Date(0), new Time(0), "missed", "D101", "Speciality 1"),
                new AppointmentBean("Patient B", "2", new Date(20040902), new Date(0), new Time(0), "missed", "D102", "Speciality 2"),
                new AppointmentBean("Patient C", "3", new Date(19920211), new Date(0), new Time(0), "missed", "D102", "Speciality 2"),
                new AppointmentBean("Patient D", "4", new Date(19981110), new Date(0), new Time(0), "missed", "D104", "Speciality 4"),
                new AppointmentBean("Patient E", "5", new Date(20101210), new Date(0), new Time(0), "missed", "D103", "Speciality 3")));
    }

    public RevenueAgingReportList getRevenueAgingDetails() {
        return new RevenueAgingReportList(Arrays.asList(new RevenueAgingReportBean("Patient A", "P101", "0", new Date(0)),
                new RevenueAgingReportBean("Patient B", "P102", "0", new Date(0)),
                new RevenueAgingReportBean("Patient C", "P103", "0", new Date(0)),
                new RevenueAgingReportBean("Patient D", "P104", "0", new Date(0))));
    }

    public ClinicalAlertsList getClinicalAlerts() {
        return new ClinicalAlertsList(Arrays.asList(new ClinicalAlertsBean("Patient A", "P101", "Alert", "Desc"),
                new ClinicalAlertsBean("Patient B", "P102", "Alert", "Desc"),
                new ClinicalAlertsBean("Patient C", "P103", "Alert", "Desc"),
                new ClinicalAlertsBean("Patient D", "P104", "Alert", "Desc"),
                new ClinicalAlertsBean("Patient E", "P105", "Alert", "Desc")));
    }

    public OverdueRecordsList getOverdueRecords(){
        return new OverdueRecordsList(Arrays.asList(new OverdueRecordsBean("Patient A", "P101", "0"),
                new OverdueRecordsBean("Patient B", "P102", "0"),
                new OverdueRecordsBean("Patient C", "P103", "0"),
                new OverdueRecordsBean("Patient D", "P104", "0"),
                new OverdueRecordsBean("Patient E", "P105", "0")));
    }

    public NewPatientList getNewPatientList(){
        return new NewPatientList(Arrays.asList(new NewPatientBean("Patient A", "P101", "Speciality 1", new Date(0), new Date(1), new Time(0), "Status", "0", "0", new Date(2)),
                new NewPatientBean("Patient B", "P102", "Speciality 1", new Date(0), new Date(1), new Time(0), "Status", "0", "0", new Date(2)),
                new NewPatientBean("Patient C", "P103", "Speciality 2", new Date(0), new Date(1), new Time(0), "Status", "0", "0", new Date(2)),
                new NewPatientBean("Patient D", "P104", "Speciality 1", new Date(0), new Date(1), new Time(0), "Status", "0", "0", new Date(2)),
                new NewPatientBean("Patient E", "P105", "Speciality 3", new Date(0), new Date(1), new Time(0), "Status", "0", "0", new Date(2))));
    }

    public PayerBasedReportList getPayerBasedReport(){
        return new PayerBasedReportList(Arrays.asList(new PayerBasedReportBean("Patient A", "P101", "0", "0", "0"),
                new PayerBasedReportBean("Patient B", "P102", "0", "0", "0"),
                new PayerBasedReportBean("Patient C", "P103", "0", "0", "0"),
                new PayerBasedReportBean("Patient D", "P104", "0", "0", "0"),
                new PayerBasedReportBean("Patient E", "P105", "0", "0", "0")));
    }

    public PatientVisitingList getPatientVisitingList(){
        return new PatientVisitingList(Arrays.asList(new PatientVisitingBean("Patient A", "P101", new Date(0), new Time(0), "Notes", "Medications"),
                new PatientVisitingBean("Patient B", "P102", new Date(0), new Time(0), "Notes", "Medications"),
                new PatientVisitingBean("Patient C", "P103", new Date(0), new Time(0), "Notes", "Medications"),
                new PatientVisitingBean("Patient D", "P104", new Date(0), new Time(0), "Notes", "Medications"),
                new PatientVisitingBean("Patient E", "P105", new Date(0), new Time(0), "Notes", "Medications")));
    }

}
