// Verificação de Triângulo (if Composto): Receba três valores de lados
//e verifique se eles podem formar um triângulo (cada lado deve ser menor
//que a soma dos outros dois).

package sla2;

import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de um dos lados do triângulo: ");
        Double n = scanner.nextDouble();

        System.out.println("Digite o valor de um dos lados do triângulo: ");
        Double n2 = scanner.nextDouble();

        System.out.println("Digite o valor de um dos lados do triângulo: ");
        Double n3 = scanner.nextDouble();

        if (n + n2 > n3 && n3 + n2 > n && n + n3 > n2) {
            System.out.println("É um triângulo!");
        } else {
            System.out.println("Não é um triângulo!");
        }

        scanner.close();
    

    }
}