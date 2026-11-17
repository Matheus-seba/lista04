package br.com.VetoresArrays.Lista04;

import java.util.Scanner;
//Um vetor guarda 10 senhas e outro indica se cada cliente é idoso.
//A cada atendimento, chame o primeiro idoso; se não houver, a
//primeira senha. Quem está atrás do atendido anda uma posição e a
//última fica 0. Simule 3 atendimentos, mostrando a senha chamada
//e a fila
public class Exercicio06_Filadobanco {
    static void main() {

        int[] idoso = {0, 0, 1, 0, 0, 1, 0, 0, 0, 0};
        int[] senhas = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};

        for (int atendimento = 1; atendimento <= 3; atendimento++) {

            int pos = 0;
            for (int i = 0; i < idoso.length; i++) {
                if (idoso[i] == 1) {
                    pos = i;
                    break;
                }
            }

            System.out.println("Atendimento " + atendimento + " - Senha chamada: " + senhas[pos]);

            // 3. Todo mundo atrás anda uma posição
            for (int i = pos; i < senhas.length - 1; i++) {
                senhas[i] = senhas[i + 1];
                idoso[i] = idoso[i + 1];
            }
            senhas[9] = 0;
            idoso[9] = 0;

            System.out.print("Fila: ");
            for (int i = 0; i < senhas.length; i++) {
                System.out.print(senhas[i] + " ");
            }
            System.out.println("\n");
        }
    }
}
