package br.com.VetoresArrays.Lista04;

import java.util.Scanner;
//Aplique 10% de reajuste aos salários de 8 funcionários, com limite
//de R$ 5.000,00. Mostre os salários antes e depois e o aumento
//total da folha

public class Exercicio04_Reajuste {
    static void main() {

        Scanner sc = new Scanner(System.in);

        String[] funcionarios = {"João", "Julia", "Antônio", "Ana", "Pedro", "Francisca", "Maria", "Matheus"};
        double[] salario = {2350, 3000, 2550, 3675, 2750, 3100, 4100, 4600};
        double totalAumento = 0;

        for (int i = 0; i < salario.length; i++) {
            double reajuste = salario[i] * 1.10;
            if (reajuste > 5000) {
                reajuste = 5000;
            }
            totalAumento += reajuste - salario[i];
            System.out.printf("\nSalario do %s de antes  R$: %.2f e depois: R$: %.2f\n", funcionarios[i], salario[i], reajuste);

        }
        System.out.printf("\nO aumento total foi: R$ %.2f", totalAumento);
    }
}
