// Haga un algoritmo que determine los parámetros A, B y C de una recta que pasa por los 
// puntos (X1, Y1) y (X2, Y2). La ecuación de la recta es:  
// AX + BY + C = 0.

import java.util.Scanner;

public class ex011_ecuacion_recta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x1, y1, x2, y2;
        double a, b, c;
        
        System.out.print("Digite el valor de X1: ");
        x1 = entrada.nextInt();
        System.out.print("Digite el valor de Y1: ");
        y1 = entrada.nextInt();
        System.out.print("Digite el valor de X2: ");
        x2 = entrada.nextInt();
        System.out.print("Digite el valor de Y2: ");
        y2 = entrada.nextInt();
        
        a = y2 - y1;
        b = x1 - x2;
        c = (x2 * y1) - (x1 * y2);
        
        System.out.println("El valor de A es: " + a);
        System.out.println("El valor de B es: " + b);
        System.out.println("El valor de C es: " + c);
        
        entrada.close();
    }
}
