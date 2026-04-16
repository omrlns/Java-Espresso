// ler um valor n. calcular e escrever o seu respectivo fatorial.
// fatorial de n = n * (n - 1) * (n - 2) * (n - 3) * ... * 1.
// lembrando que, por definição, fatorial de 0 é 1.

package com.marlon.exercicios;

import java.util.Scanner;

public class EX021 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("INFORME UM NÚMERO PARA SABER O SEU FATORIAL: ");
        int numero = sc.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        if (numero > 1) {
            System.out.print(numero);

            for (int i = numero - 1; i >= 1; i--) {
                System.out.print(" x " + i);
            }

            System.out.println(" =  " + fatorial);

        } else {
            System.out.println(numero + " = " + fatorial);
        }

        sc.close();

    }
}
