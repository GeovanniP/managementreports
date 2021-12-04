
import { Component, OnInit } from '@angular/core';
import {MatTableModule} from '@angular/material/table';
import { ReconSheet } from '../../ReconSheet'
import { RECONSHEET } from '../../mock-recon'

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent implements OnInit {

  reconsheet: ReconSheet[] = RECONSHEET;

  constructor() { }

  ngOnInit(): void {
  }

}
