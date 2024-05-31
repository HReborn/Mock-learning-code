import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ManualComponent } from './manual-component/manual-component.component';

@NgModule ({
	declarations: [
	               AppComponent,
	               ManualComponent
	               ],
	imports: [ BrowseModule ],
	bootstrap: [ AppComponent ]
)}

export class AppModule { }