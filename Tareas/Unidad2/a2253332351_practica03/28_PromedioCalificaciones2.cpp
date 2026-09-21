#include <iostream>
using namespace std;

int main() {
    int c1;
    int c2;
    int c3;
    double promedio;

    cout << "Introduce la calificacion 1: ";
    cin >> c1;
    cout << "Introduce la calificacion 2: ";
    cin >> c2;
    cout << "Introduce la calificacion 3: ";
    cin >> c3;

    promedio = (c1 + c2 + c3) / 3.0;

    cout << "El promedio es = " << promedio << endl;

    return 0;
}
