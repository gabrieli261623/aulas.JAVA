import java.util.Date;
import java.util.Scanner;

public class Animal {
    public String nome;
    public int idade;

    public Animal(String _nome, int _idade) {
        this.nome = _nome;
        this.idade = _idade;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

class Mamifero extends Animal {
    public String corPelo;

    public Mamifero(String _nome, int _idade, String _corPelo) {
        super(_nome, _idade);
        this.corPelo = _corPelo;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Cor do pelo: " + corPelo);
    }
}

class Ave extends Animal {
    public String tipoDoBico;

    public Ave(String _nome, int _idade, String _tipoDoBico) {
        super(_nome, _idade);
        this.tipoDoBico = _tipoDoBico;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Tipo do bico: " + tipoDoBico);
    }
}

class Reptil extends Animal {
    public String tipoEscama;

    public Reptil(String _nome, int _idade, String _tipoEscama) {
        super(_nome, _idade);
        this.tipoEscama = _tipoEscama;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Tipo de escama: " + tipoEscama);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar Mamífero");
            System.out.println("2 - Cadastrar Ave");
            System.out.println("3 - Cadastrar Réptil");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Idade: ");
                int idade = sc.nextInt();
                sc.nextLine();

                System.out.print("Cor do pelo: ");
                String corPelo = sc.nextLine();

                Mamifero m = new Mamifero(nome, idade, corPelo);

                System.out.println("\n=== DADOS DO MAMÍFERO ===");
                m.mostrarDados();

            } else if (opcao == 2) {

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Idade: ");
                int idade = sc.nextInt();
                sc.nextLine();

                System.out.print("Tipo do bico: ");
                String tipoBico = sc.nextLine();

                Ave a = new Ave(nome, idade, tipoBico);

                System.out.println("\n=== DADOS DA AVE ===");
                a.mostrarDados();

            } else if (opcao == 3) {

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Idade: ");
                int idade = sc.nextInt();
                sc.nextLine();

                System.out.print("Tipo de escama: ");
                String tipoEscama = sc.nextLine();

                Reptil r = new Reptil(nome, idade, tipoEscama);

                System.out.println("\n=== DADOS DO RÉPTIL ===");
                r.mostrarDados();

            } else if (opcao == 0) {

                System.out.println("Programa encerrado.");

            } else {

                System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}