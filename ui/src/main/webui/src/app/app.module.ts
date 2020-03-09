import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

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

@NgModule({
  declarations: [
    AppComponent,
    DictionaryTreeNodeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    MatToolbarModule,
    MatSidenavModule,
    MatListModule,
    MatButtonModule,
    MatIconModule,
    NgxGraphModule
  ],
  providers: [DictionaryTreeNodeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
