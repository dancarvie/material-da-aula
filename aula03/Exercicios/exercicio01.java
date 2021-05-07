package Exercicios;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //leia um numero inteiro
        int numInteiro,cont ;
        
        System.out.println("Digite um número"); 
        numInteiro = entrada.nextInt();

    
        //contagem tem que dobrar a sequência e exibir a sequencia ate o numero digitado
        cont = 1;

        while (cont <= numInteiro){
            if (cont * 2 > numInteiro) {
                System.out.printf("%d ", cont);
            } else {
                System.out.printf("%d, ", cont);
            }
            cont*= 2;
            
            entrada.close();    
            

        }



    }
    
}