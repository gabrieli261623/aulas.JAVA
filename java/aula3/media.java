package sla3;

import java.util.Scanner;

public class media {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 1;
        double soma = 0;

        while (i <= 4) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = sc.nextDouble();
            soma += nota;
            i++;
        }
                                
        double media = soma / 4;

        System.out.println("Média final: " + media);

        sc.close();
    }
}
