import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { RegistroComponent } from './modules/registro/registro.component';
import { EmpleadosService } from '../../Services/empleados.service';
import { ReactiveFormsModule } from '@angular/forms';


const routes: Routes = [

  {path:'', component:RegistroComponent }
];

@NgModule({
  declarations: [RegistroComponent],
  imports: [
    CommonModule,
    RouterModule.forChild(routes),
    HttpClientModule,
    ReactiveFormsModule


  ],
  providers: [EmpleadosService]
})
export class RegistroModule { }
