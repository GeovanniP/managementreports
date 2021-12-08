package com.cs673.practicemanagementreports.payerbasedreportservice.beans;

import java.util.List;

public class PayerBasedReportList {

    private List<PayerBasedReportBean> payerBasedReportList;

    public PayerBasedReportList() {
    }

    public PayerBasedReportList(List<PayerBasedReportBean> payerBasedReportList) {
        this.payerBasedReportList = payerBasedReportList;
    }

    public List<PayerBasedReportBean> getPayerBasedReportList() {
        return payerBasedReportList;
    }

    public void setPayerBasedReportList(List<PayerBasedReportBean> payerBasedReportList) {
        this.payerBasedReportList = payerBasedReportList;
    }
}
