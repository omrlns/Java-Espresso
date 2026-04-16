// fazer um programa para ler um número inteiro "n" positivo.
// o programa deve então mostrar na tela "n" linhas, começando de 1 até "n".
// para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor.

package com.marlon.exercicios;

import java.util.Scanner;

public class EX023 {
        public static void main (String[] args) {

            Scanner sc = new Scanner(System.in);

            int numero = sc.nextInt();

            for (int i = 1; i <= numero; i++) {
                int quadrado = i * i;
                int cubo = i * i * i;

                System.out.printf("%d %d %d%n", i, quadrado, cubo);
            }

            sc.close();

        }
}
