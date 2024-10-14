package kevin.aval.tech;

class Atendente  {
    String nome;
    double salario;

    String setor;

    Atendente(String nome, double salario , String setor) {
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;

    }

    void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Salário: " + " R$ " + salario  + " Setor : " + setor);
    }
}