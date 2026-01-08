// faça um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos:
// ([0, 25], [25, 50], [50, 75], [75, 100]) este valor se encontra.
// obviamente se o valor não estiver em nenhum desses intervalos, deverá ser impressa a mensagem "fora do intervalo".

package com.marlon.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EX011 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();

        if (valor > 0 && valor <= 25) {
            System.out.println("O VALOR ESTÁ NO INTERVALO [0, 25]");
        }
        else if (valor > 25 && valor <= 50) {
            System.out.println("O VALOR ESTÁ NO INTERVALO [25, 50]");
        }
        else if (valor > 50 && valor <= 75) {
            System.out.println("O VALOR ESTÁ NO INTERVALO [50, 75]");
        }
        else if (valor > 75 && valor <= 100) {
            System.out.println("O VALOR ESTÁ NO INTERVALO [75, 100]");
        }
        else {
            System.out.println("O VALOR ESTÁ FORA DOS INTERVALOS!");
        }

        sc.close();

    }

}
