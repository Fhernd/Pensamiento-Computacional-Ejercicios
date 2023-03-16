//  Elabore un algoritmo que lea un número negativo e imprima el número y el positivo del mismo. 

#include <iostream>

using namespace std;

int main()
{
    int numero;
    cout << "Ingrese un numero negativo: ";
    cin >> numero;

    cin.ignore();

    cout << "El numero positivo es: " << numero * -1 << endl;
    return 0;
}
