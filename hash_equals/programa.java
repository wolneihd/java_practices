package hash_equals;

import hash_equals.entities.Customer;

public class programa {
    public static void main(String[] args) {

        // Exemplo 01
        String a = "Maria";
        String b = "Alex";

        System.out.println(a.equals(b));

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        System.out.println(a.hashCode() == b.hashCode());

        // Exemplo 02
        Customer c1 = new Customer("Maria", "maria@gmail.com"); 
        Customer c2 = new Customer("Alex", "alex@gmail.com"); 

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
    }
}
