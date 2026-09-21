#include <iostream>
using namespace std;

int main() {
    double distancia;
    double tiempo;
    double velocidad;

    cout << "Ingrese la distancia recorrida en km: ";
    cin >> distancia;
    cout << "Ingrese el tiempo empleado en horas: ";
    cin >> tiempo;

    velocidad = distancia / tiempo;

    cout << "La velocidad promedio es: " << velocidad << endl;

    return 0;
}
