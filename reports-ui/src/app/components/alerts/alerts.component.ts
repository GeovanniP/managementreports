import { Alerts } from './../../SheetTypeInterface';
import { Component, OnInit } from '@angular/core';
import { ReportsService } from './../../services/recon-service.service';

@Component({
  selector: 'app-alerts',
  templateUrl: './alerts.component.html',
  styleUrls: ['./alerts.component.css']
})
export class AlertsComponent implements OnInit {

  alerts: Alerts[] = [];

  constructor(private alertService: ReportsService) { }

  ngOnInit(): void {
    this.alertService.getAlerts().subscribe((alerts: Alerts[]) => this.alerts = alerts);
  }

}
