//  Escriba un algoritmo que, dados dos valores A y B, encuentre:  
// A - B 
// A + B 
// A * B 
// A / B
// A % B

using System;

namespace parte001
{
    class ex004_aritmetica
    {
        public static void Main(string[] args)
        {
            int a, b;
            
            Console.Write("Introduzca el valor de A: ");
            a = Convert.ToInt32(Console.ReadLine());
            
            Console.Write("Introduzca el valor de B: ");
            b = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("A - B = {0}", a - b);
            Console.WriteLine("A + B = {0}", a + b);
            Console.WriteLine("A * B = {0}", a * b);
            Console.WriteLine("A / B = {0}", a / b);
            Console.WriteLine("A % B = {0}", a % b);
        }
    }
}
