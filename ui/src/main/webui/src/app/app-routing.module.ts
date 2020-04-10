import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DictionaryTreeNodeComponent } from './components/dictionary-tree-node/dictionary-tree-node.component'
import { DictionaryTeeNodeListComponent } from './components/dictionary-tee-node-list/dictionary-tee-node-list.component';


const routes: Routes = [
  { path: '', component: DictionaryTeeNodeListComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
