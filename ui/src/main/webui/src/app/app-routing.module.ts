import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DictionaryTreeNodeComponent } from './components/dictionary-tree-node/dictionary-tree-node.component'


const routes: Routes = [
  { path: '', component: DictionaryTreeNodeComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
