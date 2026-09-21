#include <iostream>
using namespace std;

int main() {
    double nota1;
    double nota2;
    double nota3;
    double promedio;

    cout << "Ingrese la primera calificación: ";
    cin >> nota1;
    cout << "Ingrese la segunda calificación: ";
    cin >> nota2;
    cout << "Ingrese la tercera calificación: ";
    cin >> nota3;

    promedio = (nota1 + nota2 + nota3) / 3;

    cout << "El promedio es: " << promedio << endl;

    return 0;
}
