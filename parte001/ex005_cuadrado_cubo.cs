// Elabore un algoritmo que lea un número y obtenga su cuadrado y su cubo.

using System;

namespace parte001
{
    class ex005_cuadrado_cubo
    {
        public static void Main(string[] args)
        {
            int numero;
            
            Console.Write("Introduzca un número: ");
            numero = Convert.ToInt32(Console.ReadLine());
            
            Console.WriteLine("El cuadrado de {0} es {1}", numero, numero * numero);
            Console.WriteLine("El cubo de {0} es {1}", numero, numero * numero * numero);
        }
    }
}
