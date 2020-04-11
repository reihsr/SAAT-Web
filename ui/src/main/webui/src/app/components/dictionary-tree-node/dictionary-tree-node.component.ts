import { Component, OnInit } from '@angular/core';
import { DictionaryTreeNode } from '../../model/dictionary-tree-node';

@Component({
  selector: 'app-dictionary-tree-node',
  templateUrl: './dictionary-tree-node.component.html',
  styleUrls: ['./dictionary-tree-node.component.css']
})
export class DictionaryTreeNodeComponent implements OnInit {

  public dictionaryTreeNode$: DictionaryTreeNode;

  constructor() {
    this.dictionaryTreeNode$ = {
      dictionary_id: 1,
      synonym: 'Synonym',
      before_synonym: 0,
      after_synonmy: 0,
      foreword: false,
      ending: false,
      sentence: false,
      occure: false,
      root: false,
      iscode: false,
      negation: false,
      pattern: 'pattern',
      code_typ: 'code_typ',
      code_value: 'code_value',
      priority_node: false,
      priority: 1
    };
  }

  ngOnInit(): void {

  }

}
