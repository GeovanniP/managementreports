package com.cs673.practicemanagementreports.apiresponseservice.beans;

import java.sql.Date;
import java.sql.Time;

public class AppointmentBean {

    private String patientName;
    private String patientID;
    private Date dateOfAppointment;
    private Time timeOfAppointment;
    private String appointmentStatus;

    public AppointmentBean() {
    }

    public AppointmentBean(String patientName, String patientID, Date dateOfAppointment, Time timeOfAppointment, String appointmentStatus) {
        this.patientName = patientName;
        this.patientID = patientID;
        this.dateOfAppointment = dateOfAppointment;
        this.timeOfAppointment = timeOfAppointment;
        this.appointmentStatus = appointmentStatus;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public Date getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(Date dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    public Time getTimeOfAppointment() {
        return timeOfAppointment;
    }

    public void setTimeOfAppointment(Time timeOfAppointment) {
        this.timeOfAppointment = timeOfAppointment;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

}
