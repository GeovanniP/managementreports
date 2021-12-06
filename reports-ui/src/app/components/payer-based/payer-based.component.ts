import { ReportsService } from 'src/app/services/recon-service.service';
import { PayerBased } from './../../SheetTypeInterface';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-payer-based',
  templateUrl: './payer-based.component.html',
  styleUrls: ['./payer-based.component.css']
})
export class PayerBasedComponent implements OnInit {

  payer: PayerBased[] = [];

  constructor(private payerService: ReportsService) { }

  ngOnInit(): void {
    this.payerService.getPayerBased().subscribe((payer: PayerBased[]) => this.payer = payer);
  }

}
