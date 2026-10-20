package sla1;
import java.util.Scanner;   //chamada bibliotecas
public class cadastrar2 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        /* é utilizado para remover espaços em branco 
        (incluindo tabs e quebras de linha) do início e do final de uma String, 
        retornando uma nova String */

        if (nome.trim().isEmpty()) {
            System.out.println("Erro: O nome não pode ser vazio!");
        } 

        System.out.print("Digite seu email: ");
        String email = scanner.nextLine();
        if (!email.contains("@")) {
            System.out.println("Erro: Email inválido! Deve conter @");
        }
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + email);
    }
}