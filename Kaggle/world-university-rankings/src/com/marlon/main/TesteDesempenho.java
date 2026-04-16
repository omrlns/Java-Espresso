package com.marlon.main;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TesteDesempenho {
    public static void main(String[] args) {
        // caminho do dataset
        String caminhoArquivo = "C:\\Users\\Marlon\\Downloads\\archive\\educational_attainment_supplementary_data.csv";

        System.out.println("INICIANDO OS TESTES DE LEITURA DO DATASET\n");

        // teste sem buffer
        long tempoSemBuffer = medirDesempenho(caminhoArquivo, false);
        // teste com buffer
        long tempoComBuffer = medirDesempenho(caminhoArquivo, true);

        System.out.println("--------------------------------------------------");
        System.out.println("RESULTADOS FINAIS:");
        System.out.printf("TEMPO SEM BUFFER: %d /ms%n", tempoSemBuffer);
        System.out.printf("TEMPO COM BUFFER: %d /ms%n", tempoComBuffer);

        if (tempoSemBuffer > 0) {
            double ganho = (double) tempoSemBuffer / tempoComBuffer;
            System.out.printf("O BUFFER FOI %.2fx MAIS RÁPIDO!%n", ganho);
        }
    }

    private static long medirDesempenho(String path, boolean usarBuffer) {
        long inicio = System.currentTimeMillis();
        long contadorBytes = 0;

        try (InputStream is = usarBuffer ?
                new BufferedInputStream(new FileInputStream(path)) :
                new FileInputStream(path)) {

            int dado;
            // [OPERAÇÃO] - ler byte a byte e contar
            while ((dado = is.read()) != -1) {
                contadorBytes++;
            }
        } catch (IOException e) {
            System.out.printf("ERRO AO LER O ARQUIVO: %s", e.getMessage());
        }

        long fim = System.currentTimeMillis();
        long total = fim - inicio;

        System.out.println((usarBuffer ? "[COM BUFFER]" : "[SEM BUFFER]")
                + " foram lidos " + contadorBytes + " bytes em " + total + " /ms.");

        return total;
    }
}
