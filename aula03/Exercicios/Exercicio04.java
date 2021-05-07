package Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pares = 0, numero = 0, soma = 0, impares = 1;
        float media = 0;

        final int TOTAL_NUMEROS = 10;

        for (int n = 1; n <= 10; n++) {
            System.out.printf("Digite o %d º número: ", n);
            numero = input.nextInt();
            if (numero % 2 == 0) {
                pares++;
                soma += numero;

            }
           
        }

        media = soma/pares;
       impares = TOTAL_NUMEROS - pares ;

        System.out.printf("Média pares " + media);
        System.out.printf("Porcentagem impares " + impares);

        input.close();

    }
}
