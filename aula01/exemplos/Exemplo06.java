package exemplos;

public class Exemplo06 {
    public static void main(String[] args) {
        
        int valor = 10;
        final int TAXA_DE_VENDA = 10; // final = constante = não pode ter o valor alterado

        //nomes em caixa alta podem ser usadas com underline apenas para constane

        valor = 12;

        System.out.println(valor);
        System.out.println(valor + TAXA_DE_VENDA);
    }
}
