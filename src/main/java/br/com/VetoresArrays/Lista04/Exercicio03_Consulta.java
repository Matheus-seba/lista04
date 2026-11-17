package br.com.VetoresArrays.Lista04;

import java.util.Scanner;
//Um vetor guarda os códigos e outro os preços, na mesma ordem.
//Leia um código e mostre o preço ou "Produto não cadastrado".

public class Exercicio03_Consulta {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int[]  vetorA = {1010, 4545, 6969, 6767, 8888};
        double[] vetorB = {10.50, 26.60, 40.90, 30.50, 15.50};

        boolean achou = false;

        System.out.println("Digite o codigo do produto: ");
        int codigo = sc.nextInt();

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == codigo) {
                System.out.printf("O valor do seu codigo é R$: %.2f", vetorB[i]);
                achou = true;
            }
        }
        if (!achou){
            System.out.println("Produto não cadastrado");
        }
    }
}
