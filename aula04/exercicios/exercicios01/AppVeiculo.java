package exercicios.exercicios01;

public class AppVeiculo {
    public static void main(String[] args) {

        //criar objeto
        
        Veiculo v1 = new Veiculo("Palio", "Fiat", 8.9);
        Veiculo v2 = new Veiculo("Gol" ,"Volkswagen", 5.4);
        
        //v1.consumo = 8.9;
        //v2.consumo = 5.4;

        v1.setConsumo(80000);
        v2.setConsumo(80000);


        v1.exibirDados();
        System.out.println("Consumo: " + v1.getConsumo());
        
        v2.exibirDados();
        System.out.println("Consumo: " + v2.getConsumo());
      
    }
}
