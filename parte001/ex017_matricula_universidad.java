// Cierta  universidad  para  liquidar  el  pago  de  matrícula  de  un  estudiante  le  exige  los 
// siguientes datos: 
// - Número de inscripción  
// - Nombres 
// - Patrimonio. 
// - Estrato social. 
// La universidad cobra un valor constante para cada estudiante de $100.000. Si el patrimonio 
// es mayor que $4'000.000 y el estrato superior a 3, se le incrementa un porcentaje del 5% 
// sobre el patrimonio. Hacer un algoritmo que muestre: 
// - Número de inscripción. 
// - Nombres. 
// - Pago de matrícula.

import java.util.Scanner;

public class ex017_matricula_universidad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numeroInscripcion, estrato;
        double patrimonio, pagoMatricula;
        String nombres;
        
        System.out.print("Digite el número de inscripción: ");
        numeroInscripcion = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Digite los nombres: ");
        nombres = entrada.nextLine();
        System.out.print("Digite el patrimonio: ");
        patrimonio = entrada.nextDouble();
        System.out.print("Digite el estrato social: ");
        estrato = entrada.nextInt();
        
        pagoMatricula = 100000;
        
        if (patrimonio > 4000000 && estrato > 3) {
            pagoMatricula += pagoMatricula * 0.05;
        }
        
        System.out.println("Número de inscripción: " + numeroInscripcion);
        System.out.println("Nombres: " + nombres);
        System.out.println("Pago de matrícula: " + pagoMatricula);
        
        entrada.close();
    }
}
