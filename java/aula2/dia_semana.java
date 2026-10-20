// Dia da Semana (switch-case): Receba um número de 1 a 7 e imprima o dia da semana
//correspondente (1 para Domingo, 2 para Segunda, etc.).
package sla2;

import java.util.Scanner;

public class dia_semana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para o dia da semana desejado: ");
        System.out.println("1 Domingo, 2 Segunda, 3 Terça, 4 Quarta, 5 Quinta, 6 Sexta e 7 Sábado.");
        int dia = sc.nextInt();


        switch (dia) {
            case 1:
                System.out.println("Domingo!");
                break;

            case 2:
                System.out.println("Segunda!");
                break;

            case 3:
                System.out.println("Terça!");
                break;
            
            case 4:
                System.out.println("Quarta!");
                break;

            case 5:
                System.out.println("Quinta!");
                break;

            case 6:
                System.out.println("Sexta!");
                break;

            case 7:
                System.out.println("Sábado!");
                break;

            default:
                System.out.println("Opção inválida, tente novamente.");
        }

        sc.close();
    }
    
}
