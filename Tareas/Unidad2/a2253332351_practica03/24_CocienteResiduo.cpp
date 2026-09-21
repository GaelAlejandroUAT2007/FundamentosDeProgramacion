#include <iostream>
using namespace std;

int main() {
    int divisor, dividendo, residuo, ciclo;

    cout << "Introduce el valor de divisor: ";
    cin >> divisor;
    cout << "Introduce el valor del dividendo: ";
    cin >> dividendo;

    residuo = dividendo;
    ciclo = 0;

    do {
        residuo = residuo - divisor;
        ciclo = ciclo + 1;
    } while (divisor <= residuo);

    cout << "El cociente = " << ciclo << " residuo " << residuo << endl;

    return 0;
}
