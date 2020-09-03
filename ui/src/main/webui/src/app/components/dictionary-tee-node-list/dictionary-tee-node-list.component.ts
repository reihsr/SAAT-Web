import { Component, OnInit, Input } from '@angular/core';
import { DictionaryTreeNode } from '../../model/dictionary-tree-node';
import { DictionaryTreeNodeService } from '../../service/dictionary-tree-node.service';

@Component({
  selector: 'app-saat-dictionary-tee-node-list',
  templateUrl: './dictionary-tee-node-list.component.html',
  styleUrls: ['./dictionary-tee-node-list.component.css']
})
export class DictionaryTeeNodeListComponent implements OnInit {

  dictionaryTreeNodes: DictionaryTreeNode[];
  @Input() perentNodeId$: number = -1;

  constructor(private dictionaryTreeNodeService: DictionaryTreeNodeService) { }

  ngOnInit(): void {
    if(this.perentNodeId$ == -1) {
      this.dictionaryTreeNodeService.getRootNodes().subscribe(data => {
        this.dictionaryTreeNodes = data;
      })
    } else {
      this.dictionaryTreeNodeService.getChildNodes(this.perentNodeId$).subscribe(data => {
        this.dictionaryTreeNodes = data;
      })
    }
  }

}
