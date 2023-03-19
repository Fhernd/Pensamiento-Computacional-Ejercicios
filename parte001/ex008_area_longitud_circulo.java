// Dado el radio de un círculo. Haga un algoritmo que obtenga el área del círculo y la longitud 
// de la circunferencia.

import java.util.Scanner;

public class ex008_area_longitud_circulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double radio, area, longitud;
        
        System.out.print("Digite el radio del círculo: ");
        radio = entrada.nextDouble();
        
        area = Math.PI * Math.pow(radio, 2);
        longitud = 2 * Math.PI * radio;
        
        System.out.println("El área del círculo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + longitud);
        
        entrada.close();
    }
}
