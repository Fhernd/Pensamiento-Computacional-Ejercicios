// Si  A,  B,  C,  D  y  E  son  condiciones  de  tipo  lógico,  construir  las  estructuras 
// correspondientes que muestren: 
// - A y B (Parte verdadera de A y parte verdadera de B).  
// - A y no B y C (Parte verdadera de A, parte falsa de B y parte verdadera de C).  
// - A y no B y no C. 
// - No A (y luego seguirá explorando D y, en su caso, E). 
// - No A y D y E. 
// - No A y D y no E. 
// - No A y no D. 

using System;

namespace Parte001
{
    class Program
    {
        static void Main(string[] args)
        {
            bool a, b, c, d, e;

            Console.Write("Ingrese el valor de A: ");
            a = Convert.ToBoolean(Console.ReadLine());

            Console.Write("Ingrese el valor de B: ");
            b = Convert.ToBoolean(Console.ReadLine());

            Console.Write("Ingrese el valor de C: ");
            c = Convert.ToBoolean(Console.ReadLine());

            Console.Write("Ingrese el valor de D: ");
            d = Convert.ToBoolean(Console.ReadLine());

            Console.Write("Ingrese el valor de E: ");
            e = Convert.ToBoolean(Console.ReadLine());

            Console.WriteLine("A y B: " + (a && b));
            Console.WriteLine("A y no B y C: " + (a && !b && c));
            Console.WriteLine("A y no B y no C: " + (a && !b && !c));
            Console.WriteLine("No A: " + (!a));
            Console.WriteLine("No A y D y E: " + (!a && d && e));
            Console.WriteLine("No A y D y no E: " + (!a && d && !e));
            Console.WriteLine("No A y no D: " + (!a && !d));

            Console.ReadKey();
        }
    }
}
