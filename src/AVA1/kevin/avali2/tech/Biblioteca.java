package kevin.avali2.tech;

import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private ArrayList<Livro> livrosDisponiveis;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livrosDisponiveis = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livrosDisponiveis.add(livro);
        System.out.println("Livro " + livro.getTitulo() + " adicionado à biblioteca.");
    }

    public void removerLivro(Livro livro) {
        livrosDisponiveis.remove(livro);
        System.out.println("Livro " + livro.getTitulo() + " removido da biblioteca.");
    }

    public ArrayList<Livro> getLivrosDisponiveis() {
        return livrosDisponiveis;
    }

    public void exibirLivrosDisponiveis() {
        if (livrosDisponiveis.isEmpty()) {
            System.out.println("Não há livros disponíveis na biblioteca.");
        } else {
            System.out.println("Livros disponíveis na biblioteca:");
            for (Livro livro : livrosDisponiveis) {
                livro.exibirInformacoes();
            }
        }
    }
}

