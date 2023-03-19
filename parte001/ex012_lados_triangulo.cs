// Dados  los  tres  lados  de  un  triángulo,  haga  un  algoritmo  que  encuentre:  perímetro, 
// semiperímetro y el área del triángulo.

using System;

namespace Parte001
{
    class Program
    {
        static void Main(string[] args)
        {
            double lado1, lado2, lado3, perimetro, semiperimetro, area;

            Console.Write("Ingrese el valor del lado 1 del triángulo: ");
            lado1 = Convert.ToDouble(Console.ReadLine());

            Console.Write("Ingrese el valor del lado 2 del triángulo: ");
            lado2 = Convert.ToDouble(Console.ReadLine());

            Console.Write("Ingrese el valor del lado 3 del triángulo: ");
            lado3 = Convert.ToDouble(Console.ReadLine());

            perimetro = lado1 + lado2 + lado3;
            semiperimetro = perimetro / 2;
            area = Math.Sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));

            Console.WriteLine("El perímetro del triángulo es: " + perimetro);
            Console.WriteLine("El semiperímetro del triángulo es: " + semiperimetro);
            Console.WriteLine("El área del triángulo es: " + area);

            Console.ReadKey();
        }
    }
}
