import { ReportsService, } from 'src/app/services/recon-service.service';
import { RevenueAging } from './../../SheetTypeInterface';
import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';

@Component({
  selector: 'app-revenue-aging',
  templateUrl: './revenue-aging.component.html',
  styleUrls: ['./revenue-aging.component.css']
})
export class RevenueAgingComponent implements OnInit {

  revenue: RevenueAging[] = [];
  

  constructor(private revenueService: ReportsService) { }

  ngOnInit(): void {
    this.revenueService.getRevenueAging().subscribe((revenue: RevenueAging[]) => this.revenue = revenue);
  }
  
}
