package interface_comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import interface_comparable.entities.Employee;

public class programa {
    public static void main(String[] args) {        

        // programa 01
        List<String> list = new ArrayList<>();
        String path = "C:\\Users\\A47490596\\OneDrive - Deutsche Telekom AG\\Área de Trabalho\\Schulung\\Estudos\\Diversos\\praticas\\interface_comparable\\lista.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String name = br.readLine();
            while (name != null) {
                list.add(name);
                name = br.readLine();
            }
            Collections.sort(list);
            for (String s: list) {
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        // programa 02
        List<Employee> employees = new ArrayList<>();
        String caminho = "C:\\Users\\A47490596\\OneDrive - Deutsche Telekom AG\\Área de Trabalho\\Schulung\\Estudos\\Diversos\\praticas\\interface_comparable\\funcionario.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                employees.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            Collections.sort(employees);
            for (Employee e: employees) {
                System.out.println(e.getName() + " - " + e.getSalary());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
