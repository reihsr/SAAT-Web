import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DictionaryTreeNodeComponent } from './components/dictionary-tree-node/dictionary-tree-node.component'
import { DictionaryTeeNodeListComponent } from './components/dictionary-tee-node-list/dictionary-tee-node-list.component';
import { DiagnosisListComponent } from './components/diagnosis-list/diagnosis-list.component';
import { MedicalTaggingComponent } from './components/medical-tagging/medical-tagging.component';


const routes: Routes = [
  { path: '', component: DictionaryTeeNodeListComponent },
  { path: 'diagnosis', component: DiagnosisListComponent },
  { path: 'tagging', component: MedicalTaggingComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
