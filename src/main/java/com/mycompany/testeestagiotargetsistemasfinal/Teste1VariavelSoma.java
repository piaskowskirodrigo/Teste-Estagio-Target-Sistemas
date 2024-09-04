package com.mycompany.testeestagiotargetsistemasfinal;

public class Teste1VariavelSoma {
    public static void main(String[] args) {
        int i = 13;
        int soma = 0;
        int k = 0;

        while (k < i) {
            k = k + 1;
            soma = soma + k;
        }

        System.out.println("A soma dos números de 1 a " + i + " é: " + soma);
    }
}
