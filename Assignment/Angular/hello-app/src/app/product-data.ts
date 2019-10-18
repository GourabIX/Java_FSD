import { Product } from './product';

export class ProductData {
    productList: Product[] = [
        {
            productId: 1001,
            name: 'mouse',
            brand: 'hp',
            price: 950.54
        }, 
        {
            productId: 1002,
            name: 'speaker',
            brand: 'sony',
            price: 95740.54
        },
        {
            productId: 1003,
            name: 'desktop',
            brand: 'dell',
            price: 94145.54
        }, 
        {
            productId: 1004,
            name: 'camera',
            brand: 'canon',
            price: 13500.54
        }
    ];

    getProductList(): Product[]
    {
        return this.productList;
    }
}
