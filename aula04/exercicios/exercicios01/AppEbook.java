package exercicios.exercicios01;

public class AppEbook {
    public static void main(String[] args) {
        
       Ebook ebook = new Ebook("1984",  "George Orwell", 500, 1 );
       
       ebook.exibirLivro();
       ebook.proximaPagina();
       ebook.voltarPagina();
       //ebook.exibirPagina(2);
      // ebook.irParaPagina();

       
    }
    
}
