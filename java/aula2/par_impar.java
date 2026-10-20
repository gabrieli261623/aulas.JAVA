package sla2;

import java.util.Scanner;

public class par_impar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é PAR.");
        } else {
            System.out.println("O número é ÍMPAR.");
        }

        scanner.close();
    }  
}
