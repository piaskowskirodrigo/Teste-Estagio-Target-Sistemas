package com.mycompany.testeestagiotargetsistemasfinal;

import java.io.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class Teste3ManipulandoJson {
    private static JSONArray jsonReport = null;

    public static void main(String[] args) {
        double faturamentoBaixo = 0.0, faturamentoAlto = 0.0, totalMensal = 0.0;
        int contDias = 0;

        readerJson();

        for (int i = 0; i < jsonReport.size(); i++) {
            JSONObject faturamento = (JSONObject) jsonReport.get(i);
            double value = jsonObjectToFaturamentoDistribuidora(faturamento).getValue();

            if (i == 0) {
                faturamentoBaixo = value;
                faturamentoAlto = value;
            } else if (faturamentoBaixo > value) {
                faturamentoBaixo = value;
            } else if (faturamentoAlto < value) {
                faturamentoAlto = value;
            }

            if (value > 0.0) {
                totalMensal += value;
                contDias++;
            }
        }

        // O menor valor 
        System.out.println("Faturamento Baixo: " + faturamentoBaixo);

        // O maior valor 
        System.out.println("Faturamento Alto: " + faturamentoAlto);

        // Média mensal de faturamento
        totalMensal = totalMensal / contDias;

        // Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
        int contDiasM = 0;
        for (int i = 0; i < jsonReport.size(); i++) {
            JSONObject faturamento = (JSONObject) jsonReport.get(i);
            double value = jsonObjectToFaturamentoDistribuidora(faturamento).getValue();
            if (value > totalMensal) {
                contDiasM++;
            }
        }

        System.out.println("Número de Dias Acima da Média: " + contDias);
    }

    private static void readerJson() {
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("./dados.json")) {
            jsonReport = (JSONArray) jsonParser.parse(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static FaturamentoDistribuidora jsonObjectToDailyBilling(JSONObject obj) {
        FaturamentoDistribuidora faturamentoDistribuidora = new FaturamentoDistribuidora();
        double value = Double.parseDouble(obj.get("valor").toString());
        faturamentoDistribuidora.setValue(value);
        return faturamentoDistribuidora;
    }
    
}
