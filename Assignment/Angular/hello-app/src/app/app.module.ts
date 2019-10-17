import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GreetingComponent } from './greeting/greeting.component';
import { FooterComponent } from './footer/footer.component';
import { ProductListComponent } from './product-list/product-list.component';
import { FormsModule } from '@angular/forms';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { ProductNotifyComponent } from './product-notify/product-notify.component';
import { PipeTestComponent } from './pipe-test/pipe-test.component';
import { DatepickerTestComponent } from './datepicker-test/datepicker-test.component';
import { TimepickerTestComponent } from './timepicker-test/timepicker-test.component';
import { RatingTestComponent } from './rating-test/rating-test.component';
import { SwitchTestComponent } from './switch-test/switch-test.component';

@NgModule({
  declarations: [
    AppComponent,
    GreetingComponent,
    FooterComponent,
    ProductListComponent,
    ProductNotifyComponent,
    PipeTestComponent,
    DatepickerTestComponent,
    TimepickerTestComponent,
    RatingTestComponent,
    SwitchTestComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
