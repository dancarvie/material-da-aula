package exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Digite a nota 1 ");
        nota1 = entrada.nextDouble();
        
        System.out.println("Digite a nota 2 ");
        nota2 = entrada.nextDouble();

    

        media = ((nota1 * 4)  + (nota2 * 6)) /10;
        System.out.println("Média final é " + media);

        if (media >= 6) {
            System.out.printf("Aprovado");
        } else {
    
            System.out.printf( "Reprovado");
            
        }

        entrada.close();
            
        
    }

        



        
    
}
