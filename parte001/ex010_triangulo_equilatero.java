// Dado  el  valor  del  lado  en  un  triángulo  equilátero, haga  un  algoritmo  que  obtenga  el 
// perímetro, el valor de la altura y el área del triángulo.

import java.util.Scanner;

public class ex010_triangulo_equilatero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado, perimetro, altura, area;
        
        System.out.print("Digite el valor del lado del triángulo equilátero: ");
        lado = entrada.nextDouble();
        
        perimetro = lado * 3;
        altura = Math.sqrt(3) * lado / 2;
        area = (lado * altura) / 2;
        
        System.out.println("El perímetro del triángulo equilátero es: " + perimetro);
        System.out.println("La altura del triángulo equilátero es: " + altura);
        System.out.println("El área del triángulo equilátero es: " + area);
        
        entrada.close();
    }
}
