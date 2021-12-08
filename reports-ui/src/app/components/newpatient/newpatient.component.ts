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

  showImage = false;
  newpatient: NewPatient[] = [];

  columnsToDisplay = ['Patient Name', 'Patient ID','Doctor ID', 'Speciality Seen','Date of Birth', 'Date of Appointment', 'Time of Appointment', 'Appointment Status', 'CoPay', 'Insurance', 'Registration Date']

  constructor(private newpatientService: ReportsService) {
    this.showImage = false;
    this.newpatientService.getNewPatient().subscribe( x => {
      this.newpatient= x;
    })
  }
  ngOnInit(): void {
    
  }

  


}
