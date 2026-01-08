package com.marlon.ifelse;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        String dia;

        if (valor == 1) {
            dia = "DOMINGO.";
        } else if (valor == 2) {
            dia = "SEGUNDA-FEIRA.";
        } else if (valor == 3) {
            dia = "TERÇA-FEIRA.";
        } else if (valor == 4) {
            dia = "QUARTA-FEIRA.";
        } else if (valor == 5) {
            dia = "QUINTA-FEIRA.";
        } else if (valor == 6) {
            dia = "SEXTA-FEIRA.";
        } else if (valor == 7) {
            dia = "SÁBADO.";
        } else {
            dia = "VALOR INVÁLIDO!";
        }

        System.out.printf("O NÚMERO '%d' FAZ REFERÊNCIA AO SEGUINTE DIA DA SEMANA: %s", valor, dia);

        sc.close();

    }
}
