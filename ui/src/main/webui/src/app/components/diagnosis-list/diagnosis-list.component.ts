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

  constructor(private diagnosisService: DiagnosisService) { }

  ngOnInit(): void {
    this.diagnosisService.getDiagnosis(0, 10).subscribe(data => {
      this.diagnosisList = data;
    })
  }

}
