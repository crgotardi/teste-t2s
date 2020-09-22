import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ContainersComponent } from './components/containers/containers.component';
import { FormComponent } from './components/containers/form/form.component';
import { HandlingsComponent } from './components/handlings/handlings.component';
import { HandlingFormComponent } from './components/handlings/handling-form/handling-form.component';

@NgModule({
  declarations: [
    AppComponent,
    ContainersComponent,
    FormComponent,
    HandlingsComponent,
    HandlingFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
