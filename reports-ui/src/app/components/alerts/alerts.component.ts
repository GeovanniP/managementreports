import { Alerts } from './../../SheetTypeInterface';
import { Component, OnInit } from '@angular/core';
import { ReportsService } from './../../services/recon-service.service';

@Component({
  selector: 'app-alerts',
  templateUrl: './alerts.component.html',
  styleUrls: ['./alerts.component.css']
})
export class AlertsComponent implements OnInit {
  showImage!: boolean;
  alerts: Alerts[] = [];

  columnsToDisplay = ['Patient Name', 'Patient ID', 'Alert Title', 'Alert Description']

  constructor(private alertService: ReportsService) {
    this.showImage = false;
    this.alertService.getAlerts().subscribe( x => {
      this.alerts= x;
    })
  }
  ngOnInit(): void {
    
  }

  
}
