#include <iostream>
using namespace std;

int main() {
    double interes = 0.02;
    double capital;
    int dias;
    double ganancia;

    cout << "Ingrese el monto a invertir: ";
    cin >> capital;
    cout << "Ingrese el número de días del mes: ";
    cin >> dias;

    ganancia = capital * dias * interes;

    cout << "La ganancia es: " << ganancia << endl;

    return 0;
}
