#include <iostream>
using namespace std;

int main() {
    double PI = 3.14159265358979323846;
    double radio;
    double area;
    double volumen;

    cout << "Introduzca el valor del radio: ";
    cin >> radio;

    area = (4 * PI) * (radio * radio);
    volumen = ((4 * PI) * ((radio * radio) * radio)) / 3;

    cout << "El área de la esfera es: " << area << endl;
    cout << "El volumen de la esfera es: " << volumen << endl;

    return 0;
}
