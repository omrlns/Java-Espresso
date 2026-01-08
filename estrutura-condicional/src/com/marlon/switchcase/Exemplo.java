package com.marlon.switchcase;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        String dia = switch (valor) {
            case 1 -> "DOMINGO.";
            case 2 -> "SEGUNDA-FEIRA.";
            case 3 -> "TERÇA-FEIRA.";
            case 4 -> "QUARTA-FEIRA.";
            case 5 -> "QUINTA-FEIRA.";
            case 6 -> "SEXTA-FEIRA.";
            case 7 -> "SÁBADO.";
            default -> "VALOR INVÁLIDO!";
        };

        System.out.printf("O NÚMERO '%d' FAZ REFERÊNCIA AO SEGUINTE DIA DA SEMANA: %s", valor, dia);

        sc.close();
    }
}
