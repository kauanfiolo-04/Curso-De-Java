package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("Beatriz");
        list.add("Linda");
        list.add("Popoi?");
        list.add("!");
        list.add("Bob");

        list.add(2, "Gata");

        System.out.println("Tamanho da lista: " + list.size());

        for (String x: list) {
            System.out.println(x);
        }

        System.out.println("--------------------------");

        list.remove("!");

        list.remove(2);

        list.removeIf(x -> x.charAt(0) == 'P');

        for (String x: list) {
            System.out.println(x);
        }

        System.out.println("--------------------------");

        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("--------------------------");

        List<String> result = list.stream().
                filter(item -> item.charAt(0) == 'B').
                collect(Collectors.toList());

        System.out.println("Only with 'B' letter: ");

        for (String x: result) {
            System.out.println(x);
        }

        System.out.println("--------------------------");

        String name = list.stream().
                filter(item -> item.charAt(0) == 'B').
                findFirst().orElse(null);

        System.out.println(name);
    }
}
