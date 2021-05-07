package Exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1, num2, num3, resultado;
        System.out.println("Digite o 1º numero");
        num1 = entrada.nextInt();

        System.out.println("Digite o 2º numero");
        num2 = entrada.nextInt();

        System.out.println("Digite o 3º numero");
        num3 = entrada.nextInt();

        resultado = menor(num1, num2, num3);

        System.out.println("é o menor número: " + resultado);

        entrada.close();

    }

    static int menor (int n1,int n2, int n3) {
        if (n1 <= n2 && n1 <= n3 ) {
            return 1;  
        } else {
             if (n2 <= n1 && n2 <= n3) {
        return 2;
    }
    else 
        { 
            return 3;
        }
        
    }
    
}}
