package com.marlon.exercicios;

import java.util.Scanner;

public class EX007 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();

        if (valor % 2 == 0) {
            System.out.println("O NÚMERO É PAR!");
        } else {
            System.out.println("O NÚMERO É ÍMPAR!");
        }
        sc.close();
    }
}
