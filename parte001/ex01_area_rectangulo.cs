namespace parte001
{
    class ex01_area_rectangulo
    {
        static void Main(string[] args)
        {
            double baseRectangulo, alturaRectangulo, areaRectangulo, perimetro;

            Console.Write("Introduzca la base del rectángulo: ");
            baseRectangulo = Convert.ToDouble(Console.ReadLine());

            Console.Write("Introduzca la altura del rectángulo: ");
            alturaRectangulo = Convert.ToDouble(Console.ReadLine());

            areaRectangulo = baseRectangulo * alturaRectangulo;

            Console.WriteLine("El área del rectángulo es: " + areaRectangulo);

            perimetro = (baseRectangulo + alturaRectangulo) * 2;

            Console.WriteLine("El perímetro del rectángulo es: " + perimetro);
        }
    }
}
