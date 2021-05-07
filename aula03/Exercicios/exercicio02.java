package Exercicios;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numInteiro, cont, soma;
        soma = 0;

        cont = 1;

        numInteiro = 1;

        while (numInteiro != 0) {
            System.out.println("Digite o " +cont+ "º valor");
            numInteiro = teclado.nextInt();

            soma = soma + numInteiro;
            cont++;

        }
        System.out.println("A soma é = " + soma);

        teclado.close();

    }
}
