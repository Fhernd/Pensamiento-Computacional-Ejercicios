// Escribir un algoritmo que acepte tres números enteros diferentes y muestre el mayor de ellos.

import java.util.Scanner;

public class ex018_mayor_tres_numeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c;
        System.out.print("Digite el valor de A: ");
        a = entrada.nextInt();
        System.out.print("Digite el valor de B: ");
        b = entrada.nextInt();
        System.out.print("Digite el valor de C: ");
        c = entrada.nextInt();
        
        if (a > b && a > c) {
            System.out.println("A es el mayor");
        } else if (b > a && b > c) {
            System.out.println("B es el mayor");
        } else if (c > a && c > b) {
            System.out.println("C es el mayor");
        } else {
            System.out.println("Los números son iguales");
        }
        
        entrada.close();
    }
}
