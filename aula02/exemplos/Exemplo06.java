package exemplos;

public class Exemplo06 {
    public static void main(String[] args) {
        int numInteiro;
        double numDouble;

        //numInteiro = 12; - não da pra colocar double direto dentro de inteiro
        //numDouble = numInteiro;

        numDouble = 12.5465;
        numInteiro = (int) numDouble; // casting transforma em inteiro

        System.out.println("I: " + numInteiro);
        System.out.println("D: " + numDouble);
        System.out.printf("%d\n", (int) numDouble);
    }
}
