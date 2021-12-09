package com.cs673.practicemanagementreports.missedappointmentsservice.beans;

import java.sql.Date;
import java.sql.Time;

public class MissedAppointmentBean {

    private String patientName;
    private String patientID;
    private Date dateOfAppointment;
    private Time timeOfAppointment;

    public MissedAppointmentBean() {
    }

    public MissedAppointmentBean(String patientName, String patientID, Date dateOfAppointment, Time timeOfAppointment) {
        this.patientName = patientName;
        this.patientID = patientID;
        this.dateOfAppointment = dateOfAppointment;
        this.timeOfAppointment = timeOfAppointment;
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
}
