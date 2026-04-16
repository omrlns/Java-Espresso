// fazer um programa para ler quatro valores inteiros A, B, C e D.
// a seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D,
// segundo a fórmula: DIFERENCA = (A * B - C * D).

package com.marlon.exercicios;

import java.util.Scanner;

public class EX003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valorA, valorB, valorC, valorD, diferenca;

        valorA = sc.nextInt();
        valorB = sc.nextInt();
        valorC = sc.nextInt();
        valorD = sc.nextInt();

        diferenca = (valorA * valorB -  valorC * valorD);

        System.out.printf("Diferença = %d%n", diferenca);
    }
}
