//package exemplos.exemplos02;

import java.util.ArrayList;

public class Exemplo02 {
    public static void main(String[] args) {
        ArrayList <Pessoa> lista = new ArrayList <> ();
        // Pessoa p;

        //p = new Pessoa ("Armand0", 33);" ou paras varias
        lista.add (new Pessoa("Armando", 33));
        lista.add (new Pessoa("Carlos", 44));
        lista.add (new Pessoa("Darlene", 55));

        for(Pessoa pessoa :  lista){
            pessoa.apresentar();
        }
    }
}
