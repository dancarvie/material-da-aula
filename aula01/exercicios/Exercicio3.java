package exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        double salario, novosalario;
        
        System.out.println("Digite o salário");
        salario = entrada.nextDouble();

        novosalario = salario + (salario* 0.25);
        System.out.println("Novo salário " + novosalario);
        
entrada.close();


    }
    
}
