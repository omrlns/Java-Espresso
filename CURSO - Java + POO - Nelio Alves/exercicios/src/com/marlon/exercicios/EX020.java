// faça um programa para ler um número n. depois leia n pares de números,
// e mostre a divisão do primeiro pelo segundo. se o denominador for 0, mostre a mensagem "divisão impossível".

package com.marlon.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EX020 {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int nPares = sc.nextInt();

        for (int i = 0; i < nPares; i++) {
            int numerador = sc.nextInt();
            int denominador = sc.nextInt();
            if (denominador != 0) {
                double divisao = (double) numerador / denominador;
                System.out.println(divisao);
            } else {
                System.out.println("DIVISÃO IMPOSSÍVEL!");
            }
        }

        sc.close();

    }
}
