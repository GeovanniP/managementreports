import { MISSEDAPP, OVERDUERECORDS } from './../mock-data';
import { MissedAppointments, OverdueRecords } from './../SheetTypeInterface';
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
}
