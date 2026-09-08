package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();

            products[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += products[i].getPrice();
        }

        double avg = sum / n;

        System.out.printf("Average price = $%.2f%n", avg);

        sc.close();
    }
}
