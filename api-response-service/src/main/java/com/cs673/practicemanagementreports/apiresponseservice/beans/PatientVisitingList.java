package com.cs673.practicemanagementreports.apiresponseservice.beans;

import java.util.List;

public class PatientVisitingList {

    private List<PatientVisitingBean> patientVisitingList;

    public PatientVisitingList(List<PatientVisitingBean> patientVisitingList) {
        this.patientVisitingList = patientVisitingList;
    }

    public List<PatientVisitingBean> getPatientVisitingList() {
        return patientVisitingList;
    }

    public void setPatientVisitingList(List<PatientVisitingBean> patientVisitingList) {
        this.patientVisitingList = patientVisitingList;
    }
}
