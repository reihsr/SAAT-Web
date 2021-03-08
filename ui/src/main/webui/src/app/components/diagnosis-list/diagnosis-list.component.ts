import { Component, OnInit } from '@angular/core';
import { Diagnosis } from '../../model/diagnosis';
import { DiagnosisService } from '../../service/diagnosis.service';

@Component({
  selector: 'app-saat-diagnosis-list',
  templateUrl: './diagnosis-list.component.html',
  styleUrls: ['./diagnosis-list.component.css']
})
export class DiagnosisListComponent implements OnInit {

  diagnosisList: Diagnosis[];
  pageOfdiagnosis: Array<any>;

  constructor(private diagnosisService: DiagnosisService) { }

  ngOnInit(): void {
    this.diagnosisService.getDiagnosisWithLimit(0, 500).subscribe(data => {
      this.diagnosisList = data;
    })
  }

  onChangePage(pageOfdiagnosis: Array<any>) {
    // update current page of items
    this.pageOfdiagnosis = pageOfdiagnosis;
  }

}
