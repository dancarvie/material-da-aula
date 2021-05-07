package exercicios.exercicios01;



public class Ebook {

    //atributos

    private String titulo, autor;
    private int totalPaginas, paginaAtual;

     Ebook (String titulo, String autor,int totalPaginas, int paginaAtual ) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = paginaAtual;

     }

     public void proximaPagina (){
         if (paginaAtual < totalPaginas){
             paginaAtual++;
         }
     }

     public void voltarPagina (){
        if (paginaAtual > 1){
            paginaAtual--;
        }
    }
    public void irParaPagina (int pagina){
        if (pagina <= 1 && pagina < totalPaginas){
            paginaAtual = pagina;
        }
    }

    public int exibirPagina(){
        return paginaAtual;
    }

    public void exibirLivro (){
        paginaAtual = 1;
        System.out.println(titulo + "," +autor+ "-" + totalPaginas);
    }
}


