package app;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;


public class Program {
    static void main() {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Interface implementation
        // list.removeIf(new ProductPredicate());

        // Reference method with static method
        // list.removeIf(Product::staticProductPredicate);

        // Reference method with non-static method
        // list.removeIf(Product::nonStaticProductPredicate);

        // Declared lambda expression
        // Predicate<Product> pred = p -> p.getPrice() >= 100.0;
        // list.removeIf(pred);

        // Inline lambda expression
        list.removeIf(p -> p.getPrice() >= 100.0);

        for (Product p: list) {
            System.out.println(p);
        }
    }
}
