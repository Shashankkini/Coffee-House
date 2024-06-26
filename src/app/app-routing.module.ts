import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { MenuComponent } from './menu/menu.component';
import { ContactComponent } from './contact/contact.component';
import { SoldComponent } from './sold/sold.component';

const routes: Routes = [
  { path: '', redirectTo:'home' ,pathMatch:'full'},
  { path:'home' , component:HomeComponent},
  { path:'about' , component:AboutComponent},
  { path:'menu', component:MenuComponent},
  { path : 'contact', component:ContactComponent} ,  
  { path : 'sold', component:SoldComponent} ,  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
