package org.example;


import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Arrays;

class Faturamento {
    int dia;
    double valor;
}

public class questao03 {
    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new Gson();

        Faturamento[] faturamentos = gson.fromJson(new FileReader("src/main/resources/dados.json"), Faturamento[].class);

        // Filtrando dias sem faturamento
        faturamentos = Arrays.stream(faturamentos)
                .filter(f -> f.valor > 0)
                .toArray(Faturamento[]::new);

        double min = Arrays.stream(faturamentos).mapToDouble(f -> f.valor).min().orElse(0);
        double max = Arrays.stream(faturamentos).mapToDouble(f -> f.valor).max().orElse(0);
        double soma = Arrays.stream(faturamentos).mapToDouble(f -> f.valor).sum();
        int count = faturamentos.length;

        double media = soma / count;

        int diasAcimaDaMedia = (int) Arrays.stream(faturamentos)
                .filter(f -> f.valor > media)
                .count();

        System.out.println("Menor valor de faturamento: " + min);
        System.out.println("Maior valor de faturamento: " + max);
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}
