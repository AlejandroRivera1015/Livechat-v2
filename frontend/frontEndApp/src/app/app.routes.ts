import { Routes } from '@angular/router';


export const routes: Routes = [
    {
        path: 'login',
        loadChildren: () => import('./modules/log-in/log-in.module').then(m => m.LogInModule),
            
    }
];
