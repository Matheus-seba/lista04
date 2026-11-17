package br.com.VetoresArrays.Lista04;

import java.util.Scanner;
//Leia o estoque de 10 produtos. Mostre quantos têm menos de 5
//unidades e suas posições

public class Exercicio02_Estoque {
    static void main() {

        Scanner input = new Scanner(System.in);

        int[] estoque = new int[10];
        String[] vetorString = {"Trigo", "Fermento", "Açucar", "Chocolate50%", "chocolate100%", "Ovo", "Leite", "chantilly", "Sal", "óleo"};

        int contador = 0;
        for (int i = 0; i < estoque.length; i++) {
            System.out.println("Informe a quantidade de " + vetorString[i] + " no estoque: ");
            estoque[i] = input.nextInt();
        }
        System.out.println("----------------FICHA----------------");

        for (int i = 0; i < estoque.length; i++) {
            if (estoque[i] <5) {
                System.out.println(vetorString[i] + " na posição " + i + " tem " + estoque[i] + " unidades");
                contador++;
            }
        }
        System.out.println("total: " + contador);
    }
}
