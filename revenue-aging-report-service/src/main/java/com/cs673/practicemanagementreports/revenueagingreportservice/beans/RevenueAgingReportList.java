package com.cs673.practicemanagementreports.revenueagingreportservice.beans;

import java.util.List;

public class RevenueAgingReportList {

    List<RevenueAgingReportBean> revenueAgingReportList;

    public RevenueAgingReportList() {
    }

    public RevenueAgingReportList(List<RevenueAgingReportBean> revenueAgingReportList) {
        this.revenueAgingReportList = revenueAgingReportList;
    }

    public List<RevenueAgingReportBean> getRevenueAgingReportList() {
        return revenueAgingReportList;
    }

    public void setRevenueAgingReportList(List<RevenueAgingReportBean> revenueAgingReportList) {
        this.revenueAgingReportList = revenueAgingReportList;
    }
}
