#include <iostream>
using namespace std;

int main() {
    double capital;
    double interes;
    double monto;

    cout << "Ingrese el capital: ";
    cin >> capital;
    cout << "Ingrese la tasa de interés: ";
    cin >> interes;

    monto = capital * (1 + (interes / 100));

    cout << "El monto es: " << monto << endl;

    return 0;
}
