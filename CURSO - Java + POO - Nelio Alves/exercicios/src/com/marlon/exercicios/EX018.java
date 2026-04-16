// leia um valor inteiro. este valor será a quantidade de valores inteiros que serão lidos em seguida.
// mostre quantos desse valores estão dentro do intervalo [10, 20] e quantos estão fora do intervalo,
// mostrando "in" para dentro e "out" para fora do intervalo.

package com.marlon.exercicios;

import java.util.Scanner;

public class EX018 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidade = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < quantidade; i++) {
            int valorX = sc.nextInt();
            if (valorX >= 10 && valorX <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.printf("%d IN%n", in);
        System.out.printf("%d OUT", out);
        sc.close();
    }
}
