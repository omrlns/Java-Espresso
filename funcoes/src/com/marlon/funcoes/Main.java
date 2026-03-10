package com.marlon.funcoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe três números: ");
        int primeiroNumero = sc.nextInt();
        int segundoNumero = sc.nextInt();
        int terceiroNumero = sc.nextInt();

//        if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
//            System.out.printf("Entre os valores informados, %d é o maior!", primeiroNumero);
//        }
//        else if ( segundoNumero > terceiroNumero) {
//            System.out.printf("Entre os valores informados, %d é o maior!", segundoNumero);
//        }
//        else {
//            System.out.printf("Entre os valores informados, %d é o maior!", terceiroNumero);
//        }

        int maior = valorMaior(primeiroNumero, segundoNumero, terceiroNumero);
        mostrarResultado(maior);

        sc.close();

    }

    public static int valorMaior(int valorX, int valorY, int valorZ) {
        int auxiliar;
        if (valorX > valorY && valorX > valorZ) {
            auxiliar = valorX;
        }
        else if (valorY > valorZ) {
            auxiliar = valorY;
        }
        else {
            auxiliar = valorZ;
        }
        return auxiliar;
    }

    public static void mostrarResultado(int valor) {
        System.out.printf("O maior valor é = %d", valor);
    }



}
