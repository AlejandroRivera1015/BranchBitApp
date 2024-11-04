import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ConsultaModule } from './Modules/consulta/consulta.module';
import { RegistroModule } from './Modules/registro/registro.module';
import { EliminarModule } from './Modules/eliminar/eliminar.module';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,ConsultaModule,RegistroModule, EliminarModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'EmpleadosApp';
}
