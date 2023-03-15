// Un  empleado  trabaja  48  horas  en  la  semana  a  razón  de  $70.000  hora. 
// El  porcentaje  de  retención en la fuente es del 17.5% del salario bruto.
// Se desea saber cuál es el salario bruto, la retención en la fuente y el salario neto del trabajador.

#include <iostream>

using namespace std;

int main() {
    double horas_trabajadas, salario_hora, salario_bruto, retencion_fuente, salario_neto;

    cout << "Introduzca las horas trabajadas: ";
    cin >> horas_trabajadas;
    cout << "Introduzca el salario por hora: ";
    cin >> salario_hora;

    salario_bruto = horas_trabajadas * salario_hora;

    cout << "El salario bruto es: " << salario_bruto << endl;

    retencion_fuente = salario_bruto * 0.175;

    cout << "La retencion en la fuente es: " << retencion_fuente << endl;

    salario_neto = salario_bruto - retencion_fuente;

    cout << "El salario neto es: " << salario_neto << endl;

    return 0;
}
