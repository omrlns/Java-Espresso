// fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
// o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
// calcule e mostre o valor a ser pago.

package com.marlon.exercicios;

import java.util.Scanner;
import java.util.Locale;

public class EX005 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codPecaA, codPecaB, qntdPecaA, qntdPecaB;
        double valorPecaA, valorPecaB, total;

        codPecaA = sc.nextInt();
        qntdPecaA = sc.nextInt();
        valorPecaA = sc.nextDouble();
        codPecaB = sc.nextInt();
        qntdPecaB = sc.nextInt();
        valorPecaB = sc.nextDouble();

        total = (qntdPecaA * valorPecaA + qntdPecaB * valorPecaB);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

    }
}
