#include <iostream>
using namespace std;

int main() {
    double kilometros;
    double millas;

    cout << "Ingrese la distancia en kilómetros: ";
    cin >> kilometros;

    millas = kilometros * 0.621371;

    cout << "La distancia equivalente en millas es: " << millas << endl;

    return 0;
}
