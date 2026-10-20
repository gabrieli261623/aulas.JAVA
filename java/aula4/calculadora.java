package sla4;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== CALCULADORA AVANÇADA ===");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 5) {
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();

                double resultado = 0;

                switch (opcao) {
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("Resultado: " + resultado);
                        break;

                    case 2:
                        resultado = num1 - num2;
                        System.out.println("Resultado: " + resultado);
                        break;

                    case 3:
                        resultado = num1 * num2;
                        System.out.println("Resultado: " + resultado);
                        break;

                    case 4:
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            System.out.println("Resultado: " + resultado);
                        } else {
                            System.out.println("Erro: divisão por zero!");
                        }
                        break;

                    case 5:
                        resultado = Math.pow(num1, num2);
                        System.out.println("Resultado: " + resultado);
                        break;
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}