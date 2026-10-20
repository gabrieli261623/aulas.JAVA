// Classificação de Idade (if-else if): Leia a idade de uma pessoa
//e classifique-a em: Criança (0-12), Adolescente (13-17), Adulto (18-59) ou Idoso (60+).
package sla2;

import java.util.Scanner;

public class idade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        double idade = sc.nextDouble();

        if (idade <13){
            System.out.println("Criança (0-12)");
        } else if (idade <18){
            System.out.println("Adolescente (13-17)");
        } else if (idade <60){
            System.out.println("Adulto (18-59)");
        } else {
            System.out.println("Idoso (60+)");
        }

        sc.close();
    }
    
}
