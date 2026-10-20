package sla3;

import java.util.Scanner;

public class digitarn {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Digite um número entre 1 e 50: ");
            double num = sc.nextDouble();
            
            if ((num<1) || (num>50)){
                break;
            }
        }
        sc.close();

    }

    
}
