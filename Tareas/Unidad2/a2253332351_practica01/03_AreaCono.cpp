#include <iostream>
using namespace std;

int main() {
    double PI = 3.14159265358979323846;
    double radio;
    double generatriz;
    double altura;
    double aBase;
    double aLado;
    double aTotal;
    double volumen;

    cout << "Ingresa el radio del cono: ";
    cin >> radio;
    cout << "Ingresa la generatriz del cono: ";
    cin >> generatriz;
    cout << "Ingresa la altura del cono: ";
    cin >> altura;

    aBase = PI * (radio * radio);
    aLado = PI * radio * generatriz;
    aTotal = aBase + aLado;
    volumen = (aBase * altura) / 3;

    cout << "El área de la base es: " << aBase << endl;
    cout << "El área lateral es: " << aLado << endl;
    cout << "El área total es: " << aTotal << endl;
    cout << "El volumen es: " << volumen << endl;

    return 0;
}
