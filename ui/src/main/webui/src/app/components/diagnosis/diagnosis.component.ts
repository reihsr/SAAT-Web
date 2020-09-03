import { Component, OnInit, Input } from '@angular/core';
import { Diagnosis } from '../../model/diagnosis';

@Component({
  selector: 'app-saat-diagnosis',
  templateUrl: './diagnosis.component.html',
  styleUrls: ['./diagnosis.component.css']
})
export class DiagnosisComponent implements OnInit {

  @Input() diagnosis: Diagnosis;

  constructor() { }

  ngOnInit(): void {
  }

}
