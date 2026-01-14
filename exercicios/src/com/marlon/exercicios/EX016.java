// um posto de combustível deseja determinar qual de seus produtos tem a preferência de seus clientes.
// escreva um algoritmo para ler o tipo de combustível abastecido. codificado da seguinte forma:
// 1. ÁLCOOL, 2. GASOLINA, 3. DIESEL e 4. FIM.
// caso o usuário informe um código inválido (fora da faixa de 1-4), deve ser solicitado um novo código,
// até que seja válido. o programa será encerrado quando o código informado for o número 4.
// deve ser escrito a mensagem "MUITO OBRIGADO!" e a quantidade de clientes que abasteceram cada tipo de combustível.

package com.marlon.exercicios;

import java.util.Scanner;

public class EX016 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int codigo = sc.nextInt();

        while (codigo != 4) {
            if (codigo == 1) {
                alcool += 1;
            } else if (codigo == 2) {
                gasolina += 1;
            } else if (codigo == 3) {
                diesel += 1;
            }

            codigo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO!");
        System.out.printf("ÁLCOOL: %d CLIENTE(S).%n", alcool);
        System.out.printf("GASOLINA: %d CLIENTE(S).%n", gasolina);
        System.out.printf("DIESEL: %d CLIENTE(S).%n", diesel);

        sc.close();
    }

}
