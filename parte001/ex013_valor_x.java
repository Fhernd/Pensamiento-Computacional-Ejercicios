// Escribir las estructuras que calculen y muestren el valor de X de acuerdo a lo siguiente: 
// X = 1 si  Y > Z 
// X = 2 si  Y <= Z

import java.util.Scanner;

public class ex013_valor_x {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y, z;
        System.out.print("Digite el valor de Y: ");
        y = entrada.nextInt();
        System.out.print("Digite el valor de Z: ");
        z = entrada.nextInt();
        
        if (y > z) {
            x = 1;
        } else {
            x = 2;
        }
        
        System.out.println("El valor de X es: " + x);
        
        entrada.close();
    }
}
