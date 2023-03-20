// Si  A,  B,  C,  D  y  E  son  condiciones  de  tipo  lógico,  construir  las  estructuras 
// correspondientes que muestren: 
// - A y B (Parte verdadera de A y parte verdadera de B).  
// - A y no B y C (Parte verdadera de A, parte falsa de B y parte verdadera de C).  
// - A y no B y no C. 
// - No A (y luego seguirá explorando D y, en su caso, E). 
// - No A y D y E. 
// - No A y D y no E. 
// - No A y no D. 

#include <iostream>

using namespace std;

int main()
{
    bool a = true;
    bool b = false;
    bool c = true;
    bool d = false;
    bool e = true;

    cout << "A y B: " << (a && b) << endl;
    cout << "A y no B y C: " << (a && !b && c) << endl;
    cout << "A y no B y no C: " << (a && !b && !c) << endl;
    cout << "No A: " << (!a) << endl;
    cout << "No A y D y E: " << (!a && d && e) << endl;
    cout << "No A y D y no E: " << (!a && d && !e) << endl;
    cout << "No A y no D: " << (!a && !d) << endl;

    return 0;
}
