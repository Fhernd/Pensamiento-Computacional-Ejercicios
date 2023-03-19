// Dado el radio de un círculo. Haga un algoritmo que obtenga el área del círculo y la longitud 
// de la circunferencia.

#include <iostream>

using namespace std;

int main()
{
    float radio;
    cout << "Ingrese el radio del circulo: ";
    cin >> radio;

    cin.ignore();

    float area = 3.1416 * radio * radio;
    float longitud = 2 * 3.1416 * radio;

    cout << "El area del circulo es: " << area << endl;
    cout << "La longitud de la circunferencia es: " << longitud << endl;
    return 0;
}
