package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import predicate.entities.Product;
import predicate.util.ProductPredict;

public class programa {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 900.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD Case", 80.90));

        // Aula 196:

        // opcao 01:
        list.removeIf(p -> p.getPrice() < 100);
        for (Product p : list) {
            System.out.println(p.toString());
        }

        // opcao 02:
        list.removeIf(new ProductPredict());
        for (Product p : list) {
            System.out.println(p.toString());
        }

        // opcao 03:
        list.removeIf(Product::staticProductPredicate);
        for (Product p : list) {
            System.out.println(p.toString());
        }

        // opcao 04:
        list.removeIf(Product::nonStaticProductPredicate);
        for (Product p : list) {
            System.out.println(p.toString());
        }

        // opcao 05:
        Predicate<Product> pred = p -> !(p.getPrice() >= 500);
        list.removeIf(pred);
        for (Product p : list) {
            System.out.println(p.toString());
        }

        // opcao 06:
        list.removeIf(p -> !(p.getPrice() >= 500));
        for (Product p : list) {
            System.out.println(p.toString());
        }
    }
}
