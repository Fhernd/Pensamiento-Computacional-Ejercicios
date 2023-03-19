// Se tiene la siguiente información de un empleado: 
// - código del empleado, 
// - nombres, 
// - número de horas trabajadas al mes, 
// - valor hora trabajada, 
// - porcentaje de retención en la fuente.
// Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto.

#include <iostream>

using namespace std;

int main()
{
    int codigo;
    string nombres;
    int horas;
    float valor_hora;
    float porcentaje_retencion;

    cout << "Ingrese el codigo del empleado: ";
    cin >> codigo;

    cout << "Ingrese los nombres del empleado: ";
    cin >> nombres;

    cout << "Ingrese el numero de horas trabajadas al mes: ";
    cin >> horas;

    cout << "Ingrese el valor hora trabajada: ";
    cin >> valor_hora;

    cout << "Ingrese el porcentaje de retencion en la fuente: ";
    cin >> porcentaje_retencion;

    cin.ignore();

    float salario_bruto = horas * valor_hora;
    float salario_neto = salario_bruto - (salario_bruto * porcentaje_retencion / 100);

    cout << "Codigo: " << codigo << endl;
    cout << "Nombres: " << nombres << endl;
    cout << "Salario bruto: " << salario_bruto << endl;
    cout << "Salario neto: " << salario_neto << endl;

    return 0;
}
