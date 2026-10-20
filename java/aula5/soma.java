public class soma {
    public static void main(String[] args) {
        
        int[] numeros = {5, 12, 8, 20, 7, 3, 15, 10, 2, 18};             
        int soma = 0;

        for (int  n: numeros) {
            soma += n; 
        }

        System.out.println("A soma de todos os elementos é: " + soma);
    }
}