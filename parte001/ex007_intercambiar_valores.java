// Elabore un algoritmo que lea las variables A y B y pase el valor de A a B y de B a A. 
// Sin usar más variables.

import java.util.Scanner;

public class ex007_intercambiar_valores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b;
        System.out.print("Digite el valor de A: ");
        a = entrada.nextInt();
        System.out.print("Digite el valor de B: ");
        b = entrada.nextInt();
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("El valor de A es: " + a);
        System.out.println("El valor de B es: " + b);
        
        entrada.close();
    }
}
