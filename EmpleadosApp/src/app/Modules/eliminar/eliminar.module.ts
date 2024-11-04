import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EliminarComponent } from './components/eliminar/eliminar.component';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';
import { EmpleadosService } from '../../Services/empleados.service';


const routes: Routes = [

  {path:'', component:EliminarComponent }
];



@NgModule({
  declarations: [EliminarComponent],
  imports: [
    CommonModule,
    RouterModule.forChild(routes),
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [EmpleadosService] 
})
export class EliminarModule { }
