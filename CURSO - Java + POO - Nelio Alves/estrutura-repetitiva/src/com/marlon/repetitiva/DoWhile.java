package com.marlon.repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resposta;

        do {
            System.out.print("DIGITE A TEMPERATURA EM CELSIUS: ");
            double celsius = sc.nextDouble();
            double fahrenheit = (9 * celsius / 5) + 32;

            System.out.printf("EQUIVALENTE EM FAHRENHEIT: %.1f%n", fahrenheit);
            System.out.print("DESEJA REPETIR (S/N)? ");
            resposta = sc.next().charAt(0);
        } while (resposta != 'N' || resposta != 'n');

        sc.close();

    }
}
