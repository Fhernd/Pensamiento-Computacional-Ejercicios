// Escribir un algoritmo que acepte tres números enteros diferentes y muestre el mayor de ellos.

using System;

namespace Parte001
{
    class Program
    {
        static void Main(string[] args)
        {
            int a, b, c;

            Console.Write("Ingrese el valor de A: ");
            a = Convert.ToInt32(Console.ReadLine());

            Console.Write("Ingrese el valor de B: ");
            b = Convert.ToInt32(Console.ReadLine());

            Console.Write("Ingrese el valor de C: ");
            c = Convert.ToInt32(Console.ReadLine());

            if (a > b && a > c)
            {
                Console.WriteLine("A es el mayor");
            }
            else if (b > a && b > c)
            {
                Console.WriteLine("B es el mayor");
            }
            else if (c > a && c > b)
            {
                Console.WriteLine("C es el mayor");
            }
            else
            {
                Console.WriteLine("Los números son iguales");
            }

            Console.ReadKey();
        }
    }
}
