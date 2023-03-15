//  Escriba un algoritmo que, dados dos valores A y B, encuentre:  
// A - B 
// A + B 
// A * B 
// A / B
// A % B

import java.util.Scanner;

public class ex004_aritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        System.out.print("Ingrese el valor de A: ");
        a = sc.nextInt();
        
        System.out.print("Ingrese el valor de B: ");
        b = sc.nextInt();
        
        System.out.println("A - B = " + (a - b));
        System.out.println("A + B = " + (a + b));
        System.out.println("A * B = " + (a * b));
        System.out.println("A / B = " + (a / b));
        System.out.println("A % B = " + (a % b));
    }
}
