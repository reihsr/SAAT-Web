import { Component, OnInit } from '@angular/core';
import { DictionaryTreeNode } from '../../model/dictionary-tree-node';
import { DictionaryTreeNodeService } from '../../service/dictionary-tree-node.service';

@Component({
  selector: 'app-dictionary-tee-node-list',
  templateUrl: './dictionary-tee-node-list.component.html',
  styleUrls: ['./dictionary-tee-node-list.component.css']
})
export class DictionaryTeeNodeListComponent implements OnInit {

  dictionaryTreeNodes: DictionaryTreeNode[];

  constructor(private dictionaryTreeNodeService: DictionaryTreeNodeService) { }

  ngOnInit(): void {
    this.dictionaryTreeNodeService.findAll().subscribe(data => {
      this.dictionaryTreeNodes = data;
    })
  }

}
