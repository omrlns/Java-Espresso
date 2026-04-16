// leia um valor inteiro. em seguida mostre os ímpares de 1 até X.

package com.marlon.exercicios;

import java.util.Scanner;

public class EX017 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int valorX = sc.nextInt();

        for (int i = 0; i <= valorX; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();

    }
}
