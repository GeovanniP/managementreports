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

  missedapp: MissedAppointments[] = [];

  constructor(private missedAppService: ReportsService) { }

  ngOnInit(): void {
    this.missedAppService.getMissedApps().subscribe((missedapp: MissedAppointments[]) => this.missedapp = missedapp);
  }

}


