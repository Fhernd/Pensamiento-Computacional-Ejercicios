// A la mamá de Edward le preguntan su edad, y contesta:
// Tengo 3 hijos, pregúntele a Edward su edad. Germán tiene 2/3 de la edad de Edward, 
// Daniela tiene 4/3 de la edad de Edad y mi edad es la suma de las edades de los tres.
// Calcular la edad de los cuatro.

namespace parte001
{
    class ex02_edad_personas
    {
        static void Main(string[] args)
        {
            double edadEdward, edadGermán, edadDaniela, edadMamá;

            Console.Write("Introduzca la edad de Edward: ");
            edadEdward = Convert.ToDouble(Console.ReadLine());

            edadGermán = (2.0 / 3.0) * edadEdward;

            edadDaniela = (4.0 / 3.0) * edadEdward;

            edadMamá = edadEdward + edadGermán + edadDaniela;

            Console.WriteLine("La edad de Germán es: " + edadGermán);
            Console.WriteLine("La edad de Daniela es: " + edadDaniela);
            Console.WriteLine("La edad de la mamá es: " + edadMamá);
        }
    }
}
