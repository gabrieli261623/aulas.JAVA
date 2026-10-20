package sla1;
import java.util.Scanner;
public class cadastrarsenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome de usuário: ");
        String usuario = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        if (usuario.isEmpty() || senha.isEmpty()) {
            System.out.println("Erro: Usuário e senha não podem estar vazios!");
        } else if (senha.length() < 6) {
            System.out.println("Erro: Senha deve ter pelo menos 6 caracteres!");
        } else {
            System.out.println("Cadastro realizado com sucesso!");
            System.out.println("Usuário: " + usuario);
        }
        scanner.close();
    }
}
