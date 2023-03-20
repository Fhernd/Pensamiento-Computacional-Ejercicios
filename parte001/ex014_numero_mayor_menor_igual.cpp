// Hacer un algoritmo que, dados dos valores numéricos A y B, escriba un mensaje diciendo 
// si A es mayor, menor o igual a B.

#include <iostream>

using namespace std;

int main()
{
    int a, b;
    cout << "Ingrese el valor de A: ";
    cin >> a;
    cout << "Ingrese el valor de B: ";
    cin >> b;

    cin.ignore();

    if (a > b)
    {
        cout << "A es mayor que B" << endl;
    }
    else if (a < b)
    {
        cout << "A es menor que B" << endl;
    }
    else
    {
        cout << "A es igual a B" << endl;
    }

    return 0;
}
