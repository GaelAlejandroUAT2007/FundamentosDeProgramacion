#include <iostream>
using namespace std;

int main() {
    double consumo;
    double porcentajePropina;
    double propina;
    double total;

    cout << "Ingrese el consumo: ";
    cin >> consumo;
    cout << "Ingrese el porcentaje de propina: ";
    cin >> porcentajePropina;

    propina = consumo * (porcentajePropina / 100);
    total = consumo + propina;

    cout << "La propina es: " << propina << endl;
    cout << "El total a pagar es: " << total << endl;

    return 0;
}
