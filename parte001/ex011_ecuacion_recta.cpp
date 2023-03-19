// Haga un algoritmo que determine los parámetros A, B y C de una recta que pasa por los 
// puntos (X1, Y1) y (X2, Y2). La ecuación de la recta es:  
// AX + BY + C = 0.

#include <iostream>

using namespace std;

int main()
{
    float x1, y1, x2, y2;
    cout << "Ingrese el valor de X1: ";
    cin >> x1;
    cout << "Ingrese el valor de Y1: ";
    cin >> y1;
    cout << "Ingrese el valor de X2: ";
    cin >> x2;
    cout << "Ingrese el valor de Y2: ";
    cin >> y2;

    cin.ignore();

    float a = y2 - y1;
    float b = x1 - x2;
    float c = (x2 * y1) - (x1 * y2);

    cout << "El valor de A es: " << a << endl;
    cout << "El valor de B es: " << b << endl;
    cout << "El valor de C es: " << c << endl;
    return 0;
}
