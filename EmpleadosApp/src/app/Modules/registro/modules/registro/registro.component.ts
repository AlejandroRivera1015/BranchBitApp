import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { EmpleadosService } from '../../../../Services/empleados.service';
import e from 'express';

@Component({
  selector: 'app-registro',

  templateUrl: './registro.component.html',
  styleUrl: './registro.component.css'
})
export class RegistroComponent {


  _state :boolean = false;

  RegistroForm = new FormGroup({
    nombre: new FormControl('', [Validators.required]),
    apellidoPaterno: new FormControl('', [Validators.required]),
    apellidoMaterno: new FormControl('', [Validators.required]),
    curp: new FormControl('', [Validators.required]),
    telefono: new FormControl('', [Validators.required])

  })

  constructor(private empleadosServices : EmpleadosService) { }

  onSubmit() {
    if(this.RegistroForm.valid){
      console.log("enviado");
      this.empleadosServices.saveEmpleado(this.RegistroForm.value).subscribe({
        next: (data) => {
          this._state = data;
        },
        error: (error) => {
          console.log(error);
        }
      });
      
    }
  }


}
