package sla1;
import java.util.Scanner;
public class CadastroComValidacao {      
    public static void main(String[] args) {	
    Scanner scanner = new Scanner(System.in);	
    System.out.print("Digite seu nome: ");	
    String nome = scanner.nextLine();	
    System.out.print("Digite seu telefone: ");
    String telefone = scanner.nextLine();	
    if (nome.isEmpty() || telefone.isEmpty()) {		
        System.out.println("Erro: Nome/telefone não podem estar vazios!");	
    } else {		
        System.out.println("Nome: " + nome);		
        System.out.println("Telefone: " + telefone);       	
    }	
    scanner.close();      
    }
}
