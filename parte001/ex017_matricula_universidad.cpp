// Cierta  universidad  para  liquidar  el  pago  de  matrícula  de  un  estudiante  le  exige  los 
// siguientes datos: 
// - Número de inscripción  
// - Nombres 
// - Patrimonio. 
// - Estrato social. 
// La universidad cobra un valor constante para cada estudiante de $100.000. Si el patrimonio 
// es mayor que $4'000.000 y el estrato superior a 3, se le incrementa un porcentaje del 5% 
// sobre el patrimonio. Hacer un algoritmo que muestre: 
// - Número de inscripción. 
// - Nombres. 
// - Pago de matrícula.

#include <iostream>

using namespace std;

int main()
{
    int numero_inscripcion;
    string nombres;
    float patrimonio;
    int estrato_social;

    cout << "Ingrese el numero de inscripcion: ";
    cin >> numero_inscripcion;

    cout << "Ingrese los nombres: ";
    cin >> nombres;

    cout << "Ingrese el patrimonio: ";
    cin >> patrimonio;

    cout << "Ingrese el estrato social: ";
    cin >> estrato_social;

    cin.ignore();

    float pago_matricula = 100000;

    if (patrimonio > 4000000 && estrato_social > 3)
    {
        pago_matricula += pago_matricula * 0.05;
    }

    cout << "Numero de inscripcion: " << numero_inscripcion << endl;
    cout << "Nombres: " << nombres << endl;
    cout << "Pago de matricula: " << pago_matricula << endl;

    return 0;
}
