class Funcionario {

    public String nome;
    public String cpf;
    public String endereco;

    public Funcionario(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
    }

    void trabalhar() {
        System.out.println("Funcionário trabalhando");
    }
}

class Tecnico extends Funcionario {

    String formacao;

    public Tecnico(String nome, String cpf, String endereco, String formacao) {
        super(nome, cpf, endereco);
        this.formacao = formacao;
    }

    @Override
    void trabalhar() {
        System.out.println("Técnico assistindo sistemas");
    }
}

class Engenheiro extends Funcionario {

    String especialidade;

    public Engenheiro(String nome, String cpf, String endereco, String especialidade) {
        super(nome, cpf, endereco);
        this.especialidade = especialidade;
    }

    @Override
    void trabalhar() {
        System.out.println("Engenheiro projetando sistemas");
    }
}

class Gerente extends Funcionario {

    String departamento;

    public Gerente(String nome, String cpf, String endereco, String departamento) {
        super(nome, cpf, endereco);
        this.departamento = departamento;
    }

    @Override
    void trabalhar() {
        System.out.println("Gerente coordenando sistemas");
    }
}

public class Main {

    public static void main(String[] args) {

        Funcionario f1 = new Tecnico();
        Funcionario f2 = new Engenheiro();
        Funcionario f3 = new Gerente();

        f1.trabalhar();

        f2.trabalhar();

        f3.trabalhar();
    }
}