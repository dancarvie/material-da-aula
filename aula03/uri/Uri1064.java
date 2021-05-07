package uri;

import java.util.Scanner;

public class Uri1064 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int NUM_LIMITE = 6;
        int positivo = 0, numero = 0, quantidade = 0, soma = 0;
        float media = 0;

        for (int i = 0; i < NUM_LIMITE; i++) {
            numero = input.nextInt();
            if (numero > 0) {
                positivo++;
                soma += numero;

            }
        }

        media = soma / positivo;
        System.out.printf("%.1f valores positivos", numero);
        System.out.println(+media);

        input.close();

    }
}
