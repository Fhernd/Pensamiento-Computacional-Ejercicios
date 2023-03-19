// Dados  los  tres  lados  de  un  triángulo,  haga  un  algoritmo  que  encuentre:  perímetro, 
// semiperímetro y el área del triángulo.

import java.util.Scanner;

public class ex012_lados_triangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado1, lado2, lado3, perimetro, semiperimetro, area;
        
        System.out.print("Digite el valor del lado 1 del triángulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el valor del lado 2 del triángulo: ");
        lado2 = entrada.nextDouble();
        System.out.print("Digite el valor del lado 3 del triángulo: ");
        lado3 = entrada.nextDouble();
        
        perimetro = lado1 + lado2 + lado3;
        semiperimetro = perimetro / 2;
        area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        
        System.out.println("El perímetro del triángulo es: " + perimetro);
        System.out.println("El semiperímetro del triángulo es: " + semiperimetro);
        System.out.println("El área del triángulo es: " + area);
        
        entrada.close();
    }
}
