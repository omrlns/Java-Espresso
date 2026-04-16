//fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

package com.marlon.exercicios;

import java.util.Scanner;

public class EX006 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();

        if (valor < 0) {
            System.out.println("O NÚMERO É NEGATIVO!");
        } else {
            System.out.println("O NÚMERO É POSITIVO!");
        }
        sc.close();
    }
}
