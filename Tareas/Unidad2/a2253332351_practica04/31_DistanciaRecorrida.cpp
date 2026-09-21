#include <iostream>
using namespace std;

int main() {
    double velocidad;
    double tiempo;
    double distancia;

    cout << "Introduce la velocidad promedio en km/h: ";
    cin >> velocidad;
    cout << "Introduce el tiempo del recorrido en horas: ";
    cin >> tiempo;

    distancia = velocidad * tiempo;

    cout << "La distancia recorrida fue " << distancia << " km" << endl;

    return 0;
}
