// Si  A,  B,  C,  D  y  E  son  condiciones  de  tipo  lógico,  construir  las  estructuras 
// correspondientes que muestren: 
// - A y B (Parte verdadera de A y parte verdadera de B).  
// - A y no B y C (Parte verdadera de A, parte falsa de B y parte verdadera de C).  
// - A y no B y no C. 
// - No A (y luego seguirá explorando D y, en su caso, E). 
// - No A y D y E. 
// - No A y D y no E. 
// - No A y no D. 

import java.util.Scanner;

public class ex015_condiciones_logicas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean a, b, c, d, e;
        System.out.print("Digite el valor de A: ");
        a = entrada.nextBoolean();
        System.out.print("Digite el valor de B: ");
        b = entrada.nextBoolean();
        System.out.print("Digite el valor de C: ");
        c = entrada.nextBoolean();
        System.out.print("Digite el valor de D: ");
        d = entrada.nextBoolean();
        System.out.print("Digite el valor de E: ");
        e = entrada.nextBoolean();
        
        // A y B (Parte verdadera de A y parte verdadera de B).  
        if (a && b) {
            System.out.println("A y B son verdaderas");
        } else {
            System.out.println("A y B son falsas");
        }
        
        // A y no B y C (Parte verdadera de A, parte falsa de B y parte verdadera de C).  
        if (a && !b && c) {
            System.out.println("A y no B y C son verdaderas");
        } else {
            System.out.println("A y no B y C son falsas");
        }
        
        // A y no B y no C. 
        if (a && !b && !c) {
            System.out.println("A y no B y no C son verdaderas");
        } else {
            System.out.println("A y no B y no C son falsas");
        }
        
        // No A (y luego seguirá explorando D y, en su caso, E). 
        if (!a) {
            System.out.println("No A es verdadera");
        } else {
            System.out.println("No A es falsa");
        }
        
        // No A y D y E. 
        if (!a && d && e) {
            System.out.println("No A y D y E son verdaderas");
        } else {
            System.out.println("No A y D y E son falsas");
        }
        
        // No A y D y no E. 
        if (!a && d && !e) {
            System.out.println("No A y D y no E son verdaderas");
        } else {
            System.out.println("No A y D y no E son falsas");
        }

        // No A y no D.
        if (!a && !d) {
            System.out.println("No A y no D son verdaderas");
        } else {
            System.out.println("No A y no D son falsas");
        }

        entrada.close();
    }
}
