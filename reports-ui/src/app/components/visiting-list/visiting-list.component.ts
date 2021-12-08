import { ReportsService } from 'src/app/services/recon-service.service';
import { VisitingList } from './../../SheetTypeInterface';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-visiting-list',
  templateUrl: './visiting-list.component.html',
  styleUrls: ['./visiting-list.component.css']
})
export class VisitingListComponent implements OnInit {
  showImage!: boolean;

  visiting: VisitingList[] = [];
  columnsToDisplay = ['Patient Name', 'Patient ID', 'Date of Appointment', 'Time of Appointment', 'Notes', 'Medications']

  constructor(private visitingService: ReportsService) {
    this.showImage = false;
    this.visitingService.getVisitingList().subscribe( x => {
      this.visiting= x;
    })
  }
  ngOnInit(): void {
    
  }

  
}
