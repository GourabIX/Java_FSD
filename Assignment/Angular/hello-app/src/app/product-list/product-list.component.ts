import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductData } from '../product-data';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  // products: Product[] = new ProductData().getProductList();
  products: Product[];
  selectedProduct: Product;
  childData: string;

  constructor(private productService: ProductService) { }

  ngOnInit() {
    this.productService.getProducts().subscribe(responseData=>
      {
        this.products = responseData;
      });
  }

  onSelect(product: Product)
  {
    this.selectedProduct = product;
  }

  share()
  {
    window.alert("This product has been shared.")
  }

  notifyUser(event)
  {
    window.alert(event);
    this.childData=event;
  }

}
