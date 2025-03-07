package br.Livro;

public class Livro {
    public String titulo;
    private String autor;
    protected double preco;
    int paginas;

    public Livro(){

    }

    public Livro(String titulo,String autor, double preco, int paginas){

        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.paginas = paginas;
    }

    public String detalhesDoLivro() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                ", paginas=" + paginas +
                '}';
    }
}
