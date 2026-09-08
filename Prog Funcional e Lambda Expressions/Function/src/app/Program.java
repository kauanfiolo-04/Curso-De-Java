package app;

import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    static void main() {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Interface implementation
        // List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        // Reference method with static method
        // List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        // Reference method with non-static method
        // List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        // Declared lambda expression
        // Function<Product, String> func = p -> p.getName().toUpperCase();
        // List<String> names = list.stream().map(func).collect(Collectors.toList());

        // Inline lambda expression
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
