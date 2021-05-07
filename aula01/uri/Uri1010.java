package uri;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int qtde1, qtde2, code1, code2;
        double valor1, valor2, valorTotal;

        code1 = entrada.nextInt();
        qtde1 = entrada.nextInt();
        valor1 = entrada.nextDouble();

        code2= entrada.nextInt();
        qtde2 = entrada.nextInt();
        valor2 = entrada.nextDouble();

        valorTotal = (qtde1*valor1) + (qtde2*valor2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

        entrada.close();
    }
    
}
