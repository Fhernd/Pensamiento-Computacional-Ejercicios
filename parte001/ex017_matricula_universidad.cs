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

using System;

namespace Parte001
{
    class Program
    {
        static void Main(string[] args)
        {
            int numeroInscripcion, estrato;
            double patrimonio, pagoMatricula;
            string nombres;

            Console.Write("Ingrese el número de inscripción: ");
            numeroInscripcion = Convert.ToInt32(Console.ReadLine());

            Console.Write("Ingrese los nombres: ");
            nombres = Console.ReadLine();

            Console.Write("Ingrese el patrimonio: ");
            patrimonio = Convert.ToDouble(Console.ReadLine());

            Console.Write("Ingrese el estrato social: ");
            estrato = Convert.ToInt32(Console.ReadLine());

            pagoMatricula = 100000;

            if (patrimonio > 4000000 && estrato > 3)
            {
                pagoMatricula += pagoMatricula * 0.05;
            }

            Console.WriteLine("Número de inscripción: " + numeroInscripcion);
            Console.WriteLine("Nombres: " + nombres);
            Console.WriteLine("Pago de matrícula: " + pagoMatricula);

            Console.ReadKey();
        }
    }
}
