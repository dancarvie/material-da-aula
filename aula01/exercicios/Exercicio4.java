package exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        double consumowatt, salariomin, valorpagar, valordesc, watt;

        System.out.println("Digite o salário mínimo ");
        salariomin = entrada.nextDouble();

        System.out.println("Digite a quantidade de quilowatt consumido");
        consumowatt = entrada.nextDouble();

       watt = salariomin /500;
       valorpagar = consumowatt * watt;
       valordesc = valorpagar * 0.15;

        System.out.println("Valor do quilowatt é " + watt);
        System.out.println("Valor a ser pago " + valorpagar);
        System.out.println("Valor a ser pago com desconto " + valordesc);

        entrada.close();

        
    }
}
