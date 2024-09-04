package com.mycompany.testeestagiotargetsistemasfinal;

import java.util.Scanner;

public class Teste2Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário um número entre 1 e 100
        System.out.print("Digite um número entre 1 e 100: ");
        int num = scanner.nextInt();

        // Verificando se o número pertence à sequência de Fibonacci
        int a = 0, b = 1;

        while (b < num) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        // Exibindo mensagem de acordo com o resultado
        if (b == num) {
            System.out.println("O número digitado pertence à sequência de Fibonacci!");
        } else {
            System.out.println("Desculpe, mas o número digitado NÃO pertence à sequência de Fibonacci!");
        }

        scanner.close();
    }
    
}
