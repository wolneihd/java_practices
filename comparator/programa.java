package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import comparator.entities.MyComparator;
import comparator.entities.Product;

public class programa {
    public static void main(String[] args) {
        
        // Exemplo 01
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 900.00));
        list.add(new Product("Tablet", 450.00));

        list.sort(new MyComparator());

        for (Product p: list) {
            System.out.println(p.toString());
        }

        // Exemplo 02
        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }            
        };
        list.sort(comp);

        // Exemplo 03
        Comparator<Product> compLambda = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        list.sort(compLambda);

    }
    
}
