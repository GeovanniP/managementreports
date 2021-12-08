package com.cs673.practicemanagementreports.reconciliationsheetservice.beans;

import java.sql.Date;
import java.sql.Time;

public class ReconciliationSheetBean {

    private String patientName;
    private String patientID;
    private String doctorID;
    private String specialitySeen;
    private Date dateOfBirth;
    private Date dateOfAppointment;
    private Time timeOfAppointment;
    private String appointmentStatus;
    private String coPay;
    private String paymentAmount;
    private String amountCollected;

    public ReconciliationSheetBean(){

    }

    public ReconciliationSheetBean(String patientName, String patientID, String doctorID, String specialitySeen, Date dateOfBirth, Date dateOfAppointment, Time timeOfAppointment, String appointmentStatus, String coPay, String paymentAmount, String amountCollected) {
        this.patientName = patientName;
        this.patientID = patientID;
        this.doctorID = doctorID;
        this.specialitySeen = specialitySeen;
        this.dateOfBirth = dateOfBirth;
        this.dateOfAppointment = dateOfAppointment;
        this.timeOfAppointment = timeOfAppointment;
        this.appointmentStatus = appointmentStatus;
        this.coPay = coPay;
        this.paymentAmount = paymentAmount;
        this.amountCollected = amountCollected;
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

    public String getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getAmountCollected() {
        return amountCollected;
    }

    public void setAmountCollected(String amountCollected) {
        this.amountCollected = amountCollected;
    }
}
