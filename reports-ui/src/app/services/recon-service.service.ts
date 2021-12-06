import { MISSEDAPP, OVERDUERECORDS, ALERT, VISITING, PAYERBASED, REVENUE } from './../mock-data';
import { MissedAppointments, OverdueRecords, Alerts, VisitingList, PayerBased, RevenueAging } from './../SheetTypeInterface';
import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { NewPatient, ReconSheet } from '../SheetTypeInterface'

import { NEWPATIENT, RECONSHEET}  from '../mock-data'

@Injectable({
  providedIn: 'root'
})
export class ReportsService{

  constructor() { }

  getRecon(): Observable<ReconSheet[]> {
    const reconsheet = of(RECONSHEET);
    return reconsheet;
  }

  getNewPatient(): Observable<NewPatient[]> {
    const newpatient = of(NEWPATIENT);
    return newpatient;
  }

  getMissedApps(): Observable<MissedAppointments[]> {
    const missedapp = of(MISSEDAPP);
    return missedapp;
  }

  getOverdueRecords(): Observable<OverdueRecords[]> {
    const overdue = of(OVERDUERECORDS);
    return overdue;
  }

  getAlerts(): Observable<Alerts[]> {
    const alerts = of(ALERT);
    return alerts;
  }

  getVisitingList(): Observable<VisitingList[]> {
    const visiting = of(VISITING);
    return visiting;
  }

  getPayerBased(): Observable<PayerBased[]> {
    const payer = of(PAYERBASED);
    return payer;
  }

  getRevenueAging(): Observable<RevenueAging[]> {
    const revenue = of(REVENUE);
    return revenue;
  }


}

