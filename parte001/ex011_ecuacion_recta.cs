// Haga un algoritmo que determine los parámetros A, B y C de una recta que pasa por los 
// puntos (X1, Y1) y (X2, Y2). La ecuación de la recta es:  
// AX + BY + C = 0.

using System;

namespace Parte001
{
    class Program
    {
        static void Main(string[] args)
        {
            double x1, y1, x2, y2, a, b, c;

            Console.Write("Ingrese el valor de X1: ");
            x1 = Convert.ToDouble(Console.ReadLine());

            Console.Write("Ingrese el valor de Y1: ");
            y1 = Convert.ToDouble(Console.ReadLine());

            Console.Write("Ingrese el valor de X2: ");
            x2 = Convert.ToDouble(Console.ReadLine());

            Console.Write("Ingrese el valor de Y2: ");
            y2 = Convert.ToDouble(Console.ReadLine());

            a = y2 - y1;
            b = x1 - x2;
            c = (x2 * y1) - (x1 * y2);

            Console.WriteLine("El valor de A es: " + a);
            Console.WriteLine("El valor de B es: " + b);
            Console.WriteLine("El valor de C es: " + c);

            Console.ReadKey();
        }
    }
}
