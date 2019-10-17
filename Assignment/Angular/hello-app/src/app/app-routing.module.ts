import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { GreetingComponent } from './greeting/greeting.component';
import { ProductListComponent } from './product-list/product-list.component';
import { DatepickerTestComponent } from './datepicker-test/datepicker-test.component';
import { TimepickerTestComponent } from './timepicker-test/timepicker-test.component';
import { RatingTestComponent } from './rating-test/rating-test.component';
import { SwitchTestComponent } from './switch-test/switch-test.component';
import { PipeTestComponent } from './pipe-test/pipe-test.component';


const routes: Routes = [{path:'greet',component:GreetingComponent},
{path: 'product-list',component:ProductListComponent},
{path: 'date', component:DatepickerTestComponent},
{path: 'time', component:TimepickerTestComponent},
{path: 'rating', component:RatingTestComponent},
{path: 'switch', component:SwitchTestComponent},
{path: 'pipe', component:PipeTestComponent},
{path: '', redirectTo:'/greet', pathMatch: 'full'},
{path: '**', redirectTo:'/greet', pathMatch: 'full'}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
