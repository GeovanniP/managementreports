package com.cs673.practicemanagementreports.missedappointmentsservice.beans;

import java.sql.Date;
import java.sql.Time;

public class AppointmentBean {

    private String patientName;
    private String patientID;
    private Date dateOfAppointment;
    private Time timeOfAppointment;
    private String appointmentStatus;
    private String doctorID;
    private String specialitySeen;

    public AppointmentBean() {
    }

    public AppointmentBean(String patientName, String patientID, Date dateOfAppointment, Time timeOfAppointment, String appointmentStatus, String doctorID, String specialitySeen) {
        this.patientName = patientName;
        this.patientID = patientID;
        this.dateOfAppointment = dateOfAppointment;
        this.timeOfAppointment = timeOfAppointment;
        this.appointmentStatus = appointmentStatus;
        this.doctorID = doctorID;
        this.specialitySeen = specialitySeen;
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

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getSpecialitySeen() {
        return specialitySeen;
    }

    public void setSpecialitySeen(String specialitySeen) {
        this.specialitySeen = specialitySeen;
    }

}
