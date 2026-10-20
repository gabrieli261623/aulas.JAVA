import java.util.Scanner;

public class sistemasfunc {

    public static void cadastrarFuncionario(String[] nomes, String[] cargos, int index, Scanner sc) {
        System.out.print("Digite o nome do funcionário: ");
        nomes[index] = sc.nextLine();
        System.out.print("Digite o cargo: ");
        cargos[index] = sc.nextLine();
    }

    public static double calcularSalario(Scanner sc) {
        System.out.print("Digite a quantidade de horas: ");
        double horas = sc.nextDouble();

        System.out.print("Digite o valor da hora: ");
        double valorHora = sc.nextDouble();
        sc.nextLine(); 

        double salario = horas * valorHora;

        System.out.println("Salário R$: " + salario);
        return salario;
    }

    public static void exibirFuncionario(String nome, String cargo, double salario) {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }

    public static void listarFuncionarios(String[] nomes, int total) {
        System.out.println("\n--- Funcionários cadastrados ---");
        for (int i = 0; i < total; i++) {
            System.out.println(i + " - " + nomes[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[10];
        String[] cargos = new String[10];
        double[] salarios = new double[10];

        int opcao;
        int index = 0;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Calcular salário");
            System.out.println("3 - Exibir dados do funcionário");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    if (index < nomes.length) {
                        cadastrarFuncionario(nomes, cargos, index, sc);
                        salarios[index] = 0;
                        index++;
                    } else {
                        System.out.println("Limite de funcionários atingido!");
                    }
                    break;

                case 2:
                    if (index == 0) {
                        System.out.println("Nenhum funcionário cadastrado!");
                        break;
                    }

                    listarFuncionarios(nomes, index);
                    System.out.print("Escolha o funcionário pelo índice: ");
                    int indice = sc.nextInt();

                    if (indice >= 0 && indice < index) {
                        salarios[indice] = calcularSalario(sc);
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;

                case 3:
                    if (index == 0) {
                        System.out.println("Nenhum funcionário cadastrado!");
                        break;
                    }

                    listarFuncionarios(nomes, index);
                    System.out.print("Escolha o funcionário pelo índice: ");
                    int iEx = sc.nextInt();

                    if (iEx >= 0 && iEx < index) {
                        exibirFuncionario(nomes[iEx], cargos[iEx], salarios[iEx]);
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}