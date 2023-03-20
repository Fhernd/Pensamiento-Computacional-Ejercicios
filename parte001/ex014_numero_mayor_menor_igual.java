// Hacer un algoritmo que, dados dos valores numéricos A y B, escriba un mensaje diciendo 
// si A es mayor, menor o igual a B.

import java.util.Scanner;

public class ex014_numero_mayor_menor_igual {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b;
        System.out.print("Digite el valor de A: ");
        a = entrada.nextInt();
        System.out.print("Digite el valor de B: ");
        b = entrada.nextInt();
        
        if (a > b) {
            System.out.println("A es mayor que B");
        } else if (a < b) {
            System.out.println("A es menor que B");
        } else {
            System.out.println("A es igual a B");
        }
        
        entrada.close();
    }
}
