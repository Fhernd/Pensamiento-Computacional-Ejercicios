// Dado el radio de un círculo. Haga un algoritmo que obtenga el área del círculo y la longitud 
// de la circunferencia.

using System;

namespace Parte001
{
    class Program
    {
        static void Main(string[] args)
        {
            double radio, area, longitud;

            Console.Write("Ingrese el radio del círculo: ");
            radio = Convert.ToDouble(Console.ReadLine());

            area = Math.PI * Math.Pow(radio, 2);
            longitud = 2 * Math.PI * radio;

            Console.WriteLine("El área del círculo es: " + area);
            Console.WriteLine("La longitud de la circunferencia es: " + longitud);

            Console.ReadKey();
        }
    }
}
