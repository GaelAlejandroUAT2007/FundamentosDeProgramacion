#include <iostream>
using namespace std;

int main() {
    double metros = 0.5;
    double largo;
    double ancho;
    double arena;

    cout << "Ingrese el largo de la pared en metros: ";
    cin >> largo;
    cout << "Ingrese el ancho de la pared en metros: ";
    cin >> ancho;

    arena = largo * ancho * metros;

    cout << "La cantidad de arena necesaria es de: " << arena << endl;

    return 0;
}
