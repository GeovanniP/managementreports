
import { Component, OnInit, Input } from '@angular/core';
import {MatTableModule} from '@angular/material/table';
import { ReconSheet, NewPatient } from '../../SheetTypeInterface'

import { RECONSHEET, NEWPATIENT } from '../../mock-data'

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent implements OnInit {


  // @Input() table_name!: string;

  reconsheet: ReconSheet[] = RECONSHEET;
  newpatient: NewPatient[] = NEWPATIENT;

  constructor() { }

  ngOnInit(): void {
  }

}
