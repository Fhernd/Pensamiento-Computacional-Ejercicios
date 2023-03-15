import java.util.Scanner;

// A la mamá de Edward le preguntan su edad, y contesta:
// Tengo 3 hijos, pregúntele a Edward su edad. Germán tiene 2/3 de la edad de Edward, 
// Daniela tiene 4/3 de la edad de Edad y mi edad es la suma de las edades de los tres.
// Calcular la edad de los cuatro.

public class ex02_edad_personas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la edad de Edward: ");
        double edadEdward = teclado.nextDouble();
        teclado.nextLine();

        double edadGermán = 2.0 / 3.0 * edadEdward;
        double edadDaniela = 4.0 / 3.0 * edadEdward;
        double edadMamá = edadGermán + edadDaniela + edadEdward;

        System.out.println("La edad de Germán es: " + edadGermán);
        System.out.println("La edad de Daniela es: " + edadDaniela);
        System.out.println("La edad de la mamá es: " + edadMamá);

        teclado.close();
    }
}
