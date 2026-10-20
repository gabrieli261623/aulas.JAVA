package sla2;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        Double n1 = sc.nextDouble();

        System.out.print("Digite o segudo número: ");
        Double n2 = sc.nextDouble();

        System.out.print("Digite 1-soma, 2-subtraçao, 3-mutiplicação e 4-para divisão: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("A soma é: "+ (n1+n2));
                break;

            case 2:
                System.out.println("A subtração é: "+ (n1-n2));
                break;

            case 3:
                System.out.println("A multiplicação é: "+ (n1*n2));
                break;
            
            case 4:
                System.out.println("A divisão é: "+ (n1/n2));
                break;

            default:
                System.out.println("Opção inválida. Tente novamente.");
        }

        sc.close();
    }
}