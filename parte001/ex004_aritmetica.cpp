//  Escriba un algoritmo que, dados dos valores A y B, encuentre:  
// A - B 
// A + B 
// A * B 
// A / B
// A % B

#include <iostream>

using namespace std;

int main()
{
    int a, b;
    cout << "Ingrese dos valores enteros: ";
    cin >> a >> b;
    
    cout << "A - B = " << a - b << endl;
    cout << "A + B = " << a + b << endl;
    cout << "A * B = " << a * b << endl;
    cout << "A / B = " << a / b << endl;
    cout << "A % B = " << a % b << endl;
    
    return 0;
}
