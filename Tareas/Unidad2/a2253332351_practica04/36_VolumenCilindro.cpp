#include <iostream>
using namespace std;

int main() {
    double PI = 3.14159265358979323846;
    double radio;
    double altura;
    double aBase;
    double aLateral;
    double aTotal;
    double volumen;

    cout << "Ingrese el radio del cilindro: ";
    cin >> radio;
    cout << "Ingrese la altura del cilindro: ";
    cin >> altura;

    aBase = PI * (radio * radio);
    aLateral = 2 * PI * radio * altura;
    aTotal = aLateral + (2 * aBase);
    volumen = aBase * altura;

    cout << "El área de la base es: " << aBase << endl;
    cout << "El área lateral es: " << aLateral << endl;
    cout << "El área total es: " << aTotal << endl;
    cout << "El volumen del cilindro es: " << volumen << endl;

    return 0;
}
