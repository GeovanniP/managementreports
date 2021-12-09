package com.cs673.practicemanagementreports.missedappointmentsservice.beans;

import java.util.List;

public class MissedAppointmentsList {

    private List<MissedAppointmentBean> missedAppointmentsList;

    public MissedAppointmentsList(List<MissedAppointmentBean> missedAppointmentsList) {
        this.missedAppointmentsList = missedAppointmentsList;
    }

    public List<MissedAppointmentBean> getMissedAppointmentsList() {
        return missedAppointmentsList;
    }

    public void setMissedAppointmentsList(List<MissedAppointmentBean> missedAppointmentsList) {
        this.missedAppointmentsList = missedAppointmentsList;
    }
}
