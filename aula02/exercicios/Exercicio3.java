package exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
             float numero1, numero2;

        System.out.println("Digite o primeiro número");
        numero1 = entrada.nextFloat();

        System.out.println("Digite o segundo número");
        numero2 = entrada.nextFloat();

        System.out.println(numero1 > numero2);
        System.out.println(numero1 >= numero2);

    
        entrada.close();
        
    }
}
