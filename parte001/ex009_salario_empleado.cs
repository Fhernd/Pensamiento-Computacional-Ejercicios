// Se tiene la siguiente información de un empleado: 
// - código del empleado, 
// - nombres, 
// - número de horas trabajadas al mes, 
// - valor hora trabajada, 
// - porcentaje de retención en la fuente.
// Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto.

using System;

namespace Parte001
{
    class Program
    {
        static void Main(string[] args)
        {
            int codigo, horas;
            double valorHora, porcentajeRetencion, salarioBruto, salarioNeto;
            string nombres;

            Console.Write("Ingrese el código del empleado: ");
            codigo = Convert.ToInt32(Console.ReadLine());

            Console.Write("Ingrese los nombres del empleado: ");
            nombres = Console.ReadLine();

            Console.Write("Ingrese el número de horas trabajadas al mes: ");
            horas = Convert.ToInt32(Console.ReadLine());

            Console.Write("Ingrese el valor de la hora trabajada: ");
            valorHora = Convert.ToDouble(Console.ReadLine());

            Console.Write("Ingrese el porcentaje de retención en la fuente: ");
            porcentajeRetencion = Convert.ToDouble(Console.ReadLine());

            salarioBruto = horas * valorHora;
            salarioNeto = salarioBruto - (salarioBruto * porcentajeRetencion / 100);

            Console.WriteLine("Código: " + codigo);
            Console.WriteLine("Nombres: " + nombres);
            Console.WriteLine("Salario bruto: " + salarioBruto);
            Console.WriteLine("Salario neto: " + salarioNeto);

            Console.ReadKey();
        }
    }
}
