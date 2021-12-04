import { OverdueRecords } from './../../SheetTypeInterface';


import { Component, OnInit, Input } from '@angular/core';
import {MatTableModule} from '@angular/material/table';
import { ReconSheet, NewPatient, MissedAppointments } from '../../SheetTypeInterface'

import { RECONSHEET, NEWPATIENT, MISSEDAPP, OVERDUERECORDS } from '../../mock-data'

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent implements OnInit {


  // @Input() table_name!: string;

  reconsheet: ReconSheet[] = RECONSHEET;
  newpatient: NewPatient[] = NEWPATIENT;
  missedapp: MissedAppointments[] = MISSEDAPP;
  overdue: OverdueRecords[] = OVERDUERECORDS;

  constructor() { }

  ngOnInit(): void {
  }

}
