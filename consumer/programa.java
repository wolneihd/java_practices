package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import consumer.entities.Product;
import consumer.util.ProductConsumer;

public class programa {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 900.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD Case", 80.90));

        // Aula 197:

        // exemplo 01:
        list.forEach(new ProductConsumer());
        list.forEach(System.out::println);

        // exemplo 02:
        list.forEach(Product::staticProductPredicate);
        list.forEach(System.out::println);

        // exemplo 03:
        list.forEach(Product::nonStaticProductPredicate);
        list.forEach(System.out::println);

        // exemplo 04:
        Consumer<Product> consumer = p -> {
            p.setPrice(p.getPrice() * 1.1);
        };
        list.forEach(consumer);
        list.forEach(System.out::println);
    }
}
