package com.cs673.practicemanagementreports.newpatientlistservice.beans;

import java.util.List;

public class NewPatientList {

    List<NewPatientBean> newPatientsList;

    public NewPatientList() {
    }

    public NewPatientList(List<NewPatientBean> newPatientsList) {
        this.newPatientsList = newPatientsList;
    }

    public List<NewPatientBean> getNewPatientsList() {
        return newPatientsList;
    }

    public void setNewPatientsList(List<NewPatientBean> newPatientsList) {
        this.newPatientsList = newPatientsList;
    }
}
