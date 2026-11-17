package br.com.VetoresArrays.Lista04;

import java.util.Scanner;
//Leia o faturamento dos 7 dias da semana. Mostre o total, a média
//diária e o dia que mais vendeu

public class Exercicio01_Vendas {
    static void main() {

        Scanner sc = new Scanner(System.in);

        double[] faturamento = new double[7];
        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado"};

        double total = 0;
        int diamaisvendido = 0;

        for (int i = 0; i < faturamento.length; i++) {
            System.out.println("Digite o faturamento de " + dias[i]);
            faturamento[i] = sc.nextDouble();

            total += faturamento[i];

            if (faturamento[i] > faturamento[diamaisvendido]) {
                diamaisvendido = i;
            }
        }
        double media = total / faturamento.length;

        System.out.println("-----------Faturamento-pessoal-----------");
        System.out.printf("Você faturou: R$ %.2f\n", total);
        System.out.printf("Sua media diaria foi: R$ %.2f\n", media);
        System.out.printf("O dia em que você mais vendeu foi: " + dias[diamaisvendido] + " e faturou: R$ %.2f\n", faturamento[diamaisvendido]);
    }
}
