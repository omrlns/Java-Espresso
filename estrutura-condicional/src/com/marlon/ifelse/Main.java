package com.marlon.ifelse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Que horas são? (sem os minutos)");
        int horas = sc.nextInt();

        if (horas >= 5 && horas <= 12) {
            System.out.println("Bom dia!");
        } else {
            if (horas > 12 && horas <= 18) {
                System.out.println("Boa tarde!");
            } else {
                System.out.println("Boa noite!");
            }
        }
        sc.close();
    }
}
