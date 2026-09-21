#include <iostream>
using namespace std;

int main() {
    double perimetro;
    double apotema;
    double altura;
    double aBase;
    double aLado;
    double aTotal;
    double volumen;

    cout << "Ingresa el perimetro de la Base: ";
    cin >> perimetro;
    cout << "Ingresa la apotema: ";
    cin >> apotema;
    cout << "Ingresa la altura: ";
    cin >> altura;

    aBase = (perimetro * apotema) / 2;
    aLado = perimetro * altura;
    aTotal = (2 * aBase) + aLado;
    volumen = aBase * altura;

    cout << "El área de la base es: " << aBase << endl;
    cout << "El área lateral es: " << aLado << endl;
    cout << "El área total es: " << aTotal << endl;
    cout << "El volumen del prisma pentagonal es: " << volumen << endl;

    return 0;
}
