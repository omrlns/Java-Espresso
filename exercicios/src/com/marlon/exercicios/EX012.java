// leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano.
// a seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos;
// ou na origem (x = y = 0). se o ponto esitver na origem, escreva a mensagem "origem".
// se o ponto estiver sobre um dos eixos escreva "eixo x" ou "eixo y", conforme for a situação.

//    Y
// Q2 | Q1
// -- 0 -- X
// Q3 | Q4

package com.marlon.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EX012 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String local;
        double valorX, valorY;
        valorX = sc.nextDouble();
        valorY = sc.nextDouble();

        if (valorX == 0 && valorY == 0) {
            local = "NA ORIGEM.";
        }
        else if (valorX == 0) {
            local = "NO EIXO Y.";
        }
        else if (valorY == 0) {
            local = "NO EIXO X.";
        }
        else if (valorX > 0 && valorY > 0) {
            local = "NO QUADRANTE 1 (Q1).";
        }
        else if (valorX < 0 && valorY > 0) {
            local = "NO QUADRANTE 2 (Q2).";
        }
        else if (valorX < 0 && valorY < 0) {
            local = "NO QUADRANTE 3 (Q3).";
        }
        else {
            local = "NO QUADRANTE 4 (Q4).";
        }

        System.out.printf("O PONTO ESTÁ LOCALIZADO %s%n", local);
        sc.close();
    }
}
