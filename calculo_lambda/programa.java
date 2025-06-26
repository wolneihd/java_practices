package calculo_lambda;

import java.util.ArrayList;
import java.util.List;

import calculo_lambda.entities.Product;

public class programa {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 900.00));
        list.add(new Product("Tablet", 450.00));

        // classe::método
        list.sort(programa::compareProduct);
        list.forEach(System.out::println);
    }

    public static int compareProduct(Product p1, Product p2) {
        return p1.getPrice().compareTo(p2.getPrice());
    }
}
