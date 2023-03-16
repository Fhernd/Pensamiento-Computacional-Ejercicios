// Elabore un algoritmo que lea un número y obtenga su cuadrado y su cubo.

#include <iostream>

using namespace std;

int main()
{
    int a;
    cout << "Ingrese un valor entero: ";
    cin >> a;
    
    cout << "El cuadrado de " << a << " es " << a * a << endl;
    cout << "El cubo de " << a << " es " << a * a * a << endl;
    
    return 0;
}
