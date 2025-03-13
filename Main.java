package praktic.geometry.mains;

import praktic.geometry.shapes.Circle;
import java.util.Scanner;

public class Main {
    private static String BLUE = "\033[0;34m";
    private static String WHITE = "\u001B[0m";


    // Method untuk mencetak garis pemisah
    public static void printGaris() {
        System.out.println(BLUE + "===========================================" + WHITE);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();

        printGaris();
        System.out.println("Nama : Naufaldi Alfaghani");
        System.out.println("NIM  : 245150707111034");
        printGaris();
        System.out.println("Circle");
        printGaris();

        // Input dari pengguna
        System.out.print("Isikan ID      : ");
        circle.setId(scanner.nextInt());
        System.out.print("Isikan Radius  : ");
        circle.setRadius(scanner.nextDouble());

        printGaris();
        circle.printDeskripsi();
        printGaris();

        scanner.close();
    }
}