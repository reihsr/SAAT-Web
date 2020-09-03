import { Component, OnInit, Input } from '@angular/core';
import { DictionaryTreeNode } from '../../model/dictionary-tree-node';

@Component({
  selector: 'app-saat-dictionary-tree-node',
  templateUrl: './dictionary-tree-node.component.html',
  styleUrls: ['./dictionary-tree-node.component.css']
})
export class DictionaryTreeNodeComponent implements OnInit {

  @Input() dictionaryTreeNode$: DictionaryTreeNode;
  public edit: boolean;

  constructor() {
    this.edit = false;
  }

  ngOnInit(): void {

  }

  public changeLabel(event?: any): void {
    /*this._dataService.putToDo(this.toDo$).subscribe((data: ToDo) => {
      this._dataService.getGlobalData();
    }, error => {
      console.log(`%cERROR: ${error.message}`, `color: red; font-size: 12px;`);
    });*/
  }

  public changeEditMode(event?: any):void {
    this.edit = !this.edit;
  }
}
