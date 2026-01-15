package com.marlon.repetitiva;

import java.util.Scanner;

public class For {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int nValores = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < nValores; i++) {
            int valorX = sc.nextInt();
            soma += valorX;
        }


        System.out.printf("A SOMA DOS VALORES DIGITADOS É: %d", soma);
        sc.close();

    }
}
