// ler um número inteiro e calcular todos os seus divisores.

package com.marlon.exercicios;

import java.util.Scanner;

public class EX022 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("INFORME UM NÚMERO PARA SABER OS SEUS DIVISORES: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();

    }
}
