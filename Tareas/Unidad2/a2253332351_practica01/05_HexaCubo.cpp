#include <iostream>
using namespace std;

int main() {
    double lado;
    double aBase;
    double aLado;
    double aTotal;
    double volumen;

    cout << "Ingrese el valor del lado del Hexaedro o Cubo: ";
    cin >> lado;

    aBase = lado * lado;
    aLado = 4 * (lado * lado);
    aTotal = 6 * lado * lado;
    volumen = lado * lado * lado;

    cout << "El Área de la Base es: " << aBase << endl;
    cout << "El Área Lateral es: " << aLado << endl;
    cout << "El Área Total es: " << aTotal << endl;
    cout << "El Volumen es: " << volumen << endl;

    return 0;
}
