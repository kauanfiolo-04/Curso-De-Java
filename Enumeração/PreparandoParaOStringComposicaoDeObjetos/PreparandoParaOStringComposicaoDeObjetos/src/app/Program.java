package app;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    void main() {
        Locale.setDefault(Locale.US);

        Department dept = new Department("Design");

        Worker worker = new Worker("Alex", WorkerLevel.MID_LEVEL, 1200.0, dept);

        HourContract contract =
                new HourContract(LocalDate.of(2018, 8, 20), 50.0, 20);

        HourContract contract2 =
                new HourContract(LocalDate.of(2018, 6, 13), 30.0, 18);

        HourContract contract3 =
                new HourContract(LocalDate.of(2018, 8, 25), 80.0, 10);

        worker.addContract(contract);
        worker.addContract(contract2);
        worker.addContract(contract3);

        IO.println("Nome: " + worker.getName());
        IO.println("Departamento: " + worker.getDepartment().getName());
        IO.println("Ganho para 08/2018: " + String.format("%.2f", worker.income(2018, 8)));
    }
}
