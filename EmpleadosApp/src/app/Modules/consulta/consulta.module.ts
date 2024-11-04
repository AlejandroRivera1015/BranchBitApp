import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';
import { ConsultaComponent } from './components/consulta/consulta.component';
import { ReactiveFormsModule } from '@angular/forms';
import { EmpleadosService } from '../../Services/empleados.service';


const routes: Routes = [

  {path:'', component:ConsultaComponent }
];


@NgModule({
  declarations: [ConsultaComponent],
  imports: [
    CommonModule, 
    HttpClientModule,
    RouterModule.forChild(routes),
    ReactiveFormsModule

  ],
  providers: [EmpleadosService]
})
export class ConsultaModule { }
