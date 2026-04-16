package com.marlon.funcoes;

public class Main {
    public static void main(String[] args) {

        String textoOriginal = "take your hand and walk away";
        String grito = "          OLHA O GOL, OLHA O GOL, GOOOLLL          ";

        String textoLower = grito.toLowerCase(); // aplica a formatação de letras minusculas para todos os caracteres
        String textoUpper = textoOriginal.toUpperCase(); // aplica a formatação de letras maiusculas para todos os caracteres
        String textoTrim = grito.trim(); // remove os espaços extras que estão à esquerda e direita da string
        String textoSubstring = textoOriginal.substring(19); // seleciona apenas uma parte da frase, dado o valor do range
        String textoReplace = grito.replace("OLHA O GOL", "OLHA A CHUVA"); // troca um determinado valor existente por outro valor informado
        int textoIndexOf = grito.indexOf("GOL"); // retorna a primeira posição de um determinado valor
        int textoLastIndexOf = grito.lastIndexOf("GOL"); // retorna a última posição de um determinado valor

        System.out.printf("Original: |%s|%n", textoOriginal);
        System.out.printf("toLowerCase: |%s|%n", textoLower);
        System.out.printf("toUpperCase: |%s|%n", textoUpper);
        System.out.printf("trim: |%s|%n", textoTrim);
        System.out.printf("substring(19): |%s|%n", textoSubstring);
        System.out.printf("replace(De: OLHA O GOL, Para: OLHA A CHUVA): |%s|%n", textoReplace);
        System.out.printf("indexOf: %d%n", textoIndexOf);
        System.out.printf("lastIndexOf: %d%n%n", textoLastIndexOf);

        String frutas = "apple grape banana";
        String[] vetor = frutas.split(" "); // reparte a string em x partes e as armazena em um vetor

        System.out.printf("%s%n", vetor[0]);
        System.out.printf("%s%n", vetor[1]);
        System.out.printf("%s%n", vetor[2]);
    }
}
