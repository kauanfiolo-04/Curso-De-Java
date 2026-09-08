package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    static void main() {
        List<Integer> numbers = Arrays.asList(5, 2, 10);
        printList(numbers);

        List<String> strings = Arrays.asList("Maria", "Alex", "Bob");
        printList(strings);
    }

    public static void printList(List<?> list) {
//        list.add(3); da erro de compilação
        for (Object obj: list) {
            System.out.println(obj);
        }
    }
}
