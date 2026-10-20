package sla4;

import java.util.Scanner;

public class temperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do { //faz com q repita  "do"
            System.out.println("\nConverter temperatura");
            System.out.println("1-Celsius - Fahrenheit");
            System.out.println("2-Fahrenheit - Celsius");
            System.out.println("3-Celsius - Kelvin");
            System.out.println("0-Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 3) {
                System.out.print("Digite a temperatura: ");
                double temp = scanner.nextDouble();
                double resultado;

                switch (opcao) {
                    case 1:
                        resultado = (temp * 9/5) + 32;
                        System.out.println("Resultado: " + resultado + " °F");
                        break;

                    case 2:
                        resultado = (temp - 32) * 5/9;
                        System.out.println("Resultado: " + resultado + " °C");
                        break;

                    case 3:
                        resultado = temp + 273.15;
                        System.out.println("Resultado: " + resultado + " K");
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
