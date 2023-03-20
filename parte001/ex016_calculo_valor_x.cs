// Escribir  las  estructuras  que  calculen  y  muestren  el  valor  de  X,  de  acuerdo  con  lo 
// siguiente: 
// X = 0    si  Y < A y (A< B < C) 
// X = 1    si  A  <=  Y <  B 
// X = 2    si  B  <=  Y < C 
// X = 3    si  C  <=  Y 
// X = 4 si no se cumple ninguna de las condiciones anteriores.

using System;

namespace Parte001
{
    class Program
    {
        static void Main(string[] args)
        {
            int y, a, b, c, x;

            Console.Write("Ingrese el valor de Y: ");
            y = Convert.ToInt32(Console.ReadLine());

            Console.Write("Ingrese el valor de A: ");
            a = Convert.ToInt32(Console.ReadLine());

            Console.Write("Ingrese el valor de B: ");
            b = Convert.ToInt32(Console.ReadLine());

            Console.Write("Ingrese el valor de C: ");
            c = Convert.ToInt32(Console.ReadLine());

            if (y < a && (a < b && b < c))
            {
                x = 0;
            }
            else if (a <= y && y < b)
            {
                x = 1;
            }
            else if (b <= y && y < c)
            {
                x = 2;
            }
            else if (c <= y)
            {
                x = 3;
            }
            else
            {
                x = 4;
            }

            Console.WriteLine("El valor de X es: " + x);

            Console.ReadKey();
        }
    }
}
