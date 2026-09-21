#include <iostream>
using namespace std;

int main() {
    double dias;
    double segundos;

    cout << "Ingrese los días: ";
    cin >> dias;

    segundos = dias * 24 * 60 * 60;

    cout << "Los días: " << dias << endl;
    cout << "Son equivalentes a: " << segundos << " segundos." << endl;

    return 0;
}
