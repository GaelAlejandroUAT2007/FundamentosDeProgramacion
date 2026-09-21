#include <iostream>
using namespace std;

int main() {
    double capital;
    double tasa;
    double tiempo;
    double interes;
    double monto;

    cout << "Ingrese el capital inicial: ";
    cin >> capital;
    cout << "Ingrese la tasa de interés anual (%): ";
    cin >> tasa;
    cout << "Ingrese el tiempo en años: ";
    cin >> tiempo;

    interes = (capital * tasa * tiempo) / 100;
    monto = capital + interes;

    cout << "El interés generado es: " << interes << endl;
    cout << "El monto final es: " << monto << endl;

    return 0;
}
