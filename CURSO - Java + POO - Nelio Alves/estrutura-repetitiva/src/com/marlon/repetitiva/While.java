package com.marlon.repetitiva;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("INFORME UM NÚMERO:");
        int valorX = sc.nextInt();
        int soma = 0;

        while (valorX != 0) {
            soma += valorX;
            System.out.println("INFORME UM OUTRO NÚMERO:");
            valorX = sc.nextInt();
        }

        System.out.printf("SOMA DOS NÚMEROS DIGITADOS = %d", soma);

        sc.close();

    }
}
