import { Component, OnInit, Input, EventEmitter, Output } from '@angular/core';
import { Product } from '../product';

@Component({
  selector: 'app-product-notify',
  templateUrl: './product-notify.component.html',
  styleUrls: ['./product-notify.component.css']
})
export class ProductNotifyComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  @Input("parentData")
  product: Product

  @Output()
  notify=new EventEmitter;

  sendNotification()
  {
    this.notify.emit("Stephen will be notified if Charan agrees.");
  }

}
