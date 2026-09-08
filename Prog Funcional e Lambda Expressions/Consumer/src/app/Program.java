package app;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Program {
    static void main() {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Interface implementation
        // list.forEach(new PriceUpdate());

        // Reference method with static method
        // list.forEach(Product::staticPriceUpdate);

        // Reference method with non-static method
        // list.forEach(Product::nonStaticPriceUpdate);

        // Declared lambda expression
        // Consumer<Product> cons = p -> {
        //   p.setPrice(p.getPrice() * 1.1);
        // };
        // list.forEach(cons);

        // Inline lambda expression
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        list.forEach(System.out::println);
    }
}
