// Elabore un algoritmo que lea las variables A y B y pase el valor de A a B y de B a A. 
// Sin usar más variables.

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

            c = a;
            a = b;
            b = c;

            Console.WriteLine("El valor de A es: " + a);
            Console.WriteLine("El valor de B es: " + b);

            Console.ReadKey();
        }
    }
}
