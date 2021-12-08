import { ReportsService } from 'src/app/services/recon-service.service';
import { PayerBased } from './../../SheetTypeInterface';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-payer-based',
  templateUrl: './payer-based.component.html',
  styleUrls: ['./payer-based.component.css']
})
export class PayerBasedComponent implements OnInit {
  showImage!: boolean;
  payer: PayerBased[] = [];

  columnsToDisplay = ['Patient Name', 'Patient ID', 'Amount Collected', 'Amount Owed', 'Insurance']

  constructor(private payerService: ReportsService) {
    this.showImage = false;
    this.payerService.getPayerBased().subscribe( x => {
      this.payer= x;
    })
  }
  ngOnInit(): void {
    
  }
}
