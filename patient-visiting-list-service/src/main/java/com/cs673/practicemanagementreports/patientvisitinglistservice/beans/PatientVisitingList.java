package com.cs673.practicemanagementreports.patientvisitinglistservice.beans;

import java.util.List;

public class PatientVisitingList {

    private List<PatientVisitingBean> patientVisitingList;

    public PatientVisitingList() {
    }

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
