#include <iostream>
using namespace std;

int main() {
    double PI = 3.14159265358979323846;
    double diametro;
    double radio;
    double area;
    double circunferencia;

    cout << "Ingrese el diámetro del círculo: ";
    cin >> diametro;

    radio = diametro / 2;
    area = PI * (radio * radio);
    circunferencia = 2 * PI * radio;

    cout << "El radio es: " << radio << endl;
    cout << "El área es: " << area << endl;
    cout << "La circunferencia es: " << circunferencia << endl;

    return 0;
}
