package br.com.VetoresArrays.Lista04;

import java.util.Scanner;
//10 clientes deram nota de 0 a 10. Mostre quantas vezes cada nota
//apareceu e a mais votada.

public class Exercicio05_Pesquisa {
    static void main() {

        Scanner input = new Scanner(System.in);

        int[] apareceu = new int[11];
        int[] notas = {2,5,5,6,7,4,5,3,10,9};

        for (int i = 0; i < notas.length; i++) {
            apareceu[notas[i]]++;
        }
        int maior = 0;
        int notaMaisVotada = 0;
        for (int i = 0; i < apareceu.length; i++) {
            if (apareceu[i] > maior) {
                maior = apareceu[i];
                notaMaisVotada = i;
            }
            System.out.println("O valor " + i + " apareceu " + apareceu[i] + " vezes");
        }
        System.out.println("A nota mais votada foi " + notaMaisVotada + ", aparecendo " + apareceu[notaMaisVotada] + " vezes");
    }
}

