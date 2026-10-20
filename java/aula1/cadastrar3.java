package sla1;
import java.util.Scanner;   //chamada bibliotecas
public class cadastrar3 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        if (nome.trim().isEmpty()) {
            System.out.println("Erro: O nome não pode ser vazio!");
        } 
        System.out.print("Digite sua idade: ");
        String idade = scanner.nextLine();
        if (idade.trim().isEmpty()) {
            System.out.println("Erro: A idade não pode ser vazia!");
        } 
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
