import java.util.*;
public class InverterArray {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5};

        // Mostrando o array 
        System.out.println("Array inicial:");
        System.out.println(Arrays.toString(numeros));

        // Mostrando os valores na ordem inversa
        System.out.println("Array na ordem inversa:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}