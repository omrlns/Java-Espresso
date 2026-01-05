package com.marlon.saidadedados;

import java.util.Locale;

public class Main {
    public static void main (String[] args) {

        int valorA = 29;
        double valorB = 1.80;
        double valorC = 3.1415;

        //System.out.println("olá mundo!");
        System.out.println(valorA);
        System.out.println(valorB);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", valorC);

    }
}
