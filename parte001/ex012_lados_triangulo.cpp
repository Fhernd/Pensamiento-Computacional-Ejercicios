// Dados  los  tres  lados  de  un  triángulo,  haga  un  algoritmo  que  encuentre:  perímetro, 
// semiperímetro y el área del triángulo.

#include <iostream>

using namespace std;

int main()
{
    float lado1, lado2, lado3;
    cout << "Ingrese el valor del lado 1: ";
    cin >> lado1;
    cout << "Ingrese el valor del lado 2: ";
    cin >> lado2;
    cout << "Ingrese el valor del lado 3: ";
    cin >> lado3;

    cin.ignore();

    float perimetro = lado1 + lado2 + lado3;
    float semiperimetro = perimetro / 2;
    float area = sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));

    cout << "El perimetro del triangulo es: " << perimetro << endl;
    cout << "El semiperimetro del triangulo es: " << semiperimetro << endl;
    cout << "El area del triangulo es: " << area << endl;
    return 0;
}
