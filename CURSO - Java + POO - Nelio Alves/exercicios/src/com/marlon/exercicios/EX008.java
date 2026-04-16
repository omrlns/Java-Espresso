// leia 2 valores inteiros (A e B).
// após, o programa deve mostrar uma mensagem dizendo se são múltiplos ou não,
// indicando se os valores são múltiplos entre si.
// atenção: os números devem poder ser digitados em ordem crescente ou decrescente.

package com.marlon.exercicios;

import java.util.Scanner;

public class EX008 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valorA = sc.nextInt();
        int valorB = sc.nextInt();

        if (valorA % valorB == 0 || valorB % valorA == 0) {
            System.out.println("OS VALORES SÃO MÚLTIPLOS!");
        } else {
            System.out.println("OS VALORES NÃO SÃO MÚLTIPLOS!");
        }
        sc.close();
    }
}
