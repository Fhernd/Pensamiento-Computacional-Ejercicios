// Un  empleado  trabaja  48  horas  en  la  semana  a  razón  de  $70.000  hora. 
// El  porcentaje  de  retención en la fuente es del 17.5% del salario bruto.
// Se desea saber cuál es el salario bruto, la retención en la fuente y el salario neto del trabajador.

import java.util.Scanner;

public class ex003_empleado_salario_neto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el salario por hora: ");
        double salarioHora = teclado.nextDouble();
        teclado.nextLine();

        System.out.print("Introduzca el número de horas trabajadas: ");
        double horasTrabajadas = teclado.nextDouble();
        teclado.nextLine();

        double salarioBruto = salarioHora * horasTrabajadas;
        double retención = 0.175 * salarioBruto;
        double salarioNeto = salarioBruto - retención;

        System.out.println("El salario bruto es: " + salarioBruto);
        System.out.println("La retención es: " + retención);
        System.out.println("El salario neto es: " + salarioNeto);

        teclado.close();
    }
}
