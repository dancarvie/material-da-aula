package exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double a, b, c;

        System.out.println("digite o valor de a ");
        a = input.nextDouble();

        System.out.println("digite o valor de b ");
        b = input.nextDouble();

        System.out.println("digite o valor de c ");
        c = input.nextDouble();

        input.close();

        if (a > b +c || b > a + c || c > a + b ) {
            System.out.println("Não é um triângulo");
        } else if (a == b && b == c ) {
            System.out.println("Equilatero");
        }else if (a == b || b == c || a ==c) {
            System.out.println("Isosceles");
        }else {
                System.out.println("Escaleno");
            }
        }

    
    }


