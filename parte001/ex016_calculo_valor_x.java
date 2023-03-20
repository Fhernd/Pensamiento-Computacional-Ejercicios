// Escribir  las  estructuras  que  calculen  y  muestren  el  valor  de  X,  de  acuerdo  con  lo 
// siguiente: 
// X = 0    si  Y < A y (A< B < C) 
// X = 1    si  A  <=  Y <  B 
// X = 2    si  B  <=  Y < C 
// X = 3    si  C  <=  Y 
// X = 4 si no se cumple ninguna de las condiciones anteriores.

import java.util.Scanner;

public class ex016_calculo_valor_x {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y, a, b, c;
        System.out.print("Digite el valor de Y: ");
        y = entrada.nextInt();
        System.out.print("Digite el valor de A: ");
        a = entrada.nextInt();
        System.out.print("Digite el valor de B: ");
        b = entrada.nextInt();
        System.out.print("Digite el valor de C: ");
        c = entrada.nextInt();
        
        if (y < a && a < b && b < c) {
            x = 0;
        } else if (a <= y && y < b) {
            x = 1;
        } else if (b <= y && y < c) {
            x = 2;
        } else if (c <= y) {
            x = 3;
        } else {
            x = 4;
        }
        
        System.out.println("El valor de X es: " + x);
        
        entrada.close();
    }
}
