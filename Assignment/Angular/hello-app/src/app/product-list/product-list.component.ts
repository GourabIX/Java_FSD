import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductData } from '../product-data';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products: Product[] = new ProductData().getProductList();
  selectedProduct: Product;

  constructor() { }

  ngOnInit() {
  }

  onSelect(product: Product)
  {
    this.selectedProduct = product;
  }

  share()
  {
    window.alert("This product has been shared.")
  }

  notifyUser()
  {
    window.alert("Stephen will be notified.");
  }

}
