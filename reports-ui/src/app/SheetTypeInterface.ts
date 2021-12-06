export interface ReconSheet {
    patientName: string;
    patientID: string;
    doctorID: string;
    specialitySeen: string;
    dateOfBirth: string;
    dateOfAppointment: string;
    timeOfAppointment: string;
    appointmentStatus: string;
    coPay: string;
    paymentAmount: string;
    amountCollected: string;
}

export interface NewPatient {
    patientName: string;
    patientID: string;
    specialitySeen: string;
    dateOfBirth: string;
    dateOfAppointment: string;
    timeOfAppointment: string;
    appointmentStatus: string;
    coPay: string;
    insurance: string;
    registrationDate: string;
}

export interface MissedAppointments {

    patientName: string;
    patientID: string;
    dateOfAppointment: string;
    timeOfAppointment: string;
    

}

export interface OverdueRecords {
    patientName: string;
    patientID: string;
    amountOwed: string;
}

export interface BiWeeklyAging {
    patientName: string;
    patientID: string;
    amountOwed: string;
    one: string;
    two: string;
    three: string;
    total: string;
}

export interface Alerts {
    patientName: string;
    patientID: string;
    alert: string;

}

export interface VisitingList {
    patientName: string;
    patientID: string;
    alert: string;
    
}

