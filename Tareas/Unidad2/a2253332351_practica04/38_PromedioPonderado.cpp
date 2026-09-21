#include <iostream>
using namespace std;

int main() {
    double peso1 = 0.4;
    double peso2 = 0.6;
    double nota1;
    double nota2;
    double promedio;

    cout << "Ingrese la primera calificación (peso 40%): ";
    cin >> nota1;
    cout << "Ingrese la segunda calificación (peso 60%): ";
    cin >> nota2;

    promedio = (nota1 * peso1) + (nota2 * peso2);

    cout << "El promedio ponderado es: " << promedio << endl;

    return 0;
}
