#include <iostream>
using namespace std;

int main() {
    double vdolar;
    double pconvertir;
    double ndolares;

    cout << "Introduce el valor del dolar: ";
    cin >> vdolar;
    cout << "Cuantos pesos vas a convertir: ";
    cin >> pconvertir;

    ndolares = pconvertir / vdolar;

    cout << pconvertir << " pesos son " << ndolares << " dolares" << endl;

    return 0;
}
