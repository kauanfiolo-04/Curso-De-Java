package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    static void main() {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();

        LocalDateTime d02 = LocalDateTime.now();

        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2026-10-29");

        LocalDateTime d05 = LocalDateTime.parse("2026-10-29T01:30:26");

        Instant d06 = Instant.parse("2026-10-29T01:30:26Z");

        Instant d07 = Instant.parse("2026-10-29T01:30:26-03:00");

        LocalDate d08 = LocalDate.parse("20/07/2026", fmt1);

        LocalDateTime d09 = LocalDateTime.parse("20/07/2026 01:30", fmt2);

        LocalDateTime d10 = LocalDateTime.of(2026, 7, 20, 1, 30);

        System.out.println(d01);

        System.out.println(d02);

        System.out.println(d03);

        System.out.println(d04);

        System.out.println(d05);

        System.out.println(d06);

        System.out.println(d07);

        System.out.println(d08);

        System.out.println(d09);

        System.out.println(d10);

        System.out.println("---------------------------------- --------------------------------");

        System.out.println(d04.format(fmt1));
        System.out.println(fmt1.format(d04));

        System.out.println("---------------------------------- --------------------------------");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());

        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));

        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());

        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println(r1);

        System.out.println(r2);

        System.out.println(r3);

        System.out.println(r4);
    }
}
