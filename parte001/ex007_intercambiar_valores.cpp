// Elabore un algoritmo que lea las variables A y B y pase el valor de A a B y de B a A. 
// Sin usar más variables.

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

    a = a + b;
    b = a - b;
    a = a - b;

    cout << "El valor de A es: " << a << endl;
    cout << "El valor de B es: " << b << endl;
    return 0;
}
