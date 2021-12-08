package com.cs673.practicemanagementreports.apiresponseservice.beans;

import java.util.List;

public class RevenueAgingReportList {

    List<RevenueAgingReportBean> revenueAgingReportList;

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
