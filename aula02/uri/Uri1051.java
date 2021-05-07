package uri;

import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float salario;
        double imposto, imposto2, imposto3;

        salario = entrada.nextFloat();

        if (salario <= 2000.00) {
            System.out.println("Isento");
        } else {
            if (salario >= 2000.01 && salario <= 3000.00) {
                imposto = (salario - 2000);
                System.out.printf("R$ %.2f\n", (imposto * 0.08));
            } else {
                if (salario >= 3000.01 && salario <= 4500.00) {
                    imposto = (salario - 3000);
                    imposto2 = (salario - 2000 - imposto);
                    System.out.printf("R$ %.2f\n", (imposto2 * 0.08) + (imposto * 0.18));
                } else {
                    if (salario > 4500.00) {
                        imposto = (salario - 4500);
                        imposto2 = (salario - 3000 - imposto);
                        imposto3 = (salario - 2000 - imposto2 - imposto);
                        System.out.printf("R$ %.2f\n", (imposto2 * 0.18) + (imposto * 0.28) + (imposto3 * 0.08));
                    }
                }

                entrada.close();

            }
        }
    }
}
