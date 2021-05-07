//package exemplos.exemplos01;

/*Modelo */
public class Pessoa {
    //atributos = caracteristicas
    String nome;
    int idade;

    // método construtor = inicializar os objetos e tem que er o mesmo nome da classe
    // método construtor não tem retorno, nem void
    Pessoa(String nome, int idade){
        this.nome = nome; //this = próprio objeto
        this.idade = idade;
    }

    //metodos = ações
    void apresentar (){
        System.out.println("Olá! Eu sou " + nome+ " e tenho " + idade+ " anos");
    }

    
    
}
