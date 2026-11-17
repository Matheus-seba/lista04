package br.com.VetoresArrays.Lista04;

import java.util.Scanner;
//Dois vetores guardam o nome e o total vendido de 6 vendedores.
//Mostre o ranking do maior para o menor, sem métodos prontos de
//ordenação.
public class Exercicio07_Ranking {
    static void main() {

        Scanner sc = new Scanner(System.in);

        String[] nomes = {"Jose", "karlos", "matheus", "gean", "diego", "leonardo"};
        double[] totalvendas = {2100, 3000, 5000, 2111, 3432, 1243};

        for (int i = 0; i < totalvendas.length - 1; i++) {
            for (int j = 0; j < totalvendas.length - 1 - i; j++) {
                if (totalvendas[j] < totalvendas[j + 1]) {

                    double auValor = totalvendas[j];
                    totalvendas[j] = totalvendas[j + 1];
                    totalvendas[j + 1] = auValor;

                    String auNome = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = auNome;
                }
            }
        }

        System.out.println("---------- Ranking de vendas ----------");
        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("%dº lugar: %s - R$ %.2f\n", i + 1, nomes[i], totalvendas[i]);
        }
    }
}