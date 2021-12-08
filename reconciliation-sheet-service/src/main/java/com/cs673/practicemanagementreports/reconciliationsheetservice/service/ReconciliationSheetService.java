package com.cs673.practicemanagementreports.reconciliationsheetservice.service;

import com.cs673.practicemanagementreports.reconciliationsheetservice.beans.AppointmentList;
import com.cs673.practicemanagementreports.reconciliationsheetservice.beans.BillingBean;
import com.cs673.practicemanagementreports.reconciliationsheetservice.beans.ReconciliationSheetBean;
import com.cs673.practicemanagementreports.reconciliationsheetservice.beans.ReconciliationSheetList;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ReconciliationSheetService {

    public ReconciliationSheetService() {
    }

    public ReconciliationSheetList generateReconciliationSheet(String date){

        String appointmentSchedulingURI = "http://localhost:8089/practice-management-reports/appointments-sample-data";
        RestTemplate restTemplate = new RestTemplate();
        //Calling Appointment Scheduling Team's API to retrieve appointment details on the given date.
        AppointmentList appointments =  restTemplate.getForObject(appointmentSchedulingURI, AppointmentList.class);
        String uri = "https://dry-ocean-01268.herokuapp.com/practicemanagements?doctorId=2222&patientId=1111";
        String output = restTemplate.getForObject(uri, String.class);
        System.out.println(output);
        //for(int i=0; i<output.length;i++){
            //System.out.println(output[i].toString());
        //}

        List<ReconciliationSheetBean> list = new ArrayList<ReconciliationSheetBean>();
        for(int i=0;i<appointments.getAppointmentBeanList().size();i++){
            ReconciliationSheetBean bean = new ReconciliationSheetBean();
            bean.setPatientID(appointments.getAppointmentBeanList().get(i).getPatientID());
            bean.setPatientName(appointments.getAppointmentBeanList().get(i).getPatientName());
            bean.setDateOfAppointment(appointments.getAppointmentBeanList().get(i).getDateOfAppointment());
            bean.setTimeOfAppointment(appointments.getAppointmentBeanList().get(i).getTimeOfAppointment());
            bean.setAppointmentStatus(appointments.getAppointmentBeanList().get(i).getAppointmentStatus());
            bean.setDoctorID(appointments.getAppointmentBeanList().get(i).getDoctorID());
            bean.setSpecialitySeen(appointments.getAppointmentBeanList().get(i).getSpecialitySeen());
            String billingURI = "http://localhost:8089/practice-management-reports/billing-sample-data";
            //Calling billing team's API to get billing details for a given patient id.
            BillingBean billingBean = restTemplate.getForObject(billingURI, BillingBean.class);
            bean.setCoPay(billingBean.getCoPay());
            bean.setPaymentAmount(billingBean.getPaymentAmount());
            bean.setAmountCollected(billingBean.getAmountCollected());

            list.add(bean);
        }
        return new ReconciliationSheetList(list);
    }
}
