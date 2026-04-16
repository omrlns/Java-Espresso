// em um país imaginário denominado "lisarb", todos os habitantes ficam felizes em pagar seus impostos,
// pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população,
// sem qualquer desvio. a moeda deste país é o "rombus", cujo símbolo é o "R$".
// leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de "lisarb".
// em seguida, calcule e mostre o valor que está pessoa deve pagar de imposto de renda, segundo a tabela abaixo:
// de R$ 0.00 até R$ 2000.00 = isento
// de R$ 2000.01 até R$ 3000.00 = 8%
// de R$ 3000.01 até R$ 4500.00 = 18%
// acima de R$ 4500.00 = 28%
// lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00,
// pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de imposto de renda.
// no exemplo fornecido, a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R4 80.36 no total.
// o valor deve ser impresso com duas casas decimais.

package com.marlon.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EX013 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, imposto;
        salario = sc.nextDouble();

        if (salario <= 2000) {
            imposto = 0;
        }
        else if (salario > 2000 && salario <= 3000) {
            imposto = (salario - 2000) * 0.08;
        }
        else if (salario > 3000 && salario <= 4500) {
            imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
        }
        else {
            imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        }
        if (imposto > 0) {
            System.out.printf("VALOR DO IMPOSTO DE RENDA = R$ %.2f%n", imposto);
        }
        else {
            System.out.println("VOCÊ ESTÁ ISENTO DO IMPOSTO DE RENDA!");
        }

        sc.close();

    }
}
