// faça um programa para ler dois valores inteiros,
// e depois mostrar na tela a soma desses números com uma mensagem explicativa.

package com.marlon.exercicios;

import java.util.Scanner;

public class EX001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valorA, valorB, soma;

        valorA = sc.nextInt();
        valorB = sc.nextInt();

        soma = valorA + valorB;

        System.out.printf("SOMA = %d%n", soma);
    }
}
