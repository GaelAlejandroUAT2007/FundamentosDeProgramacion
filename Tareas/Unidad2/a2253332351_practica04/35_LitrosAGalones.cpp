#include <iostream>
using namespace std;

int main() {
    double litros;
    double galones;

    cout << "Ingrese la cantidad de litros: ";
    cin >> litros;

    galones = litros * 0.264172;

    cout << "La cantidad equivalente en galones es: " << galones << endl;

    return 0;
}
