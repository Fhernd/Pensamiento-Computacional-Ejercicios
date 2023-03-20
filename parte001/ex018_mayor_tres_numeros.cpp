// Escribir un algoritmo que acepte tres números enteros diferentes y muestre el mayor de ellos.

#include <iostream>

using namespace std;

int main()
{
    int a, b, c;
    cout << "Ingrese el valor de A: ";
    cin >> a;
    cout << "Ingrese el valor de B: ";
    cin >> b;
    cout << "Ingrese el valor de C: ";
    cin >> c;

    cin.ignore();

    if (a > b && a > c)
    {
        cout << "A es el mayor" << endl;
    }
    else if (b > a && b > c)
    {
        cout << "B es el mayor" << endl;
    }
    else
    {
        cout << "C es el mayor" << endl;
    }

    return 0;
}
