package com.cs673.practicemanagementreports.reconciliationsheetservice.beans;

import java.util.List;

public class ReconciliationSheetList {

    private List<ReconciliationSheetBean> reconciliationSheetBeanList;

    public ReconciliationSheetList(List<ReconciliationSheetBean> reconciliationSheetBeanList) {
        this.reconciliationSheetBeanList = reconciliationSheetBeanList;
    }

    public ReconciliationSheetList() {

    }

    public List<ReconciliationSheetBean> getReconciliationSheetBeanList() {
        return reconciliationSheetBeanList;
    }

    public void setReconciliationSheetBeanList(List<ReconciliationSheetBean> reconciliationSheetBeanList) {
        this.reconciliationSheetBeanList = reconciliationSheetBeanList;
    }
}
