package sla2;

import java.util.Scanner;

public class aprovacao_escola {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua nota de 1 a 10: ");
        double nota = sc.nextDouble();

        if (nota >= 7 && nota <= 10){
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}