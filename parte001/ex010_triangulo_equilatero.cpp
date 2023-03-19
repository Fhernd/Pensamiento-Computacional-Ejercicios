// Dado  el  valor  del  lado  en  un  triángulo  equilátero, haga  un  algoritmo  que  obtenga  el 
// perímetro, el valor de la altura y el área del triángulo.

#include <iostream>

using namespace std;

int main()
{
    float lado;
    cout << "Ingrese el valor del lado: ";
    cin >> lado;

    cin.ignore();

    float perimetro = lado * 3;
    float altura = lado * 0.866;
    float area = (lado * altura) / 2;

    cout << "El perimetro del triangulo es: " << perimetro << endl;
    cout << "La altura del triangulo es: " << altura << endl;
    cout << "El area del triangulo es: " << area << endl;
    return 0;
}
