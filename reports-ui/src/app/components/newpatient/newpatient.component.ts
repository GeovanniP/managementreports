import { ReportsService } from './../../services/recon-service.service';
import { Component, OnInit } from '@angular/core';
import {MatTableModule} from '@angular/material/table';
import {NewPatient} from '../../SheetTypeInterface'
import { NEWPATIENT} from '../../mock-data'


@Component({
  selector: 'app-newpatient',
  templateUrl: './newpatient.component.html',
  styleUrls: ['./newpatient.component.css']
})
export class NewpatientComponent implements OnInit {

  newpatient: NewPatient[] = [];

  constructor(private newPatientService: ReportsService) { }

  ngOnInit(): void {
    this.newPatientService.getNewPatient().subscribe((newpatient: NewPatient[]) => this.newpatient = newpatient);
  }


}
