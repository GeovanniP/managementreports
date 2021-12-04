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


