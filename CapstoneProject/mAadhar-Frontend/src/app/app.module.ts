import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { LoginComponent } from './auth/login/login.component';
import { SignupComponent } from './auth/signup/signup.component';
import { AdminDashboardComponent } from './component/admin-dashboard/admin-dashboard.component';
import { AllAadharComponent } from './component/all-aadhar/all-aadhar.component';
import { ApplyAadharComponent } from './component/apply-aadhar/apply-aadhar.component';
import { UpdateAadharComponent } from './component/update-aadhar/update-aadhar.component';
import { UserDashboardComponent } from './component/user-dashboard/user-dashboard.component';

@NgModule({
  declarations: [
    AppComponent,
    
    LoginComponent,
    SignupComponent,
    AdminDashboardComponent,
  
    AllAadharComponent,
    ApplyAadharComponent,
    UpdateAadharComponent,
    UserDashboardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
