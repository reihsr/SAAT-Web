import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { DictionaryTreeNode } from '../model/dictionary-tree-node';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DictionaryTreeNodeService {

  private apibaseurl: string;
  private dictionaryTreeRootNodesUrl: string;
  private dictionaryTreeChildNodesUrl: string;

  constructor(private http: HttpClient) {
    this.apibaseurl = 'http://localhost:8080/';
    this.dictionaryTreeRootNodesUrl = 'rootnodesstartingwith?startswith=M';
    this.dictionaryTreeChildNodesUrl = 'getchildnodes?parentId=';
  }

  public getRootNodes(): Observable<DictionaryTreeNode[]> {
    return this.http.get<DictionaryTreeNode[]>(this.apibaseurl + this.dictionaryTreeRootNodesUrl);
  }

  public getChildNodes(parentId: number): Observable<DictionaryTreeNode[]> {
    return this.http.get<DictionaryTreeNode[]>(this.apibaseurl + this.dictionaryTreeChildNodesUrl + parentId);
  }

  public save(dictionaryTreeNode: DictionaryTreeNode) {
    return this.http.post<DictionaryTreeNode>(this.apibaseurl + this.dictionaryTreeRootNodesUrl, dictionaryTreeNode);
  }
}
