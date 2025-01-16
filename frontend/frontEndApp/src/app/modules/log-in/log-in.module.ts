import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Route, RouterModule, Routes } from '@angular/router';
import { LogInHomePageComponent } from './components/log-in-home-page/log-in-home-page.component';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

const routes : Routes = [
  {
    path: '',
    component: LogInHomePageComponent
  }
];


@NgModule({
  declarations: [LogInHomePageComponent],
  imports:[CommonModule,RouterModule.forChild(routes),ReactiveFormsModule,HttpClientModule],


})
export class LogInModule { }
