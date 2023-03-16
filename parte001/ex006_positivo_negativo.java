//  Elabore un algoritmo que lea un número negativo e imprima el número y el positivo del mismo. 

import java.util.Scanner;

public class ex006_positivo_negativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.print("Digite un número negativo: ");
        numero = entrada.nextInt();
        
        if (numero < 0) {
            System.out.println("El número es negativo");
            System.out.println("El número positivo es: " + (numero * -1));
        } else {
            System.out.println("El número es positivo");
            System.out.println("El número negativo es: " + (numero * -1));
        }

        entrada.close();
    }
}
