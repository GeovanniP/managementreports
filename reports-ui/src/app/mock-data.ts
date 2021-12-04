import { ReconSheet, NewPatient, MissedAppointments, OverdueRecords } from './SheetTypeInterface'

export const RECONSHEET: ReconSheet[] = [{

    patientName:"PatientA",
    patientID:"P101",
    doctorID:"D001",
    specialitySeen:"Speciality 1",
    dateOfBirth:"1969-12-31",
    dateOfAppointment:"1969-12-31",
    timeOfAppointment:"19:00:00",
    appointmentStatus:"Status",
    coPay:"0",
    paymentAmount:"0",
    amountCollected:"0"},

    {patientName:"PatientB",
    patientID:"P102",
    doctorID:"D001",
    specialitySeen:"Speciality 1",
    dateOfBirth:"1969-12-31",
    dateOfAppointment:"1969-12-31",
    timeOfAppointment:"19:00:00",
    appointmentStatus:"Status",
    coPay:"0","paymentAmount":"0",
    amountCollected:"0"},

    {patientName:"Patient C",
    patientID:"P103",
    doctorID:"D002",
    specialitySeen:"Speciality 2",
    dateOfBirth:"1969-12-31",
    dateOfAppointment:"1969-12-31",
    timeOfAppointment:"19:00:00",
    appointmentStatus:"Status",
    coPay:"0",
    paymentAmount:"0",
    amountCollected:"0"}
    
]

export const NEWPATIENT: NewPatient[] =[{
    "patientName": "PatientA",
    "patientID":"P101",
    "specialitySeen":"Speciality 1",
    "dateOfBirth":"1969-12-31",
    "dateOfAppointment":"1969-12-31",
    "timeOfAppointment":"19:00:00",
    "appointmentStatus":"Status",
    "coPay":"0",
    "insurance":"0","registrationDate":"1969-12-31"},

    {"patientName":"Patient B",
    "patientID":"P102",
    "specialitySeen":"Speciality 1",
    "dateOfBirth":"1969-12-31",
    "dateOfAppointment":"1969-12-31",
    "timeOfAppointment":"19:00:00",
    "appointmentStatus":"Status",
    "coPay":"0","insurance":"0",
    "registrationDate":"1969-12-31"},
    {"patientName":"Patient C","patientID":"P103","specialitySeen":"Speciality 2","dateOfBirth":"1969-12-31","dateOfAppointment":"1969-12-31","timeOfAppointment":"19:00:00","appointmentStatus":"Status","coPay":"0","insurance":"0","registrationDate":"1969-12-31"},{"patientName":"Patient D","patientID":"P104","specialitySeen":"Speciality 1","dateOfBirth":"1969-12-31","dateOfAppointment":"1969-12-31","timeOfAppointment":"19:00:00","appointmentStatus":"Status","coPay":"0","insurance":"0","registrationDate":"1969-12-31"},{"patientName":"Patient E","patientID":"P105","specialitySeen":"Speciality 3","dateOfBirth":"1969-12-31","dateOfAppointment":"1969-12-31","timeOfAppointment":"19:00:00","appointmentStatus":"Status","coPay":"0","insurance":"0","registrationDate":"1969-12-31"}]


    export const MISSEDAPP: MissedAppointments[] = [{"patientName":"Patient A","patientID":"P101","dateOfAppointment":"1969-12-31","timeOfAppointment":"19:00:00"},{"patientName":"Patient B","patientID":"P102","dateOfAppointment":"1969-12-31","timeOfAppointment":"19:00:00"},{"patientName":"Patient C","patientID":"P103","dateOfAppointment":"1969-12-31","timeOfAppointment":"19:00:00"},{"patientName":"Patient D","patientID":"P104","dateOfAppointment":"1969-12-31","timeOfAppointment":"19:00:00"},{"patientName":"Patient E","patientID":"P105","dateOfAppointment":"1969-12-31","timeOfAppointment":"19:00:00"}]

    export const OVERDUERECORDS: OverdueRecords[] = [{"patientName":"Patient A","patientID":"P101","amountOwed":"0"},{"patientName":"Patient B","patientID":"P102","amountOwed":"0"},{"patientName":"Patient C","patientID":"P103","amountOwed":"0"},{"patientName":"Patient D","patientID":"P104","amountOwed":"0"},{"patientName":"Patient E","patientID":"P105","amountOwed":"0"}]
    



