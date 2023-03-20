// Escribir las estructuras que calculen y muestren el valor de X de acuerdo a lo siguiente: 
// X = 1 si  Y > Z 
// X = 2 si  Y <= Z

using System;

namespace Parte001
{
    class Program
    {
        static void Main(string[] args)
        {
            int y, z, x;

            Console.Write("Ingrese el valor de Y: ");
            y = Convert.ToInt32(Console.ReadLine());

            Console.Write("Ingrese el valor de Z: ");
            z = Convert.ToInt32(Console.ReadLine());

            if (y > z)
            {
                x = 1;
            }
            else
            {
                x = 2;
            }

            Console.WriteLine("El valor de X es: " + x);

            Console.ReadKey();
        }
    }
}
