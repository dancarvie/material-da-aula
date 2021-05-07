package exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario;

        System.out.println("Digite o valor do salário");
        salario = input.nextDouble();

        if (salario <= 600) {
            System.out.println("Desconto do INSS é isento");
        } else {
            if (salario <= 1200) {
                System.out.println("Desconto INSS é de 20%");
            } else {
                if (salario <= 2000) {
                    System.out.println("Desconto INSS é de 25%");
                } else
                    System.out.println("Desconto INSS é de 30%");
            }
        }

        input.close();
    }
}
