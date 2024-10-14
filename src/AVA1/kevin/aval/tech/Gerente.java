package kevin.aval.tech;

class Gerente extends Atendente {
    int numAtendentesGerenciados;

    Gerente(String nome, String setor, double salario) {
        super(nome, salario,setor);
        this.numAtendentesGerenciados = numAtendentesGerenciados;
    }

    void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Número de Funcionários Gerenciados: " + numAtendentesGerenciados);
    }
}

