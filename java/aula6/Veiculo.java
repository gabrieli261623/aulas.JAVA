import java.util.Date;
import java.util.Scanner;

public class Veiculo {
    public String marca;
    public String modelo;
    public Date ano;
    public String cor;
    public double combustivel;

    public Veiculo(String _marca, String _modelo, Date _ano, String _cor, double _combustivel) {
        this.marca = _marca;
        this.modelo = _modelo;
        this.ano = _ano;
        this.cor = _cor;
        this.combustivel = _combustivel;   
    }
    public void mostrarDados() {
        System.out.println("modelo: " + _modelo);
        System.out.println("marca: " + _marca);
        System.out.println("ano: " + _ano);
        System.out.println("cor: " + _cor);
        System.out.println("combustível: " + _combustivel);
    }
}

class Moto extends Veiculo {
    public int cilindradas;
    public String potencia;

    public Moto(String _marca, String _modelo, Date _ano, String _cor, double _combustivel, int _cilindradas, String _potencia) {
        super(_marca, _modelo, _ano, _cor, _combustivel);
        this.cilindradas = _cilindradas;
        this.potencia = _potencia;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("Potência: " + potencia);
    }
}

class Carro extends Veiculo {
    public String nr_portas;
    public String acessorios;
    public String direcao;

    public Carro(String _marca, String _modelo, Date _ano, String _cor, double _combustivel, String _nr_portas, String _acessorios, String _direcao) {
        super(_marca, _modelo, _ano, _cor, _combustivel);
        this.nr_portas = _nr_portas;
        this.acessorios = _acessorios;
        this.direcao = _direcao;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Número de Portas: " + nr_portas);
        System.out.println("Acessórios: " + acessorios);
        System.out.println("Direção: " + direcao);
    }
        System.out.println("Potência: " + potencia);
    }


    public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar Carro");
            System.out.println("2 - Cadastrar Moto");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {

                System.out.print("Número de portas: ");
                String nr_portas = sc.nextLine();

                System.out.print("Acessorios: ");
                String acessorios = sc.nextLine();

                System.out.print("Direção: ");

                //armazenar no objeto (carro)
                Carro Carro = new Carro(marca, modelo, ano, cor, combustivel, nr_portas, acessorios, direcao);

                System.out.println("\n=== DADOS DO CARRO ===");
                Carro.mostrarDados();

            } else if (opcao == 2) {

                System.out.print("Cilindradas: ");
                String cilindradas = sc.nextLine();

                System.out.print("Potência: ");
                String potencia = sc.nextLine();

                Moto Moto = new Moto(marca, modelo, ano, cor, combustivel, Integer.parseInt(cilindradas), potencia);

                System.out.println("\n=== DADOS DA MOTO ===");
                Moto.mostrarDados();

            } else if (opcao == 0) {

                System.out.println("Programa encerrado.");

            } else {

                System.out.println("Opção inválida!");

            }

        } while (opcao != 0);

        sc.close();
    }
}


