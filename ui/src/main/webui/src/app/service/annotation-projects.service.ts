import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {AnnotationProject} from '../model/annotation-project';

@Injectable({
  providedIn: 'root'
})
export class AnnotationProjectsService {

  private apibaseUrl: string;
  private getAnnotationProjectsUrl: string;

  constructor(private http: HttpClient) {
    this.apibaseUrl = 'http://localhost:8080/';
    this.getAnnotationProjectsUrl = 'getAnnotationProjects';
  }

  public getAnnotationProjects(): Observable<AnnotationProject[]> {
    return this.http.get<AnnotationProject[]>(this.apibaseUrl + this.getAnnotationProjectsUrl);
  }
}
