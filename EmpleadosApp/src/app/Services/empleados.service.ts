import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Empleado } from '../Interfaces/empleado';

@Injectable({
  providedIn: 'root'
})
export class EmpleadosService {

  constructor(private http: HttpClient) { }



  saveEmpleado(empleado: any): Observable<boolean> {
    return this.http.post<boolean>('http://localhost:8080/empleados/save', empleado);
  }


 

  findEmpleados2(param: any): Observable<any> {
    return this.http.post<Empleado[]>('http://localhost:8080/empleados/findby2',param);

  }

  borrarEmpleados(param: any): Observable<boolean> {
    return this.http.post<boolean>('http://localhost:8080/empleados/delete',param);

  }
 


  
  }

