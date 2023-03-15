// Elabore un algoritmo que lea un número y obtenga su cuadrado y su cubo.

import java.util.Scanner;

public class ex005_cuadrado_cubo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        
        System.out.print("Ingrese el valor de A: ");
        a = sc.nextInt();
        
        System.out.println("A^2 = " + (a * a));
        System.out.println("A^3 = " + (a * a * a));

        sc.close();
    }
}
