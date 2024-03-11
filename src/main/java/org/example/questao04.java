package org.example;
import java.text.DecimalFormat;

public class questao04 {

    public static void main(String[] args) {

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double valorTotal = sp + rj + mg + es + outros;

        double percentualSP = (sp / valorTotal) * 100;
        double percentualRJ = (rj / valorTotal) * 100;
        double percentualMG = (mg / valorTotal) * 100;
        double percentualES = (es / valorTotal) * 100;
        double percentualOutros = (outros / valorTotal) * 100;


        DecimalFormat df = new DecimalFormat("0.00");
        String percentualSPFormatado = df.format(percentualSP);
        String percentualRJFormatado = df.format(percentualRJ);
        String percentualMGFormatado = df.format(percentualMG);
        String percentualESFormatado = df.format(percentualES);
        String percentualOutrosFormatado = df.format(percentualOutros);


        System.out.println("Percentual de Representação por Estado:");
        System.out.println("SP: " + percentualSPFormatado + "%");
        System.out.println("RJ: " + percentualRJFormatado + "%");
        System.out.println("MG: " + percentualMGFormatado + "%");
        System.out.println("ES: " + percentualESFormatado + "%");
        System.out.println("Outros: " + percentualOutrosFormatado + "%");
    }
}


