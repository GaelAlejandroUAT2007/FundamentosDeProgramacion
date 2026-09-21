#include <iostream>
using namespace std;

int main() {
    double precio;
    double porcentaje;
    double descuento;
    double totalPagar;

    cout << "Ingrese el precio del producto: ";
    cin >> precio;
    cout << "Ingrese el porcentaje de descuento: ";
    cin >> porcentaje;

    descuento = precio * (porcentaje / 100);
    totalPagar = precio - descuento;

    cout << "El descuento es: " << descuento << endl;
    cout << "El total a pagar es: " << totalPagar << endl;

    return 0;
}
