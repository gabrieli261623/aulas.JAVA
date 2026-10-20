package sla2;

import java.util.Scanner;

public class bonus_salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = sc.nextDouble();

        double bonus = (salario < 2000) ? salario * 0.15 : salario * 0.10;

        double salarioFinal = salario + bonus;

        System.out.println("Bônus: R$ " + bonus);
        System.out.println("Salário final: R$ " + salarioFinal);

        sc.close();
    }
}