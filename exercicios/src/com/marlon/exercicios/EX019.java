// leia um valor inteiro, que represente o número de casos de teste que vem a seguir.
// cada caso de teste consiste em 3 valores reais, cada um deles com uma casa decimal.
// apresente a média ponderada para cada um destes conjuntos de 3 valores,
// sendo que o primeiro valor tem tem peso 2, o segundo tem peso 3 e o terceiro tem peso 5.

package com.marlon.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EX019 {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int nCasos = sc.nextInt();

        for (int i = 0; i < nCasos; i++) {
            double valorA = sc.nextDouble();
            double valorB = sc.nextDouble();
            double valorC = sc.nextDouble();

            double mediaP = (valorA * 2 + valorB * 3 + valorC * 5) / 10;
            System.out.printf("%.1f%n", mediaP);
        }

        sc.close();

    }

}
