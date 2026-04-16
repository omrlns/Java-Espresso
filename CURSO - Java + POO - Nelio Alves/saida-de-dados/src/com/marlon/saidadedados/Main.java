package com.marlon.saidadedados;

import java.util.Locale;

public class Main {
    public static void main (String[] args) {

        int valorA = 29;
        double altura = 1.80;
        double valorC = 3.1415;

        //System.out.println("olá mundo!");
        System.out.println(valorA);
        System.out.println(altura);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", valorC);
        System.out.printf("O Marlon tem %.2f metros de altura!%n", altura);

    }
}
