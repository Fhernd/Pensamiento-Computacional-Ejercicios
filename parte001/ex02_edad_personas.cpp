// A la mamá de Edward le preguntan su edad, y contesta:
// Tengo 3 hijos, pregúntele a Edward su edad. Germán tiene 2/3 de la edad de Edward, 
// Daniela tiene 4/3 de la edad de Edad y mi edad es la suma de las edades de los tres.
// Calcular la edad de los cuatro.

#include <iostream>

using namespace std;

int main() {
    int edad_edward, edad_german, edad_daniela, edad_mama;

    edad_edward = 30;
    edad_german = 2 * edad_edward / 3;
    edad_daniela = 4 * edad_edward / 3;
    edad_mama = edad_edward + edad_german + edad_daniela;

    cout << "La edad de Edward es: " << edad_edward << endl;
    cout << "La edad de Germán es: " << edad_german << endl;
    cout << "La edad de Daniela es: " << edad_daniela << endl;
    cout << "La edad de la mamá es: " << edad_mama << endl;

    return 0;
}
