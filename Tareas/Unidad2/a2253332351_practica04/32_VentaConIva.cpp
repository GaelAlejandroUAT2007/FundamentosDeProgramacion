#include <iostream>
using namespace std;

int main() {
    int cantidad;
    double precioUnitario;
    double subtotal;
    double iva;
    double total;

    cout << "Cantidad vendida: ";
    cin >> cantidad;
    cout << "Precio unitario: ";
    cin >> precioUnitario;

    subtotal = cantidad * precioUnitario;
    iva = subtotal * 0.16;
    total = subtotal + iva;

    cout << "El subtotal es: " << subtotal << endl;
    cout << "El iva es: " << iva << endl;
    cout << "El total es: " << total << endl;

    return 0;
}
