package com.cs673.practicemanagementreports.missedappointmentsservice.beans;

import java.util.List;

public class AppointmentList {
    private List<AppointmentBean> appointmentBeanList;

    public AppointmentList() {
    }

    public AppointmentList(List<AppointmentBean> appointmentBeanList) {
        this.appointmentBeanList = appointmentBeanList;
    }

    public List<AppointmentBean> getAppointmentBeanList() {
        return appointmentBeanList;
    }

    public void setAppointmentBeanList(List<AppointmentBean> appointmentBeanList) {
        this.appointmentBeanList = appointmentBeanList;
    }
}
