import { Product } from './product';

export class ProductData {
    productList: Product[] = [
        {
            id: 1001,
            name: 'mouse',
            brand: 'hp',
            price: 950.54
        }, 
        {
            id: 1002,
            name: 'speaker',
            brand: 'sony',
            price: 95740.54
        },
        {
            id: 1003,
            name: 'desktop',
            brand: 'dell',
            price: 94145.54
        }, 
        {
            id: 1004,
            name: 'desktop',
            brand: 'dell',
            price: 94145.54
        }
    ];

    getProductList(): Product[]
    {
        return this.productList;
    }
}
