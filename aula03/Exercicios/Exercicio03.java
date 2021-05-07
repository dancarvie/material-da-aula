package Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int valor, pares = 0;
        //final int TOTAL_NUMEROS = 10;

        for (int n = 1; n <= 10; n++) {
            System.out.printf("Digite o %d º valor: ", n);
            valor = teclado.nextInt();
            if (valor % 2 ==0){
                pares++;

            }
        }

        System.out.println("Numeros pares " + pares);
        System.out.println("Numeros impares " + (10 - pares)); // ao inves de usar o 10 pode usar constante (TOTAL_NUMEROS - pares))

        teclado.close();


         }
           

    



        

    }


