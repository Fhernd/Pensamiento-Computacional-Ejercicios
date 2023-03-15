#include <iostream>

using namespace std;

int main() {
    double base, altura, area, perimetro;

    cout << "Introduzca la base del rectangulo: ";
    cin >> base;
    cout << "Introduzca la altura del rectangulo: ";
    cin >> altura;

    area = base * altura;

    cout << "El area del rectangulo es: " << area << endl;

    perimetro = 2 * (base + altura);

    cout << "El perimetro del rectangulo es: " << perimetro << endl;

    return 0;
}