import { MissedAppointments } from './../../SheetTypeInterface';
import { Component, OnInit } from '@angular/core';
import { ReportsService } from './../../services/recon-service.service';
import { MISSEDAPP } from '../../mock-data'

@Component({
  selector: 'app-missed-apps',
  templateUrl: './missed-apps.component.html',
  styleUrls: ['./missed-apps.component.css']
})
export class MissedAppsComponent implements OnInit {
  showImage!: boolean;
  missedapp: MissedAppointments[] = [];

  columnsToDisplay = ['Patient Name', 'Patient ID', 'Date of Appointment', 'Time of Appointment']

  constructor(private missedappService: ReportsService) {
    this.showImage = false;
    this.missedappService.getMissedApps().subscribe( x => {
      this.missedapp= x;
    })
  }
  ngOnInit(): void {
    
  }

  

}


