package kevin.avali2.tech;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Ano: " + anoPublicacao);
    }
}

