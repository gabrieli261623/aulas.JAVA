package sla2;
import java.util.Scanner;

public class desconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valor = sc.nextDouble();

        double valorFinal;

        if (valor > 100) {
            valorFinal = valor - (valor * 0.10);
        } else {
            valorFinal = valor;
        }

        System.out.println("Valor final da compra: R$ " + valorFinal);

        sc.close();
    }
}