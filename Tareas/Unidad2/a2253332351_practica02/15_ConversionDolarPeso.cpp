#include <iostream>
using namespace std;

int main() {
    double dolares;
    double tipoCambio;
    double pesos;

    cout << "Ingrese la cantidad en dólares: ";
    cin >> dolares;
    cout << "Ingrese el tipo de cambio: ";
    cin >> tipoCambio;

    pesos = dolares * tipoCambio;

    cout << "La cantidad equivalente en pesos es: " << pesos << endl;

    return 0;
}
