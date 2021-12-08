package com.cs673.practicemanagementreports.newpatientlistservice.beans;

import java.sql.Date;
import java.sql.Time;

public class NewPatientBean {

    private String patientName;
    private String patientID;
    private String specialitySeen;
    private Date dateOfBirth;
    private Date dateOfAppointment;
    private Time timeOfAppointment;
    private String appointmentStatus;
    private String coPay;
    private String insurance;
    private Date registrationDate;

    public NewPatientBean() {
    }

    public NewPatientBean(String patientName, String patientID, String specialitySeen, Date dateOfBirth, Date dateOfAppointment, Time timeOfAppointment, String appointmentStatus, String coPay, String insurance, Date registrationDate) {
        this.patientName = patientName;
        this.patientID = patientID;
        this.specialitySeen = specialitySeen;
        this.dateOfBirth = dateOfBirth;
        this.dateOfAppointment = dateOfAppointment;
        this.timeOfAppointment = timeOfAppointment;
        this.appointmentStatus = appointmentStatus;
        this.coPay = coPay;
        this.insurance = insurance;
        this.registrationDate = registrationDate;
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

    public String getSpecialitySeen() {
        return specialitySeen;
    }

    public void setSpecialitySeen(String specialitySeen) {
        this.specialitySeen = specialitySeen;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public String getCoPay() {
        return coPay;
    }

    public void setCoPay(String coPay) {
        this.coPay = coPay;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
