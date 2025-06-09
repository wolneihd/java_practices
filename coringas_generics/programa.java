package coringas_generics;

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

    }
}
