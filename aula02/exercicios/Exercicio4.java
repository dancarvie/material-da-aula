package exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner (System.in);
        double salariobruto, valorprestacao, limite;

        System.out.println("Digite o salário bruto");
        salariobruto = entrada.nextDouble();

        System.out.println("digite o valor da prestação");
        valorprestacao = entrada.nextDouble();

        limite = salariobruto *0.3;

        if (valorprestacao <= limite) {
            System.out.println("Empréstimo concedido");
        } else {
            System.out.println("Empréstimo não concedido");
        }

entrada.close();

        
    }
    
}
