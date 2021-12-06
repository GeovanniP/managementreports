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

  overdue: OverdueRecords[] = OVERDUERECORDS;

  constructor(private overdueService: ReportsService) { }

  ngOnInit(): void {
    this.overdueService.getOverdueRecords().subscribe((overdue: OverdueRecords[]) => this.overdue = overdue);
  }
  

}
