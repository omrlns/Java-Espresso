// leia a hora inicial e a hora final de um jogo. a seguir calcule a duração do jogo,
// sabendo que o mesmo pode começar em um dia e terminar em outro,
// tendo uma duração mínima de 1 hora e máxima de 24 horas.

package com.marlon.exercicios;

import java.util.Scanner;

public class EX009 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int horaInicial, horaFinal, duracao;

        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao =  24 - horaInicial + horaFinal;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", duracao);

        sc.close();
    }
}
