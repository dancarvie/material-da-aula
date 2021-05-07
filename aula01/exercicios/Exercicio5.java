package exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double carronovo, custofabrica, porcentagemdist, porcentagemimp;

        System.out.println("Digite o custo de fábrica do carro");
        custofabrica = entrada.nextDouble();

        porcentagemdist = custofabrica * 0.28;

        porcentagemimp = custofabrica * 0.45;
        System.out.println("Valor do imposto é " + porcentagemimp);
        
        carronovo = (custofabrica + porcentagemdist + porcentagemimp);
        System.out.println("Custo do carro novo é " + carronovo);
       

entrada.close();

    }
}
