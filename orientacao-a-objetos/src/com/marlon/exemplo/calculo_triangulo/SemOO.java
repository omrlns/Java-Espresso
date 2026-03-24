// fazer um programa para ler as medidas dos lados de dois triângulos x e y (suponha medidas válida)
// em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possuir a maior área.
// a fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b, c é a seguinte:
// (fórmula de heron): area = raiz de p(p-a)(p-b)(p-c) onde p = a+b+c / 2

package com.marlon.exemplo.calculo_triangulo;

import java.util.Locale;
import java.util.Scanner;

public class SemOO {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double ladoXA, ladoXB, ladoXC, ladoYA, ladoYB, ladoYC;

        System.out.println("informe as medidas do triângulo x: ");
        ladoXA = sc.nextDouble();
        ladoXB = sc.nextDouble();
        ladoXC = sc.nextDouble();
        System.out.println("informe as medidas do triângulo y: ");
        ladoYA = sc.nextDouble();
        ladoYB = sc.nextDouble();
        ladoYC = sc.nextDouble();

        double p = (ladoXA + ladoXB + ladoXC) / 2;
        double areaX = Math.sqrt(p * (p - ladoXA) * (p - ladoXB) * (p - ladoXC));

        p = (ladoYA + ladoYB + ladoYC) / 2;
        double areaY = Math.sqrt(p * (p - ladoYA) * (p - ladoYB) * (p - ladoYC));

        System.out.printf("Área do Triângulo X: %.4f%n", areaX);
        System.out.printf("Área do Triângulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("A MAIOR ÁREA É DO TRIÂNGULO X.");
        }
        else {
            System.out.println("A MAIOR ÁREA É DO TRIÂNGULO Y.");
        }

        sc.close();

    }

}
