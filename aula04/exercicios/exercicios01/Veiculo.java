package exercicios.exercicios01;

//criar a classe Veiculo
// atributos private
// metodo public

public class Veiculo {

    private String modelo, marca; 
    private double consumo;

    // criar construtor com mesmo nome da classe

    public Veiculo(String modelo, String marca, double consumo){
        this.modelo = modelo;
        this.marca = marca;
        setConsumo(consumo);

    }

    // criar metodo para exibir dados
   public void exibirDados (){
        System.out.println("Modelo: " +modelo+ " - Marca: "+marca);
    }
    
// criar metodo para retornar consumo
public double getConsumo(){
    return consumo;
}
    public void setConsumo (double novoConsumo){
    
    if (novoConsumo < 0){
        
    }
}}
