package com.cs673.practicemanagementreports.reconciliationsheetservice.service;

import com.cs673.practicemanagementreports.reconciliationsheetservice.beans.AppointmentList;
import com.cs673.practicemanagementreports.reconciliationsheetservice.beans.BillingBean;
import com.cs673.practicemanagementreports.reconciliationsheetservice.beans.ReconciliationSheetBean;
import com.cs673.practicemanagementreports.reconciliationsheetservice.beans.ReconciliationSheetList;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.sql.Date;
import java.sql.Time;
import java.util.*;

@Service
public class ReconciliationSheetService {

    public ReconciliationSheetService() {
    }

    public ReconciliationSheetList generateReconciliationSheet(String date){

        String appointmentSchedulingURI = "https://api-response-service.herokuapp.com/practice-management-reports/appointments-sample-data";
        RestTemplate restTemplate = new RestTemplate();
        /*//Calling Appointment Scheduling Team's API to retrieve appointment details on the given date.
        AppointmentList appointments =  restTemplate.getForObject(appointmentSchedulingURI, AppointmentList.class);
        //String uri = "https://dry-ocean-01268.herokuapp.com/practicemanagements?doctorId=2222&patientId=1111";
        String uri = "http://clinicmanagement-dev.us-east-2.elasticbeanstalk.com/api/GetAppointmentsByDate?date="+new Date(1282021);
        Object output = restTemplate.getForObject(uri, Object.class);
        System.out.println(output.getClass());
        List appmap = ((ArrayList) output);
        for (int x=0; x<appmap.size();x++)
            System.out.println(appmap.get(x));
        //for(int i=0; i<output.length;i++){
            //System.out.println(output[i].toString());
        //}*/

        AppointmentList appointments =  restTemplate.getForObject(appointmentSchedulingURI, AppointmentList.class);
        List<ReconciliationSheetBean> list = new ArrayList<ReconciliationSheetBean>();
        for(int i=0;i<appointments.getAppointmentBeanList().size();i++){
            ReconciliationSheetBean bean = new ReconciliationSheetBean();
            bean.setPatientID(appointments.getAppointmentBeanList().get(i).getPatientID());
            bean.setPatientName(appointments.getAppointmentBeanList().get(i).getPatientName());
            bean.setDateOfAppointment(appointments.getAppointmentBeanList().get(i).getDateOfBirth());
            bean.setDateOfAppointment(appointments.getAppointmentBeanList().get(i).getDateOfAppointment());
            bean.setTimeOfAppointment(appointments.getAppointmentBeanList().get(i).getTimeOfAppointment());
            bean.setAppointmentStatus(appointments.getAppointmentBeanList().get(i).getAppointmentStatus());
            bean.setDoctorID(appointments.getAppointmentBeanList().get(i).getDoctorID());
            bean.setSpecialitySeen(appointments.getAppointmentBeanList().get(i).getSpecialitySeen());
            String billingURI = "https://api-response-service.herokuapp.com/practice-management-reports/billing-sample-data";
            //Calling billing team's API to get billing details for a given patient id.
            Object object = restTemplate.getForObject(billingURI, Object.class);
            HashMap map = ((LinkedHashMap) object);
            bean.setCoPay((String) map.get("coPay"));
            bean.setPaymentAmount((String) map.get("paymentAmount"));
            bean.setAmountCollected((String) map.get("amountCollected"));

            list.add(bean);
        }
        return new ReconciliationSheetList(list);
    }
}
