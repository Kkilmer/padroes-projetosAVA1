package kevin.avali2.tech;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome) {
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void emprestarLivro(Biblioteca biblioteca, Livro livro) {
        if (biblioteca.getLivrosDisponiveis().contains(livro)) {
            livrosEmprestados.add(livro);
            biblioteca.removerLivro(livro);
            System.out.println(nome + " emprestou o livro: " + livro.getTitulo());
        } else {
            System.out.println("O livro " + livro.getTitulo() + " não está disponível.");
        }
    }

    public void devolverLivro(Biblioteca biblioteca, Livro livro) {
        if (livrosEmprestados.contains(livro)) {
            livrosEmprestados.remove(livro);
            biblioteca.adicionarLivro(livro);
            System.out.println(nome + " devolveu o livro: " + livro.getTitulo());
        } else {
            System.out.println(nome + " não possui o livro " + livro.getTitulo());
        }
    }

    public void exibirLivrosEmprestados() {
        if (livrosEmprestados.isEmpty()) {
            System.out.println(nome + " não tem livros emprestados.");
        } else {
            System.out.println("Livros emprestados por " + nome + ":");
            for (Livro livro : livrosEmprestados) {
                livro.exibirInformacoes();
            }
        }
    }
}

