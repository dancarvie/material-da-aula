package exemplos;

public class Exemplo04 {
    public static void main(String[] args) {
        int cont;

        cont = 1; // mostra de onde começa a contagem // inicialização

        while (cont < 11) { // condição
            System.out.println(cont);
            // cont++; // cont = cont +1; //passo
            cont = cont + 2; // pode usar tbm cont += 2
        }
       System.out.println("valor final: " + cont); // mostra o 11
    }
}
