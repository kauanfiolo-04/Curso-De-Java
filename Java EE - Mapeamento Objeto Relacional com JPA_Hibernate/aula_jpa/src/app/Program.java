package app;

import domain.Pessoa;

public class Program {
    static void main() {
        Pessoa p1 = new Pessoa(1, "Carlos da Silva", "carlos@gmail.com");
        Pessoa p2 = new Pessoa(2, "Joaquim Torres", "joaquim@gmail.com");
        Pessoa p3 = new Pessoa(3, "Ana Maria", "ana_maria@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
