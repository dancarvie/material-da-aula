package Exercicios;

public class exercicio06 {
    public static void main(String[] args) {
        
        int resultado;

        resultado = par(5);

        if(resultado == 1){
            System.out.printf("Resposta é par");
          }
            else{
                System.out.println("Resposta é ímpar");
            }

        //System.out.println("Resultado é par: " + resultado);
    }

    static int par (int n1){

      if(n1 % 2 == 0){
        return 1;
      }
        else{
            return 2;
        }
      

    }
}
