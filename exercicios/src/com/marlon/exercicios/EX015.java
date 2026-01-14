// escreva um programa para ler as coordenadas (X, Y) de uma quantidade indeterminada de pontos no sistema cartesiano.
// para cada ponto, escrever o quadrante que ele pertence.
// o algoritmo será encerrado quando pelo menos uma de suas coordenadas for NULA,
// nessa situação, sem escrever mensagem alguma.

//    Y
// Q2 | Q1
// -- 0 -- X
// Q3 | Q4

package com.marlon.exercicios;

import java.util.Scanner;

public class EX015 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valorX = sc.nextInt();
        int valorY = sc.nextInt();

        while (valorX != 0 && valorY != 0) {
            if (valorX > 0 && valorY > 0) {
                System.out.println("O PONTO ESTÁ LOCALIZADO NO QUADRANTE 1 (Q1).");
            } else if (valorX < 0 && valorY > 0) {
                System.out.println("O PONTO ESTÁ LOCALIZADO NO QUADRANTE 2 (Q2).");
            } else if (valorX < 0 && valorY < 0) {
                System.out.println("O PONTO ESTÁ LOCALIZADO NO QUADRANTE 3 (Q3).");
            } else {
                System.out.println("O PONTO ESTÁ LOCALIZADO NO QUADRANTE 4 (Q4).");
            }

            valorX = sc.nextInt();
            valorY = sc.nextInt();
        }

        sc.close();

    }
}
