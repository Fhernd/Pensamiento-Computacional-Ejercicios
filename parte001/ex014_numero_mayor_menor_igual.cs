// Hacer un algoritmo que, dados dos valores numéricos A y B, escriba un mensaje diciendo 
// si A es mayor, menor o igual a B.

using System;

namespace Parte001
{
    class Program
    {
        static void Main(string[] args)
        {
            int a, b;

            Console.Write("Ingrese el valor de A: ");
            a = Convert.ToInt32(Console.ReadLine());

            Console.Write("Ingrese el valor de B: ");
            b = Convert.ToInt32(Console.ReadLine());

            if (a > b)
            {
                Console.WriteLine("A es mayor que B");
            }
            else if (a < b)
            {
                Console.WriteLine("A es menor que B");
            }
            else
            {
                Console.WriteLine("A es igual a B");
            }

            Console.ReadKey();
        }
    }
}
