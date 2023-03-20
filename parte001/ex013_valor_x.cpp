// Escribir las estructuras que calculen y muestren el valor de X de acuerdo a lo siguiente: 
// X = 1 si  Y > Z 
// X = 2 si  Y <= Z

#include <iostream>

using namespace std;

int main()
{
    int y, z;
    cout << "Ingrese el valor de Y: ";
    cin >> y;
    cout << "Ingrese el valor de Z: ";
    cin >> z;

    cin.ignore();

    int x = y > z ? 1 : 2;

    cout << "El valor de X es: " << x << endl;
    return 0;
}
