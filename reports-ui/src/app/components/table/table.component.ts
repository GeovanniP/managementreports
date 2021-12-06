import { OverdueRecords } from './../../SheetTypeInterface';
import { Component, OnInit, Input } from '@angular/core';
import {MatTableModule} from '@angular/material/table';
import { ReconSheet } from '../../SheetTypeInterface'
import { ReportsService } from 'src/app/services/recon-service.service';
import { RECONSHEET}  from '../../mock-data'

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent implements OnInit {


  // @Input() table_name!: string;

  reconsheet: ReconSheet[] = []
  
 

  constructor(private reconService: ReportsService) { }

  ngOnInit(): void {
    this.reconService.getRecon().subscribe((reconsheet: ReconSheet[]) => this.reconsheet = reconsheet);
  }

}
