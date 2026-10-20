// package sla3;

// import java.util.Scanner;

// public class soma {
// int i=0
//     while(True){
//         public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         i++;
//         System.out.print("Digite um número: " + i);
//         double num(i) = sc.nextDouble();
//         }
//     }
//     Double resultado = num1+num2+num3+num4+num5
//     System.out.print(resultado);

    
// }

package sla3;

import java.util.Scanner;

public class soma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double resultado = 0;
        int i = 1;

        while (i <= 5) {
            System.out.print("Digite um número " + i + ": ");
            double num = sc.nextDouble();
            resultado += num;
            i++;
        }

        System.out.println("Resultado da soma: " + resultado);
        sc.close();
    }
}