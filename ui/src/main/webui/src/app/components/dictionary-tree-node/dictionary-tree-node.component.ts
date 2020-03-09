import { Component, OnInit } from '@angular/core';
import { DictionaryTreeNode } from '../../model/dictionary-tree-node';
import { DictionaryTreeNodeService } from '../../service/dictionary-tree-node.service';

@Component({
  selector: 'app-dictionary-tree-node',
  templateUrl: './dictionary-tree-node.component.html',
  styleUrls: ['./dictionary-tree-node.component.css']
})
export class DictionaryTreeNodeComponent implements OnInit {

  dictionaryTreeNodes: DictionaryTreeNode[];

  constructor(private dictionaryTreeNodeService: DictionaryTreeNodeService) { }

  ngOnInit(): void {
    this.dictionaryTreeNodeService.findAll().subscribe(data => {
      this.dictionaryTreeNodes = data;
    })
  }

}
