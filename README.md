# Management Reports
## Team Name: Team 3

## Team Member/Role
* Christopher Simon - Quality & Dev Ops

* Yan Yan - Data Architect

* Kevin Blum - UI/UX Developer

* Geovanni Posadas - Product Management & Business Analyst

* Jaswin Gumpella - Microservices Developer

## Pivotal Tracker URL
https://www.pivotaltracker.com/n/projects/2533947

## Vision

**1. Far Vision:**
Build an application that holds the financial performance for a health management institution. This application will manage the adjustments, payments, and the sources that come in to the companies records.

**2. Near Vision:** Create a prototype of an application that includes all the necessary categories of a practice management report. Integrate the services of the practice management reports with the other services made by the other teams.

**3. Overall Vision:**
This application will be for health care institutions to track all of their financial information in order to get an overall picture of their revenue. This product will be called Management Reports and it is a financial application. The key benefit for this application will be for the institution to better manage their sales growth and help manage their business. Unlike other services, this application will be tracking the revenue bi-weekly in order to give the institution a better understand of where they are in their goals. This product is going to be an application with a variety of different pieces such as charges, revenue, and the information from other departments transactions coming under one platform. 

## Stakeholders
1. Practice Management(HR) 
2. Front Office
3. Back Office

## User Persona
Practice Management(HR)- Their vision for this application is for it to track their revenue and reach specific goals that they set. Their goals for this would be to better manage their health care institution and make it more efficient to manage. Their employees will also be making use of this application for logging the financial information daily in their systems.

The employee’s will be logging this information on the website created, since they already use their computers daily it will all be in one place.
They are motivated by reaching peak financial performance and servicing their patients to the best of their abilities.

## Product Backlog
Ordered backlog by department and who would be accessing each of the feature. We have different stakeholders who will be using the application including Doctors, Back Office, Front Office, Patients, and the Practice Management.

## APIs Information

APIs list: https://docs.google.com/presentation/d/12OyzUYXqFiMIXvq0ipLJ5zzPdFvLoolj1_jmlZQpsdY/edit?usp=sharing

APIs Expected Outputs: https://docs.google.com/presentation/d/13APwc9GunXWNp6mY2UZlCKI_ljIaR_V5gf_RV0uckws/edit#slide=id.p
1. Send an end of day reconciliation sheet (URL: https://reconciliation-sheet-service.herokuapp.com/practice-management-reports/reconciliation-sheet/{date}):
   Fetch all appointment details for a particular day and retrieve all the corresponding patient details along with the payment related data. Generate a report containing all the retrieved data and display on screen.
   Requirements:
   API from Appointment Scheduling Team to receive the list of appointments on the given date. (Patient ID, Date and Time of appointment, Appointment status (Checked in, Missed, New Patient), Doctor and Speciality seen)
   API from Kiosk and Intake Patients Team to retrieve patient details (name, id, dob, insurance) for the given patient id.
   API from Billing and Revenue Management Team to retrieve all the payment related data for a given Patient ID and Appointment time. (Co-pay, Insurance amount, Due amount, etc)

2. Send list of incoming patients that are new in the month (URL: https://new-patient-list-service.herokuapp.com/practice-management-reports/new-patient-list/{date}):
   Fetch all appointment details for new patients and return the list of the patients.
   Requirements:
   API from Appointment Scheduling Team to receive the list of appointments on the given date and status as new patient.

3. Send list of patients that missed their appointments (URL: https://missed-appointments-service.herokuapp.com/practice-management-reports/missed-appointments/{date}):
   Fetch all details of the patients who missed their appointments. (appointment status = missed)
   Requirements:
   API from Appointment Scheduling Team to receive the list of appointments on the given date and status as missed.

4. Send payer-based report (URL: https://payer-based-report-service.herokuapp.com/practice-management-reports/payer-based-report/{date}):
   Fetch all details of appointments of the required day and retrieve the corresponding billing information to be displayed.
   Requirements:
   API from Appointment Scheduling Team to receive the list of appointments on the given date. (Patient ID, Date and Time of appointment, Appointment status (Checked in, New Patient), Doctor and Speciality seen)
   API from Billing and Revenue Management Team to retrieve all the payment related data for a given Patient ID and Appointment time. (Co-pay, Insurance amount, Due amount, etc)

5. Send patients visiting records (URL: https://patient-visiting-list-service.herokuapp.com/practice-management-reports/patient-visiting-list/{date}):
   Fetch the appointment details of the particular day and retrieve the corresponding patient records and details to be displayed as an overview to the Doctor.
   Requirements:
   API from Appointment Scheduling Team to receive the list of appointments on the given date. (Patient ID, Date and Time of appointment, Appointment status (Checked in, New Patient), Doctor and Speciality seen, Notes, Medication)
   API from Kiosk and Intake Patients Team to retrieve patient details (name, id, dob, insurance) for the given patient id.
   API from Patient Demographics Team to retrieve medical history

6. Send patients with overdue records (URL: https://overdue-records-service.herokuapp.com/practice-management-reports/overdue-records):
   Fetch all the records from billing where patients have overdue and display the list.
   Requirements:
   API from Billing and Revenue Management Team to retrieve all the payment related data for patients with overdue. (Patient ID, Date and Time of appointment, Appointment status (Checked in, New Patient), Doctor and Speciality seen)

7. Send clinical alerts list (URL: https://clinical-alerts-service.herokuapp.com/practice-management-reports/clinical-alerts/{date}):
   Fetch the list of patients who have clinical alerts on the given date and generate a list of the patients to view an estimated number of future appointments.
   Requirements:
   API from Patient Team to receive the list of clinical alerts on the given date. (Patient ID, Patient Name, Clinical Alert)

8. Send bi-weekly revenue aging report (URL: https://revenue-aging-report-service.herokuapp.com/practice-management-reports/revenue-aging-report/{start-date}/{end-date}):
   Fetch all billing information of the patients for the given period of time and display the revenue aging report.
   Requirements:
   API from Billing and Revenue Management Team to retrieve all the payment related data for patients for the given period. (Patient ID, Date and Time of appointment, Appointment status (Checked in, New Patient), Doctor and Speciality seen)