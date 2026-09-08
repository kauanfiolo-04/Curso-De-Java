package app;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Amount: ");
        double amount = sc.nextDouble();

        System.out.println("Months: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.printf("%.2f", payment);

        InterestService is2 = new UsaInterestService(2.0);
        double payment2 = is2.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.printf("%.2f", payment2);

        sc.close();
    }
}
