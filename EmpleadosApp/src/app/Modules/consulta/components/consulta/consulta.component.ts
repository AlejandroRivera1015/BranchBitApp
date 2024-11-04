import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { EmpleadosService } from '../../../../Services/empleados.service';
import { Empleado } from '../../../../Interfaces/empleado';

@Component({
  selector: 'app-consulta',

  templateUrl: './consulta.component.html',
  styleUrl: './consulta.component.css'
})
export class ConsultaComponent {

  public  empleados : Empleado[] =[];


  consultaForm = new FormGroup({
    param: new FormControl('', [Validators.required])
  })

  constructor(private empledosServices : EmpleadosService) { }

  onSubmit() {  

    if(this.consultaForm.valid){
      console.log(this.consultaForm.value);


      this.empledosServices.findEmpleados2(this.consultaForm.value).subscribe({
        next: (data) => {
          console.log(`la datad es ${data}`);

          this.empleados = data;

        }
      }); 


  }


}
}