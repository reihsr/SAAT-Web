import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatButtonModule } from  '@angular/material/button';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatIconModule } from '@angular/material/icon';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatListModule } from '@angular/material/list';

import { NgxGraphModule } from '@swimlane/ngx-graph'

import { AppRoutingModule } from './app-routing.module';
import { DictionaryTreeNodeComponent } from './components/dictionary-tree-node/dictionary-tree-node.component';
import { DictionaryTreeNodeService } from './service/dictionary-tree-node.service';
import { DictionaryTeeNodeListComponent } from './components/dictionary-tee-node-list/dictionary-tee-node-list.component';
import { DiagnosisComponent } from './components/diagnosis/diagnosis.component';
import { DiagnosisListComponent } from './components/diagnosis-list/diagnosis-list.component';
import { MedicalTaggingComponent } from './components/medical-tagging/medical-tagging.component';
import {OverlayModule} from '@angular/cdk/overlay';
import { OverlayComponent } from './components/overlay/overlay.component';
import { JwPaginationModule } from 'jw-angular-pagination';

@NgModule({
  declarations: [
    AppComponent,
    DictionaryTreeNodeComponent,
    DictionaryTeeNodeListComponent,
    DiagnosisComponent,
    DiagnosisListComponent,
    MedicalTaggingComponent,
    OverlayComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    MatToolbarModule,
    MatSidenavModule,
    MatListModule,
    MatButtonModule,
    MatIconModule,
    NgxGraphModule,
    OverlayModule,
    JwPaginationModule
  ],
  providers: [DictionaryTreeNodeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
