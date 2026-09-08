package app;

import entities.Account;
import entities.BussinessAccount;
import entities.SavingsAccount;

public class Program {
    static void main() {
        Account acc = new Account(1001, "Alex", 0.0);

        BussinessAccount busAcc = new BussinessAccount(1002, "Maria", 0.0, 500.00);

        //Upcasting

        Account acc1 = busAcc;
        Account acc2 = new BussinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        //Downcasting

        BussinessAccount acc4 = (BussinessAccount) acc2;
        acc4.loan(100.00);

        // BussinessAccount acc5 = (BussinessAccount) acc3;
        if (acc3 instanceof BussinessAccount) {
            BussinessAccount acc5 = (BussinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
