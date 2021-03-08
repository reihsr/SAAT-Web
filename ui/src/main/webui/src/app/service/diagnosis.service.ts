import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Diagnosis } from '../model/diagnosis';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DiagnosisService {

  private apibaseurl: string;
  private getDiagnosisUrl: string;

  constructor(private http: HttpClient) {
    this.apibaseurl = 'http://localhost:8080/';
    this.getDiagnosisUrl = 'getDiagnosis';
  }

  public getDiagnosisWithLimit(start: number, limit: number): Observable<Diagnosis[]> {
    return this.http.get<Diagnosis[]>(this.apibaseurl + this.getDiagnosisUrl + '?start=' + start + '&limit=' + limit);
  }

  public getDiagnosis(): Observable<Diagnosis[]> {
    return this.http.get<Diagnosis[]>(this.apibaseurl + this.getDiagnosisUrl);
  }
}
