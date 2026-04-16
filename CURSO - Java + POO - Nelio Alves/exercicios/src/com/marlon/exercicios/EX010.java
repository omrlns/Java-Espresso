// com base na tabela abaixo, escreva um programa que leia o código e a quantidade de um item.
// a seguir, calcule e mostre o valor da conta a pagar.
// tabela:
// codigo | especificação | preço
//   1    | cachorro-quente | R$ 4.00
//   2    | x-salada      | R$ 4.50
//   3    | x-bacon       | R$ 5.00
//   4    | torrada simples | R$ 2.00
//   5    | refrigerante  | R$ 1.50

package com.marlon.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EX010 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codItem, qntdItem;
        double valorConta = 0;

        codItem = sc.nextInt();
        qntdItem = sc.nextInt();

        if (codItem == 1) {
            valorConta = 4.00 * qntdItem;
        }
        else if (codItem == 2) {
            valorConta = 4.50 * qntdItem;
        }
        else if (codItem == 3) {
            valorConta = 5.00 * qntdItem;
        }
        else if (codItem == 4) {
            valorConta = 2.00 * qntdItem;
        }
        else if (codItem == 5) {
            valorConta = 1.50 * qntdItem;
        }
        else {
            System.out.println("INFORME UM CÓDIGO DE ITEM VÁLIDO!");
        }
        if (valorConta > 0) {
            System.out.printf("TOTAL = R$ %.2f", valorConta);
        }
        sc.close();

    }
}
