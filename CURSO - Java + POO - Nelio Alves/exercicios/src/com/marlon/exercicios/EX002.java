// faça um programa para ler o valor do raio de um círculo,
// e depois mostrar o valor da área deste círculo com quatro casas decimais.

package com.marlon.exercicios;

import java.util.Scanner;
import java.util.Locale;

public class EX002 {
    public static void main(String[] args) {

        // fórmula da área: area = 3.14159 (pi) * raio²

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, area;

        raio = sc.nextDouble();
        area = 3.14159 * Math.pow(raio, 2);

        System.out.printf("Área = %.4f%n", area);
    }
}
