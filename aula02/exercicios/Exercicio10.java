package exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero,cont ;

        System.out.println("Digite o valor");
        //numero = entrada.nextInt();  // usa o valor digitado e mostra qualquer tabuada
        numero = 5;
        //mostra só a tabuada do 5
        
       cont = 0;

        while (cont < 11) { 
            System.out.printf("%d x %2d = %2d\n ", numero, cont, numero * cont);
            cont++;
             
            
            
        }
        entrada.close();

}
    }

