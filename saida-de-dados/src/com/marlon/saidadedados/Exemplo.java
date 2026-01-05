package com.marlon.saidadedados;

import java.util.Locale;

public class Exemplo {
    public static void main(String[] args) {

        String nome = "Marlon";
        int idade = 22;
        double renda = 2000.0;

        // %f = ponto flutuante
        // %d = inteiro
        // %s = texto
        // %n = quebra de linha

        Locale.setDefault(Locale.US);
        System.out.printf("%s tem %d anos e ganha R$%.2f%n", nome, idade, renda);
    }
}