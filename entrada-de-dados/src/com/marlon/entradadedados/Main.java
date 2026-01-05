package com.marlon.entradadedados;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        double altura;
        char sexo;

        nome = sc.next();
        idade = sc.nextInt();
        altura = sc.nextDouble();
        sexo = sc.next().charAt(0);

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(sexo);

        sc.close();

    }
}
