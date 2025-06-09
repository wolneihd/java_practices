package coringas_generics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import coringas_generics.entities.Circle;
import coringas_generics.entities.Product;
import coringas_generics.entities.Rectangule;
import coringas_generics.entities.Shape;
import coringas_generics.services.CalculationService;
import coringas_generics.services.PrintServiceObject;

public class programa {
    public static void main(String[] args) {

        // Exemplo 01 - Aula 179
        PrintServiceObject<Integer> ps = new PrintServiceObject<>();

        ps.addValue(10);
        ps.addValue(15);
        ps.addValue(20);

        ps.print();
        Integer x = (Integer) ps.first();
        System.out.println("First: " + x);

        // Exemplo 02 - Aula 180
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        String path = "C:\\Users\\A47490596\\OneDrive - Deutsche Telekom AG\\Área de Trabalho\\Schulung\\Estudos\\Diversos\\java_practices\\coringas_generics\\file\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product a = CalculationService.max(list);
            System.out.println("Most expensive:");
            System.out.println(a);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Exemplo 03 - Aula 181
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        List<String> myStrings = Arrays.asList("Maria", "José", "Pedro");
        printList(myInts);
        printList(myStrings);

        // Exemplo 04 - Aula 182
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangule(3.0, 2.0));
        myShapes.add(new Circle(2.0));
        System.out.println("Total area: " + totalArea(myShapes));
    }

    public static void printList(List<?> list) {
        for (Object obj: list) {
            System.out.println(obj);
        }
    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s: list) {
            sum += s.area();
        }
        return sum;
    }
}
