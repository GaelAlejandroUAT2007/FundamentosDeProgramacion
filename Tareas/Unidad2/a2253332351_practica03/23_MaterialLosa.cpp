#include <iostream>
using namespace std;

int main() {
    double x;
    double y;
    double n;
    double volumenLosa;
    double volCemento;
    double volArena;
    double volGrava;
    double volAgua;

    cout << "Introduce la longitud de la losa (X) en metros: ";
    cin >> x;
    cout << "Introduce el ancho de la losa (Y) en metros: ";
    cin >> y;
    cout << "Introduce el espesor de la losa (N) en metros: ";
    cin >> n;

    volumenLosa = x * y * n;
    volCemento = volumenLosa * (1.0 / 6);
    volArena = volumenLosa * (2.0 / 6);
    volGrava = volumenLosa * (3.0 / 6);
    volAgua = volCemento * 0.5;

    cout << "El volumen de la losa es: " << volumenLosa << " m3" << endl;
    cout << "Cemento necesario: " << volCemento << " m3" << endl;
    cout << "Arena necesaria: " << volArena << " m3" << endl;
    cout << "Grava necesaria: " << volGrava << " m3" << endl;
    cout << "Agua necesaria: " << volAgua << " m3" << endl;

    return 0;
}
