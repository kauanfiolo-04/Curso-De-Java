package app;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    static void main() {
        File file =
                new File("C:\\Users\\Kauan\\Documents\\Java\\Curso\\Trabalhando com Arquivos\\FIle_Scanner\\in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if(sc != null) sc.close();
        }
    }
}
