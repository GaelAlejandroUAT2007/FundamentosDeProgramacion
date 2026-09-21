#include <iostream>
using namespace std;

int main() {
    double perimetro;
    double apotema;
    double altura;
    double aBase;
    double aLateral;
    double aTotal;

    cout << "Ingresa el perimetro de la Base: ";
    cin >> perimetro;
    cout << "Ingresa la apotema: ";
    cin >> apotema;
    cout << "Ingresa la altura: ";
    cin >> altura;

    aBase = (perimetro * apotema) / 2;
    aLateral = (perimetro * altura) / 2;
    aTotal = (2 * aBase) + aLateral;

    cout << "El área de la base es: " << aBase << endl;
    cout << "El área lateral es: " << aLateral << endl;
    cout << "El área total es: " << aTotal << endl;

    return 0;
}
