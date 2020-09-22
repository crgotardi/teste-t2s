import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ContainersComponent } from './components/containers/containers.component';
import { FormComponent } from './components/containers/form/form.component';
import { HandlingsComponent } from './components/handlings/handlings.component';
import { HandlingFormComponent } from './components/handlings/handling-form/handling-form.component';


const routes: Routes = [
  { path: 'containers', component: ContainersComponent },
  { path: 'containers/new', component: FormComponent},
  { path: 'containers/:id/edit', component: FormComponent },
  { path: 'handlings', component: HandlingsComponent },
  { path: 'handlings/new', component: HandlingFormComponent},
  { path: 'handlings/:id/edit', component: HandlingFormComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }