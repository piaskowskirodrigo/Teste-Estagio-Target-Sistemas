package com.mycompany.testeestagiotargetsistemasfinal;

import java.util.Scanner;

public class Teste5StringInvertida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário para digitar o nome
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        // Invertendo o nome
        String nomeInvertido = "";
        for (int i = nome.length() - 1; i >= 0; i--) {
            nomeInvertido += nome.charAt(i);
        }

        // Exibindo o nome invertido
        System.out.println("O seu nome ao contrário é: " + nomeInvertido);

        scanner.close();
    }
}
