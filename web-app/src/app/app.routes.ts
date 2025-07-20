import { Routes } from '@angular/router';

export const routes: Routes = [{
    path: 'studio',
    loadChildren: () => 
        import("./feature/studio/studio.module").then(module => module.StudioModule)
}, {
    path: '',
    redirectTo: '/studio/collection',
    pathMatch: 'full'
}];
