//  Elabore un algoritmo que lea un número negativo e imprima el número y el positivo del mismo. 

using System;

namespace Parte001
{
    class Program
    {
        static void Main(string[] args)
        {
            int numero;

            Console.Write("Ingrese un número: ");
            numero = Convert.ToInt32(Console.ReadLine());

            if (numero < 0)
            {
                Console.WriteLine("El número es negativo");
                Console.WriteLine("El número positivo es: " + numero * -1);
            }
            else
            {
                Console.WriteLine("El número es positivo");
                Console.WriteLine("El número negativo es: " + numero * -1);
            }

            Console.ReadKey();
        }
    }
}
