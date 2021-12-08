package com.cs673.practicemanagementreports.apiresponseservice.beans;

import java.util.List;

public class ClinicalAlertsList {

    List<ClinicalAlertsBean> clinicalAlertsList;

    public ClinicalAlertsList(List<ClinicalAlertsBean> clinicalAlertsList) {
        this.clinicalAlertsList = clinicalAlertsList;
    }

    public List<ClinicalAlertsBean> getClinicalAlertsList() {
        return clinicalAlertsList;
    }

    public void setClinicalAlertsList(List<ClinicalAlertsBean> clinicalAlertsList) {
        this.clinicalAlertsList = clinicalAlertsList;
    }
}
