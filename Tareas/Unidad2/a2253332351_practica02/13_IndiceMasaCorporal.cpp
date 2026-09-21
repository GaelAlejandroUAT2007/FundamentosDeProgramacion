#include <iostream>
using namespace std;

int main() {
    double peso;
    double estatura;
    double imc;

    cout << "Ingrese el peso en kilogramos: ";
    cin >> peso;
    cout << "Ingrese la estatura en metros: ";
    cin >> estatura;

    imc = peso / (estatura * estatura);

    cout << "El índice de masa corporal es: " << imc << endl;

    return 0;
}
