import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { DictionaryTreeNode } from '../model/dictionary-tree-node';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DictionaryTreeNodeService {

  private dictionaryTreeNodeUrl: string;

  constructor(private http: HttpClient) {
    this.dictionaryTreeNodeUrl = 'http://localhost:8080/dictionarytreenodes'
  }

  public findAll(): Observable<DictionaryTreeNode[]> {
    return this.http.get<DictionaryTreeNode[]>(this.dictionaryTreeNodeUrl);
  }

  public save(dictionaryTreeNode: DictionaryTreeNode) {
    return this.http.post<DictionaryTreeNode>(this.dictionaryTreeNodeUrl, dictionaryTreeNode);
  }
}
