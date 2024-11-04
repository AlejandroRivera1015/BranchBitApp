import { Routes } from '@angular/router';

export const routes: Routes = [
    {
        path: 'registro',
        loadChildren: ()=> import('./Modules/registro/registro.module').then(m => m.RegistroModule)
    },
    {
        path: 'consulta',
        loadChildren: ()=> import('./Modules/consulta/consulta.module').then(m => m.ConsultaModule)
    },

    {
        path: 'borrar',
        loadChildren: ()=> import('./Modules/eliminar/eliminar.module').then(m => m.EliminarModule)
    },
];
