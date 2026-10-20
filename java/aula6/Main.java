import java.util.*;
// SUPERClasse b
class Pessoa {
    public String nome;
    public String cpf;
    public Date data_nascimento;

    public Pessoa(String _nome, String _cpf, Date _data) {
        this.nome = _nome;
        this.cpf = _cpf;
        this.data_nascimento = _data;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + data_nascimento);
    }
}

// Classe Aluno herdando de SUPERCLASSE Pessoa
class Aluno extends Pessoa {
    public String matricula;

    public Aluno(String _nome, String _cpf, Date _data, String _matricula) {
        super(_nome, _cpf, _data);
        this.matricula = _matricula;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Matrícula: " + matricula);
    }
}

// Classe Professor herdando de SUPERCLASSE Pessoa
class Professor extends Pessoa {
    public double salario;
    public String disciplina;

    public Professor(String _nome, String _cpf, Date _data,
                     double _salario, String _disciplina) {
        super(_nome, _cpf, _data);
        this.salario = _salario;
        this.disciplina = _disciplina;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Salário: R$ " + salario);
        System.out.println("Disciplina: " + disciplina);
    }
}

class Funcionario extends Pessoa {
    public double salario;
    public String cargo;

    public Funcionario(String _nome, String _cpf, Date _data,
                       double _salario, String _cargo) {
        super(_nome, _cpf, _data);
        this.salario = _salario;
        this.cargo = _cargo;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Salário: R$ " + salario);
        System.out.println("Cargo: " + cargo);
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Cadastrar Funcionário");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao == 1) {

                System.out.print("Nome: ");
                String nome = entrada.nextLine();

                System.out.print("CPF: ");
                String cpf = entrada.nextLine();

                System.out.print("Matrícula: ");
                String matricula = entrada.nextLine();

                //armazenar no objeto (ALUNO)
                Aluno aluno = new Aluno(nome, cpf, new Date(), matricula);

                System.out.println("\n=== DADOS DO ALUNO ===");
                aluno.mostrarDados();

            } else if (opcao == 2) {

                System.out.print("Nome: ");
                String nome = entrada.nextLine();

                System.out.print("CPF: ");
                String cpf = entrada.nextLine();

                System.out.print("Salário: ");
                double salario = entrada.nextDouble();
                entrada.nextLine();

                System.out.print("Disciplina: ");
                String disciplina = entrada.nextLine();

                Professor professor = new Professor(nome, cpf, new Date(), salario, disciplina );

                System.out.println("\n=== DADOS DO PROFESSOR ===");
                professor.mostrarDados();

            } else if (opcao == 3) {

                System.out.print("Nome: ");
                String nome = entrada.nextLine();

                System.out.print("CPF: ");
                String cpf = entrada.nextLine();

                System.out.print("Salário: ");
                double salario = entrada.nextDouble();
                entrada.nextLine();

                System.out.print("Cargo: ");
                String cargo = entrada.nextLine();

                Funcionario funcionario = new Funcionario(nome, cpf, new Date(), salario, cargo);

                System.out.println("\n=== DADOS DO FUNCIONÁRIO ===");
                funcionario.mostrarDados();

            } else if (opcao == 0) {

                System.out.println("Programa encerrado.");

            } else {

                System.out.println("Opção inválida!");

            }

        } while (opcao != 0);

        entrada.close();
    }
}