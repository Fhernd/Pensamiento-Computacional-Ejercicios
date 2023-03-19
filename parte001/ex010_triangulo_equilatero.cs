// Dado  el  valor  del  lado  en  un  triángulo  equilátero, haga  un  algoritmo  que  obtenga  el 
// perímetro, el valor de la altura y el área del triángulo.

using System;

namespace Parte001
{
    class Program
    {
        static void Main(string[] args)
        {
            double lado, perimetro, altura, area;

            Console.Write("Ingrese el valor del lado del triángulo equilátero: ");
            lado = Convert.ToDouble(Console.ReadLine());

            perimetro = lado * 3;
            altura = Math.Sqrt(3) * lado / 2;
            area = Math.Pow(lado, 2) * Math.Sqrt(3) / 4;

            Console.WriteLine("El perímetro del triángulo equilátero es: " + perimetro);
            Console.WriteLine("La altura del triángulo equilátero es: " + altura);
            Console.WriteLine("El área del triángulo equilátero es: " + area);

            Console.ReadKey();
        }
    }
}
