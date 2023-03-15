// Un  empleado  trabaja  48  horas  en  la  semana  a  razón  de  $70.000  hora. 
// El  porcentaje  de  retención en la fuente es del 17.5% del salario bruto.
// Se desea saber cuál es el salario bruto, la retención en la fuente y el salario neto del trabajador.

using System;

namespace parte001
{
    class ex003_empleado_salario_neto
    {
        static void Main(string[] args)
        {
            double salarioBruto, salarioNeto, retencionFuente;

            salarioBruto = 48 * 70000;

            retencionFuente = salarioBruto * 0.175;

            salarioNeto = salarioBruto - retencionFuente;

            Console.WriteLine("El salario bruto es: " + salarioBruto);
            Console.WriteLine("La retención en la fuente es: " + retencionFuente);
            Console.WriteLine("El salario neto es: " + salarioNeto);
        }
    }
}
