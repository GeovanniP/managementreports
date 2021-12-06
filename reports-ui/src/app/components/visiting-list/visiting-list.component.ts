import { ReportsService } from 'src/app/services/recon-service.service';
import { VisitingList } from './../../SheetTypeInterface';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-visiting-list',
  templateUrl: './visiting-list.component.html',
  styleUrls: ['./visiting-list.component.css']
})
export class VisitingListComponent implements OnInit {

  visiting: VisitingList[] = [];

  constructor(private visitingService: ReportsService) { }

  ngOnInit(): void {
    this.visitingService.getVisitingList().subscribe((visiting: VisitingList[]) => this.visiting = visiting);
  }
}
