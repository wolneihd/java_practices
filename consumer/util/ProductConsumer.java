package consumer.util;

import java.util.function.Consumer;

import consumer.entities.Product;

public class ProductConsumer implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
    
}
