// fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora
// e calcular o salário desse funcionário. a seguir, mostre o número e o salário do funcionário com duas casas decimais.

package com.marlon.exercicios;

import java.util.Scanner;
import java.util.Locale;

public class EX004 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codFuncionario;
        double horasTrabalhadas, valorHora, salario;

        codFuncionario = sc.nextInt();
        horasTrabalhadas = sc.nextDouble();
        valorHora = sc.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.printf("NUMBER = %d%n", codFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

    }
}
