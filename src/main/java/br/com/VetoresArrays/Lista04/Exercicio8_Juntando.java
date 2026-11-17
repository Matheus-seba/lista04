package br.com.VetoresArrays.Lista04;

import java.util.Scanner;
//Duas filiais enviam suas vendas já ordenadas. Gere um único vetor
//ordenado percorrendo os dois ao mesmo tempo, sem juntar e
//ordenar depois.

public class Exercicio8_Juntando {
    static void main() {

        Scanner sc = new Scanner(System.in);

        double[] filialA = {100, 300, 500, 800, 900};
        double[] filialB = {200, 250, 600, 700};

        double[] juntos = new double[filialA.length + filialB.length];

        int a = 0;
        int b = 0;
        int k = 0;

        while (a < filialA.length && b < filialB.length) {
            if (filialA[a] <= filialB[b]) {
                juntos[k] = filialA[a];
                a++;
            } else {
                juntos[k] = filialB[b];
                b++;
            }
            k++;
        }

        while (a < filialA.length) {
            juntos[k] = filialA[a];
            a++;
            k++;
        }

        while (b < filialB.length) {
            juntos[k] = filialB[b];
            b++;
            k++;
        }

        System.out.println("Vendas juntas e ordenadas:");
        for (int i = 0; i < juntos.length; i++) {
            System.out.printf("R$ %.2f\n", juntos[i]);
        }
    }
}