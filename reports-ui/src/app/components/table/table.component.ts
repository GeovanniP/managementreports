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


  
  showImage!: boolean;
  reconsheet: ReconSheet[] = []
  
  columnsToDisplay = ['Patient Name', 'Patient ID','Doctor ID', 'Speciality Seen','Date of Birth', 'Date of Appointment', 'Time of Appointment', 'Appointment Status', 'CoPay', 'Payment Amount', 'Amount Collected']

  constructor(private reconService: ReportsService) {
    this.showImage = false;
    this.reconService.getRecon().subscribe( x => {
      this.reconsheet= x;
    })
  }
  ngOnInit(): void {
    
  }
  

}
