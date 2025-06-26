package function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import function.entities.Product;
import function.util.UpperCaseName;

public class programa {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 900.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD Case", 80.90));

        // Aula 198:

        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        names.forEach(System.out::println);

        List<String> listNames = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
        listNames.forEach(System.out::println);

        List<String> listaNomes = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
        listaNomes.forEach(System.out::println);

        Function<Product, String> function = p -> p.getName().toUpperCase();
        List<String> lista = list.stream().map(function).collect(Collectors.toList());
        lista.forEach(System.out::println);
    }
}
