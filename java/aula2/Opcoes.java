package sla2;
import java.util.Scanner;

public class Opcoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== MENU ===");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar");
        System.out.println("3 - Sair");

        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Opção escolhida: Cadastrar");
                break;

            case 2:
                System.out.println("Opção escolhida: Listar");
                break;

            case 3:
                System.out.println("Saindo do sistema...");
                break;

            default:
                System.out.println("Opção inválida. Tente novamente.");
        }

        sc.close();
    }
}