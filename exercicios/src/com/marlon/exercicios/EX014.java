// escreva um programa que repita a leitura de uma senha até que ela seja válida.
// para cada leitura de senha incorreta informada, escreva a mensagem "SENHA INVÁLIDA!".
// quando a senha for corretamente informada, escreva a mensagem "ACESSO PERMITIDO!", e o algoritmo encerrado.
// considere que a senha correta é o valor 2002.

package com.marlon.exercicios;

import java.util.Scanner;

public class EX014 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("SENHA INVÁLIDA!");
            senha = sc.nextInt();
        }

        System.out.println("ACESSO PERMITIDO!");

        sc.close();

    }
}
