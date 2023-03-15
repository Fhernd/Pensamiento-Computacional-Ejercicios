import java.util.Scanner;

public class ex01_area_rectangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la base del rectángulo: ");
        double base = teclado.nextDouble();
        teclado.nextLine();
        
        System.out.print("Introduzca la altura del rectángulo: ");
        double altura = teclado.nextDouble();
        teclado.nextLine();

        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);

        double perimetro = 2 * (base + altura);
        System.out.println("El perímetro del rectángulo es: " + perimetro);

        teclado.close();
    }
}
