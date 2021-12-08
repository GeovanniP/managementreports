package com.cs673.practicemanagementreports.apiresponseservice.controller;

import com.cs673.practicemanagementreports.apiresponseservice.beans.*;
import com.cs673.practicemanagementreports.apiresponseservice.service.ApiResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/practice-management-reports")
public class ApiResponseServiceController {

    @Autowired
    private ApiResponseService service;

    @GetMapping("/appointments-sample-data")
    public ResponseEntity<AppointmentList> getAppointments(){
        return new ResponseEntity<AppointmentList>(service.getAppointments(), HttpStatus.OK);
    }

    @GetMapping("/billing-sample-data")
    public ResponseEntity<BillingBean> getBillingDetails(){
        return new ResponseEntity<BillingBean>(service.getBillingDetails(), HttpStatus.OK);
    }

    @GetMapping("/missed-appointments-sample-data")
    public ResponseEntity<AppointmentList> getMissedAppointments(){
        return new ResponseEntity<AppointmentList>(service.getMissedAppointments(), HttpStatus.OK);
    }

    @GetMapping("/revenue-aging-report-sample-data")
    public ResponseEntity<RevenueAgingReportList> getRevenueAgingDetails(){
        return new ResponseEntity<RevenueAgingReportList>(service.getRevenueAgingDetails(), HttpStatus.OK);
    }

    @GetMapping("/clinical-alerts-sample-data")
    public ResponseEntity<ClinicalAlertsList> getClinicalAlerts(){
        return new ResponseEntity<ClinicalAlertsList>(service.getClinicalAlerts(), HttpStatus.OK);
    }

    @GetMapping("/overdue-records-sample-data")
    public ResponseEntity<OverdueRecordsList> getOverdueRecords(){
        return new ResponseEntity<OverdueRecordsList>(service.getOverdueRecords(), HttpStatus.OK);
    }

    @GetMapping("/new-patient-list-sample-data")
    public ResponseEntity<NewPatientList> getNewPatientList(){
        return new ResponseEntity<NewPatientList>(service.getNewPatientList(), HttpStatus.OK);
    }

    @GetMapping("/payer-based-report-sample-data")
    public ResponseEntity<PayerBasedReportList> getPayerBasedReport(){
        return new ResponseEntity<PayerBasedReportList>(service.getPayerBasedReport(), HttpStatus.OK);
    }

    @GetMapping("/patient-visiting-list-sample-data")
    public ResponseEntity<PatientVisitingList> getPatientVisitingList(){
        return new ResponseEntity<PatientVisitingList>(service.getPatientVisitingList(), HttpStatus.OK);
    }

}
