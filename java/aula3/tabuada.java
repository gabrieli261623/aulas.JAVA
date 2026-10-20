package sla3;

import java.util.Scanner;

public class tabuada {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        double conta=0;

        System.out.print("Digite um número: ");
        double num = sc.nextDouble();

        while (i < 10) {
            i++;
            conta=num*i;

            System.out.println(num + "x" + i + "=" + conta);
        }
        sc.close();

    }

    
}
