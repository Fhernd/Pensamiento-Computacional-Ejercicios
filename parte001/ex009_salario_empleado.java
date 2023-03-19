// Se tiene la siguiente información de un empleado: 
// - código del empleado, 
// - nombres, 
// - número de horas trabajadas al mes, 
// - valor hora trabajada, 
// - porcentaje de retención en la fuente.
// Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto.

import java.util.Scanner;

public class ex009_salario_empleado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int codigo, horas;
        double valorHora, retencion, salarioBruto, salarioNeto;
        String nombres;
        
        System.out.print("Digite el código del empleado: ");
        codigo = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Digite los nombres del empleado: ");
        nombres = entrada.nextLine();
        System.out.print("Digite el número de horas trabajadas al mes: ");
        horas = entrada.nextInt();
        System.out.print("Digite el valor hora trabajada: ");
        valorHora = entrada.nextDouble();
        System.out.print("Digite el porcentaje de retención en la fuente: ");
        retencion = entrada.nextDouble();
        
        salarioBruto = horas * valorHora;
        salarioNeto = salarioBruto - (salarioBruto * (retencion / 100));
        
        System.out.println("Código: " + codigo);
        System.out.println("Nombres: " + nombres);
        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Salario neto: " + salarioNeto);
        
        entrada.close();
    }
}
