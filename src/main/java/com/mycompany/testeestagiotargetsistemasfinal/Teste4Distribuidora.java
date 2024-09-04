package com.mycompany.testeestagiotargetsistemasfinal;

public class Teste4Distribuidora {
     public static void main(String[] args) {
        // Definindo o faturamento de cada estado
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;

        // Calculando o faturamento total da distribuidora
        double faturamentoTotal = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;

        // Exibindo o faturamento total da distribuidora
        System.out.printf("Faturamento Mensal da Distribuidora: R$%,.2f%n", faturamentoTotal);

        // Calculando e exibindo a representatividade de cada estado no faturamento total da distribuidora
        double percentualSP = (faturamentoSP / faturamentoTotal) * 100;
        double percentualRJ = (faturamentoRJ / faturamentoTotal) * 100;
        double percentualMG = (faturamentoMG / faturamentoTotal) * 100;
        double percentualES = (faturamentoES / faturamentoTotal) * 100;
        double percentualOutros = (faturamentoOutros / faturamentoTotal) * 100;

        System.out.println("Representatividade de cada estado no faturamento total:");
        System.out.printf("SP: %.2f%%%n", percentualSP);
        System.out.printf("RJ: %.2f%%%n", percentualRJ);
        System.out.printf("MG: %.2f%%%n", percentualMG);
        System.out.printf("ES: %.2f%%%n", percentualES);
        System.out.printf("Outros: %.2f%%%n", percentualOutros);
    }
}
