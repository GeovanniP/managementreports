import { Component, OnInit } from '@angular/core';
import { OverdueRecords } from './../../SheetTypeInterface';
import { OVERDUERECORDS } from '../../mock-data'
import { ReportsService } from 'src/app/services/recon-service.service';

@Component({
  selector: 'app-overdue',
  templateUrl: './overdue.component.html',
  styleUrls: ['./overdue.component.css']
})
export class OverdueComponent implements OnInit {

  showImage!: boolean;
  overdue: OverdueRecords[] = [];

  columnsToDisplay = ['Patient Name', 'Patient ID', 'Amount Owed',]

  constructor(private overdueService: ReportsService) {
    this.showImage = false;
    this.overdueService.getOverdueRecords().subscribe( x => {
      this.overdue= x;
    })
  }
  ngOnInit(): void {
    
  }

}
