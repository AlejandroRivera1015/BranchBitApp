import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { EmpleadosService } from '../../../../Services/empleados.service';

@Component({
  selector: 'app-eliminar',

  templateUrl: './eliminar.component.html',
  styleUrl: './eliminar.component.css'
})
export class EliminarComponent {

  _state :boolean = false;


  deleteForm = new FormGroup({
    param: new FormControl('', [Validators.required])
  })


  constructor(private empleadosServices : EmpleadosService) { }
  onSubmit() {

    if(this.deleteForm.valid){
      console.log("enviado");
      this.empleadosServices.borrarEmpleados(this.deleteForm.value.param).subscribe({
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
