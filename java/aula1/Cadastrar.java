package sla1;
import java.util.Scanner;   //chamada bibliotecas

public class Cadastrar {
     public static void main(String[] args) { 
         Scanner scanner = new Scanner(System.in);
         System.out.print("Digite seu nome: ");
         String nome = scanner.nextLine();
         System.out.print("Digite seu telefone: ");
         String telefone = scanner.nextLine();
         System.out.println("Nome: " + nome);
         System.out.println("Telefone: " + telefone);
         scanner.close();
    }
}
